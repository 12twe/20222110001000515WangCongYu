package week4;
import java.sql.*;

public class TestConnection {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

        // 使用我自己的数据库 test
        String url = "jdbc:sqlserver://localhost;databaseName=userdb";

        // 数据库的用户名和密码
        String username = "sa";
        String password = "12345678";


        Connection connection = DriverManager.getConnection(url, username, password);


        Statement statement = connection.createStatement();

        // SQL语句，使用我自己的test数据库下的 boss 表
        String sql = "SELECT * FROM USER_table";

        ResultSet resultSet = statement.executeQuery(sql);

        // 需要与自己的数据库里的表结构相对应
        while (resultSet.next()) {
            System.out.println("id： " + resultSet.getObject("id"));
            System.out.println("username： " + resultSet.getObject("username"));

        }
        System.out.println(connection);

        resultSet.close();
        statement.close();
        connection.close();
    }
}
