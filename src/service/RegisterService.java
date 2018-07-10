package service;

import util.JdbcCRUDByStatement;

public class RegisterService {
    public static int registerUser(String usernid, String password, String username, String sex, int age, String address, String tag)
    {
        JdbcCRUDByStatement userJDBC = new JdbcCRUDByStatement("jdbc:mysql://localhost:3306/summer","root","libiao1998");
        userJDBC.insert("insert into user values(null,'biaodidi', 'libiao', 'libiao', 'male', 3 ,'didi', '红珍姐的爹') ");
        return 1;
    }
}
