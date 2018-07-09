import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class register {
    private String message;

    public int doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        //处理请求中的数据存入数据库 成功返回1失败返回0 重复返回2;
        return 0;
    }

//    public int doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
//    {
//        //处理请求中的数据存入数据库 成功返回1失败返回0 重复返回2;
//        return 0;
    //测试用的之后删掉
//    }
}
