/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

/**
 *
 * @author tokyo
 */
public class SampleDAO {
    /*
     public List<OrdersDTO> findAll() {
    // DTOクラスのインスタンス格納用
    List<OrdersDTO> ordersDTO = new ArrayList<>();
 
    // JDBCドライバ読み込み
    try {
      // PostgreSQLドライバの読み込み
      Class.forName("org.postgresql.Driver");
    } catch(ClassNotFoundException e) {
      e.printStackTrace();
    }
 
    // データベースへの接続
    try(Connection conn = DriverManager.getConnection(
        "jdbc:postgresql:java_postgre",
        "postgres",
        "ts0818"
    );) {
        // sql文を実行するためのオブジェクト生成
      Statement stmt = conn.createStatement();
    // SELECT文の発行
      String sql = "SELECT * FROM orders";
      // sql文の実行結果を取得（データベースからの値）
      ResultSet rset = stmt.executeQuery(sql);
 
      // データベースから取得した値がある間、
      while(rset.next()) {
        // OrdersDTOクラスのインスタンスを生成
        OrdersDTO dto = new OrdersDTO();
        // カラムorder_idの値をフィールドorder_idにセット
        dto.setOrder_id(rset.getInt("order_id"));
        // カラムorder_dateの値をフィールドorder_dateにセット
        dto.setOrder_date(rset.getDate("order_date"));
        // カラムclientの値をフィールドclientにセット
        dto.setClient(rset.getString("Client"));
        // カラムorder_countの値をフィールドorder_countにセット
        dto.setOrder_count(rset.getInt("order_count"));
        // インスタンスをListに格納
        ordersDTO.add(dto);
        // while文で次のレコードの処理へ?
      }
    } catch(SQLException e) {
      e.printStackTrace();
    }
    // DTOクラスのインスタンスのListを返す
    return ordersDTO;
  }
*/
}
