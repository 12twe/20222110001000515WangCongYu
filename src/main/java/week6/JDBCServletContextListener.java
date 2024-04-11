package week6;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
@WebListener
public class JDBCServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce){
        ServletContext context = sce.getServletContext();
        String driver = context.getInitParameter("driver");
        String url = context.getInitParameter("url");
        String username = context.getInitParameter("username");
        String password = context.getInitParameter("password");
        try {
            Class.forName(driver);
            Connection connection = DriverManager.getConnection(url,username,password);
            System.out.println(connection);
            context.setAttribute("connection",connection);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void contextDestroyed(ServletContextEvent sce){
        System.out.println("2");
        sce.getServletContext().removeAttribute("connection");
    }
}

