/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import static DB.DatabaseUty.URL;
import common.SystemPropertiesItem;
import java.sql.BatchUpdateException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tokyo
 */
public class ProcessDAO implements IDAO {

    public static ResultSet getResultSetByKey(String tableName, String keyName, String id) {
        String sql = "SELECT * from " + tableName + " WHERE " + keyName + " = (?);";

        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                PreparedStatement statement = connection.prepareStatement(sql);) {
            connection.setAutoCommit(false);
            statement.setString(1, id);
            statement.addBatch();
            System.out.println(statement.toString());

            ResultSet result = statement.executeQuery();
            System.out.println("検索：" + result.getFetchSize() + "件");

            try {
                connection.commit();
                System.out.println("検索成功");
                return result;
            } catch (SQLException e) {

                System.out.println("検索失敗");
                e.printStackTrace();
            }
        } catch (BatchUpdateException e) {
            System.out.println("登録失敗:すでに登録されています。");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("outer");
            e.printStackTrace();
        }
        return null;
    }

    public static List<ProcessDTO> findAll() {
        String sql = "SELECT * from process;";
        // DTOクラスのインスタンス格納用
        List<ProcessDTO> processDTO = new ArrayList<>();
        // データベースへの接続
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                PreparedStatement statement = connection.prepareStatement(sql);) {
            connection.setAutoCommit(false);
            statement.addBatch();
            ResultSet result = statement.executeQuery();
            try {
                connection.commit();
                System.out.println("検索成功");
                // データベースから取得した値がある間、
                while (result.next()) {
                    // OrdersDTOクラスのインスタンスを生成
                    ProcessDTO dto = new ProcessDTO();
                    // カラムの値をフィールドにセット
                    dto.setId(result.getString("id"));
                    dto.setDivtime(result.getTimestamp("divtime"));
                    dto.setDivname(result.getString("divname"));
                    dto.setComment(result.getString("comment"));
                    dto.setPredivtime(result.getTimestamp("predivtime"));
                    dto.setArtifactsId(result.getString("artifactsid"));
                    // インスタンスをListに格納
                    processDTO.add(dto);
                    // while文で次のレコードの処理へ
                }
            } catch (SQLException e) {
                // connection.rollback(); 
                e.printStackTrace();
                System.out.println("検索失敗");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("データべース障害");
        }
        // DTOクラスのインスタンスのListを返す
        return processDTO;
    }
}