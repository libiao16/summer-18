package service;

import bean.User;
import util.JdbcCRUDByStatement;

public class LoginService {

    public static User queryForUserInDB(String usernid, String password){
        JdbcCRUDByStatement userJDBC = new JdbcCRUDByStatement("jdbc:mysql://localhost:3306/summer","root","hzj19980825");
        User user = null;
        user = userJDBC.queryForUser("select * from user where usernid="+
                            "'"+usernid+"';");
        if (!password.equals(user.getPassword())){
            return null;
        } else {
            return user;
        }
    }

}
