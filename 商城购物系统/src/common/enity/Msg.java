package common.enity;

/**
 * 消息封装类
 */
public class Msg {
    //消息类型成功
    public static final String SUCCESS="SUCCESS";
    //消息类型失败
    public static final String FAIL="FAIL";

    private String msg;//消息类容

    private String type;//消息类型

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
