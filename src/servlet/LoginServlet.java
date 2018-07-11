package servlet;

import bean.User;
import service.LoginService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");    //设置响应的字符集格式为UTF-8
        resp.setContentType("text/html");  //设置响应正文的MIME类型
        PrintWriter out = resp.getWriter();
        out.println("success");
        User user = LoginService.queryForUserInDB(req.getParameter("usernid"),
                req.getParameter("password"));
        HttpSession session = req.getSession();
        session.setAttribute("username", user.getUsername());
    }

}
