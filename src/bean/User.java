package bean;

public class User {

    private String usernid;
    private String password;
    private String username;
    private String sex;
    private int age;
    private String address;
    private String tag;

    public User(String usernid, String password, String username, String sex, int age, String address, String tag) {
        this.usernid = usernid;
        this.password = password;
        this.username = username;
        this.sex = sex;
        this.age = age;
        this.address = address;
        this.tag = tag;
    }

    public User(){
        this.usernid = null;
        this.password = null;
        this.username = null;
        this.sex = null;
        this.age = 0;
        this.address = null;
        this.tag = null;
    }

    public String getUsernid() {
        return usernid;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getTag() {
        return tag;
    }

    @Override
    public String toString() {
        return "User{" +
                "usernid='" + usernid + '\'' +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", tag='" + tag + '\'' +
                '}';
    }
}
