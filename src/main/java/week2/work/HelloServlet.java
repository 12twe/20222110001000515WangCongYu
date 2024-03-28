package week2.work;

import jdk.nashorn.api.scripting.ScriptUtils;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws IOException {
        PrintWriter writer = response.getWriter();
        writer.println("Name:Wang CongYu");
        writer.println("ID:2022211001000515");
        writer.println(new Date());

    }



        public void doPost(HttpServletRequest request, HttpServletResponse response){

    }
}
