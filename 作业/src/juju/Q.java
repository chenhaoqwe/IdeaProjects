package juju;

public class Q {
    public static void main(String[] args)
    {
        ve v=new ve();
        v.setSpeed(10);
        v.setSize(10);
        System.out.println("速度："+v.getSpeed() );
    }

}
class ve {
    private int speed;
    private int size;

    public void setSpeed(int speed) {
        this.speed = speed;

    }

    public int getSpeed() {
        return speed;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}

