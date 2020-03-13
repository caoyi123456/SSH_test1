package cn.kgc.action;

import cn.kgc.pojo.Users;
import cn.kgc.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author 曹译
 * 日期：2020-03-12
 * desc：
 */
public class UserAction extends ActionSupport {

    private UserService userService;
    private List<Users> userList=new ArrayList<>();
    private Users user;
    private String name;
    private String password;

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
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

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }


    public List<Users> getUserList() {
        return userList;
    }

    public void setUserList(List<Users> userList) {
        this.userList = userList;
    }

    public String execute() throws Exception{
        if (this.getName().equals("admin") && this.getPassword().equals("123")) {
            Map session = ActionContext.getContext().getSession();
            session.put("userName",this.getName());
            return "login";
        }
        return "error";
    }

    public String findUser() {
        userList = userService.userList();
        System.out.println("集合大小："+userList.size());
        for (Users user:userList) {
            System.out.println(user.getId()+"\t"+user.getUserName());
        }
        return "success";
    }
}

