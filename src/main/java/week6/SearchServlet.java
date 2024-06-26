package week6;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/search")
public class SearchServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String txt = request.getParameter("txt");
        String search = request.getParameter("search");
        if (txt.equals("")) {
            response.sendRedirect("index.jsp");
        } else {
            if ("baidu".equals(search)) {
                response.sendRedirect("https://www.baidu.com/s?wd=" + txt);
            } else if ("bing".equals(search)) {
                response.sendRedirect("https://cn.bing.com/search?q=" + txt);
            } else if ("google".equals(search)) {
                response.sendRedirect("https://www.google.com/search?q=" + txt);
            }
        }
    }
}

