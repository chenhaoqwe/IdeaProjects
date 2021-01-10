package 酒店系统;

public class Room {
    //酒店编号
    private int no;
    //酒店的房间类型：标准间  单人间 豪华间
    private String name;
    //酒店的状态：空闲，占有
    private boolean type;

    public Room(int no, String name, boolean type) {
        this.no = no;
        this.name = name;
        this.type = type;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }
    public boolean equals(Object obj){
        if (obj==null || !(obj instanceof Room)){
            return false;
        }
        if (this==obj){
            return true;
        }
        Room room=(Room) obj;
        if (this.getNo()==room.getNo()){
            return true;
        }
        return false;


    }
    public String toString() {
        return "["+no+","+name+","+(type?"空闲":"占用")+"]";
    }

}
