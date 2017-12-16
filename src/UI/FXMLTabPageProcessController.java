/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author AnyUser
 */
public class FXMLTabPageProcessController implements Initializable {

    @FXML
    private TextField bookUUIDorHumanyCode;
    @FXML
    private TextField shipId;
    @FXML
    private TextField voyageNumber;
    @FXML
    private TextArea tempTitle;
    @FXML
    private TextArea comment;
    @FXML
    private ComboBox<?> divisionByDataAndTime;
    @FXML
    private Label shipTitle;
    @FXML
    private Label subTitle;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
