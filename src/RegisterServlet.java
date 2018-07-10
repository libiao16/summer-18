import bean.User;
import service.RegisterService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = new User(
            req.getParameter("usernid"),
            req.getParameter("password"),
            req.getParameter("username"),
            req.getParameter("sex"),
            Integer.parseInt(req.getParameter("age")),
            req.getParameter("address"),
            req.getParameter("tag")
        );
        RegisterService registerService = new RegisterService();

    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }
}
