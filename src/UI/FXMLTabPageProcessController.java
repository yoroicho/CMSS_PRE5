/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import DB.DatabaseUty;
import DB.ProcessDAO;
import DB.ProcessDTO;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author AnyUser
 */
public class FXMLTabPageProcessController implements Initializable {

    @FXML
    private TextField textFieldId;
    @FXML
    private TextField textFieldArtifactsId;
    @FXML
    private TextArea textAreaDivName;
    @FXML
    private TextArea textAreaComment;
    @FXML
    private ComboBox<?> comboBoxDivTime;

    private void initFocuseConditionForTask() { // 要改善最初に存在確認をしてから編集不可とすべき。
        this.textFieldId.focusedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> arg0,
                    Boolean oldPropertyValue, Boolean newPropertyValue) {
                if (newPropertyValue) {
                    //textField_SHIP_ID.setEditable(true);
                    System.out.println("Textfield on focus");
                } else {
                    //textField_SHIP_ID.setEditable(false);
                    textFieldId.setDisable(true); // 編集不可になっていることが明確。ただし文字は見にくい。
                    System.out.println("Textfield out focus");
                    /*
                    ResultSet rs = DatabaseUty.getResultSetByKey("ship", "id", textField_SHIP_ID.getText().trim());
                    try {
                        rs.next();
                        textField_SHIP_SERVICE.setText(rs.getString("SERVICE"));
                        textArea_SHIP_NAME.setText(rs.getString("NAME"));
                        textArea_SHIP_REMARK.setText(rs.getString("REMARK"));
                        flgExsistShip = true;
                    } catch (SQLException ex) {
                        Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
                        flgExsistShip = false;
                        JOptionPane.showMessageDialog(null, "新規もしくはエラーです");
                    }
                     */
                }
            }
        });
    }

    @FXML
    private void testButtonAction(ActionEvent event) {
        List<ProcessDTO> findAll = ProcessDAO.findAll();
        findAll.forEach(s -> System.out.println(s.getId() + ":"+s.getDivtime().toString()));

    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        initFocuseConditionForTask(); // 主キーを保護する為にロックするイベントを登録。
    }

}
