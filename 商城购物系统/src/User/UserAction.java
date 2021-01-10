package User;

import common.BaseAction;

/**
 * 用户控制器类
 * 处理用户的后台操作 并且返回Json格式的字符串信息
 */
public class UserAction extends BaseAction {
    //用户名
    private String username;
    //密码
    private String password;

    public String login(){
        return "";
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
