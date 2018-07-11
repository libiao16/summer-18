package servlet;

import bean.User;
import service.RegisterService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setCharacterEncoding("UTF-8");    //设置响应的字符集格式为UTF-8
        resp.setContentType("text/html");  //设置响应正文的MIME类型
        PrintWriter out = resp.getWriter();
        out.println("success");
//        req.getRequestDispatcher("/index.jsp").forward(req, resp);
        User user = new User(
            req.getParameter("usernid"),
            req.getParameter("password"),
            req.getParameter("username"),
            req.getParameter("sex"),
            Integer.parseInt(req.getParameter("age")),
            req.getParameter("address"),
            req.getParameter("tag")
        );
        RegisterService.registerUserInDB(user);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
