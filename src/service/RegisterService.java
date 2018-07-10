package service;

import bean.User;
import util.JdbcCRUDByStatement;

public class RegisterService {
    public static int registerUser(User user)
    {
        JdbcCRUDByStatement userJDBC = new JdbcCRUDByStatement("jdbc:mysql://localhost:3306/summer","root","libiao1998");
        userJDBC.insert("insert into user values(null,"+user.getUsernid()+
                ","+user.getPassword()+
                ","+user.getUsername()+
                ","+user.getSex()+
                ","+user.getAge()+
                ","+user.getAddress()+
                ","+user.getTag()+");");
        return 1;
    }
}
