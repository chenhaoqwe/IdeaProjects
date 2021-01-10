package Client;

import User.UserAction;

import java.util.Scanner;

/*
用户类 凡是用户操作的都在这里
 */
public class UserClient extends Client {
    /**
     * 用户登录操作界面
     * @return
     */
    public  String showLogin(){
        //使用控制台输入用户和姓名
        Scanner scanner=new Scanner(System.in);
        System.out.println("请你输入用户名" );
        String username=scanner.nextLine();
        System.out.println("请你输入用户密码" );
        String password=scanner.nextLine();

        //向服务器发请求
        UserAction userAction=new UserAction();
        userAction.setUsername(username);
        userAction.setPassword(password);
        //调用登录功能
        String result=userAction.login();

        //解析消息字符串 提示用户信息
        

    }
}
