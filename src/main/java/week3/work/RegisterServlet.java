package week3.work;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class RegisterServlet extends HttpServlet {
    public RegisterServlet(){
        System.out.println("1");
    }

    @Override
    public void init(){
        System.out.println("2");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws SecurityException, IOException{

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws SecurityException, IOException{

        String username =request.getParameter("username");
        String password =request.getParameter("password");
        String email =request.getParameter("email");
        String gender =request.getParameter("gender");
        String birthDate =request.getParameter("birthDate");

        PrintWriter writer = response.getWriter();
        writer.println("<br> username :"+username);
        writer.println("<br> password :"+password);
        writer.println("<br> email :"+email);
        writer.println("<br> gender :"+gender);
        writer.println("<br> birthDate :"+birthDate);
        writer.close();

    }

    @Override
    public void destroy(){
        System.out.println("4");
    }

}
