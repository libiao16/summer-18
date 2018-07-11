package util;

import bean.User;

import java.sql.*;

//import org.junit.Test;


/**
 * @ClassName:  JdbcCRUDByStatement
 * @Description: 通过Statement对象完成对数据库的CRUD操作
 * @author: 段景海
 * @date: 2014-9-15 下午11:22:12
 *
 */
public class JdbcCRUDByStatement {
    Connection connection;
    public JdbcCRUDByStatement(String URL,String UserName,String PassWord){
        String url = URL;
        //连接的数据库时使用的用户名
        String username = UserName;
        //连接的数据库时使用的密码
        String password = PassWord;
        try {
            //1.加载驱动
            Class.forName("com.mysql.jdbc.Driver");//推荐使用这种方式来加载驱动
            //2.获取与数据库的链接
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
//    @Test
    public void insert(String insert_sql){
        Connection conn = connection;
        Statement st = null;
        ResultSet rs = null;
        try{
            //通过conn对象获取负责执行SQL命令的Statement对象
            st = conn.createStatement();
            //要执行的SQL命令
            String sql = insert_sql;
            //执行插入操作，executeUpdate方法返回成功的条数
            int num = st.executeUpdate(sql);
            if(num>0){
                System.out.println("插入成功！！");
            }
            conn.close();
            st.close();
//            rs.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
//    @Test
    public void delete(String delete_sql){
        Connection conn = connection;
        Statement st = null;
        ResultSet rs = null;
        try{
            String sql = delete_sql;
            st = conn.createStatement();
            int num = st.executeUpdate(sql);
            if(num>0){
                System.out.println("删除成功！！");
            }
            conn.close();
            st.close();
            rs.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
//    @Test
    public void update(String update_sql){
        Connection conn = connection;
        Statement st = null;
        ResultSet rs = null;
        try{
            String sql = update_sql;
            st = conn.createStatement();
            int num = st.executeUpdate(sql);
            if(num>0){
                System.out.println("更新成功！！");
            }
            conn.close();
            st.close();
            rs.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
//    @Test
    public User queryForUser(String find_sql){
        Connection conn = connection;
        Statement st = null;
        ResultSet rs = null;
        User user = null;
        try{
            String sql = find_sql;
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                user = new User((String)rs.getObject("usernid"),
                        (String)rs.getObject("password"),
                        (String)rs.getObject("username"),
                        (String)rs.getObject("sex"),
                        (int)rs.getObject("age"),
                        (String)rs.getObject("address"),
                        (String)rs.getObject("tag"));
            }
            conn.close();
            st.close();
            rs.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
}