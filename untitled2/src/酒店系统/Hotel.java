package 酒店系统;

public class Hotel {
    /*
    酒店中有二维数组，模拟大厦
     */
    private Room[][] rooms;

    public Hotel() {
        //一共有几层，我们每个房间的编号是什么
        rooms=new Room[3][10];
        for (int i=0;i<rooms.length;i++){
            for (int j=0;j<rooms[i].length;j++){
                //一层
                if (i==0) rooms[i][j]=new Room((i+1)*100+j+1,"单人间",true);
                //两层
                else if (i==1){
                    rooms[i][j]=new Room((i+1)*100+j+1,"标准间",true);
                }
                //三层
                else if (i==2){
                    rooms[i][j]=new Room((i+1)*100+j+1,"豪华间",true);
                }
            }
        }
    }
    public void print() {
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                Room room=rooms[i][j];
                System.out.println( room);
            }
            System.out.println(  );
        }
    }
    /*
    订房方法
    roomNo,调用此方法时需要传递一个房间编号过来
     */
    public void order(int roomNo)
    {
        Room room=rooms[roomNo/100-1][roomNo%100-1];
       room.setType(false);
       System.out.println( "你已经定好房间为"+roomNo );
    }
    public void exit(int roomNo)
    {
        Room room=rooms[roomNo/100-1][roomNo%100-1];
        room.setType(true);
        System.out.println( "你已经退好房间为"+roomNo );

    }
}
