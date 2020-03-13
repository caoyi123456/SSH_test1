package cn.kgc.pojo;

/**
 * @author 曹译
 * 日期：2020-03-04
 * desc：
 */
public class Users {
    private  Integer id;
    private  String name;
    private String password;
    private String phone;
    private String userName;
    private String isAdmin;

    public Users() {
    }

    public Users(Integer id, String name, String password, String phone, String userName, String isAdmin) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.phone = phone;
        this.userName = userName;
        this.isAdmin = isAdmin;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(String isAdmin) {
        this.isAdmin = isAdmin;
    }
}
