package hello.servlet.basic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="helloServlet", urlPatterns = "/hello")    //참고! name 과 urlPatterns는 겹치면 안됨!
public class HelloServlet extends HttpServlet {    // 서블릿은 httpservlet을 상속 받음


    // control + o 자물쇠있는아이콘 -> protected
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        super.service(req, resp);
        System.out.println("HelloServlet.service");
        System.out.println("request = " + request);
        System.out.println("response = " + response);

        String username = request.getParameter("username");
        System.out.println("username = " + username);

        response.setContentType("text/plain");  //이것들은 메시지헤더에 들어가고
        response.setCharacterEncoding("utf-8");
        response.getWriter().write("hello " + username);    //메시지 바디에 들어감
    }
}
