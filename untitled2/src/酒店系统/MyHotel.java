package 酒店系统;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class MyHotel {
    public static void main(String[] args) {
        //创建酒店
        Hotel h1 = new Hotel( );
        System.out.println("欢迎使用酒店管理系统，请认真阅读以下使用说明");
        System.out.println("请输入对应的功能编号，1.查看房间   2.表示订阅  3.表示退房  4.表示退出 ");
        Scanner s = new Scanner(System.in);
        int i = s.nextInt( );
        //查看房间列表
        while (true) {
            if (i == 1) {
                h1.print( );
                return;
            }
            //订房
            else if (i == 2) {
                System.out.println("请输入订房编号");
                int roomNo = s.nextInt( );//小姐姐输入房间编号
                h1.order(roomNo);

            } else if (i == 3) {
                System.out.println("请输入房间编号");
                int roomNo = s.nextInt( );
                h1.exit(roomNo);

            } else {
                System.out.println("你已经退出");

            }


        }
    }
}
