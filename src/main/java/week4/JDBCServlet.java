package week4;


import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCServlet extends HttpServlet {
    Connection connection = null;
    @Override
    public void init() throws ServletException {
//        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
//        String url = "jdbc:sqlserver://localhost;databaseName=userdb";
//        String username = "sa";
//        String password = "12345678";

        ServletConfig config = getServletConfig();
        String driver = config.getInitParameter("driver");
        String url = config.getInitParameter("url");
        String username = config.getInitParameter("username");
        String password = config.getInitParameter("password");
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url,username,password);
            System.out.println(connection);;
        }catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException {

        System.out.println(connection);;
        String sql = "select * from USER_table";
        try {
            ResultSet rs = connection.createStatement().executeQuery(sql);
            while (rs.next()){

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    @Override
    public void destroy() {
        super.destroy();
        try {
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
