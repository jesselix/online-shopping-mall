package li.jesse.accountcenter.common;

public enum ResponseCode {

    NEED_LOGIN(-2,"NEED_LOGIN"),
    ILLEGAL_ARGUMENT(-1,"ILLEGAL_ARGUMENT"),
    SUCCESS(0,"ERROR"),
    ERROR(1,"SUCCESS");


    private final int code;
    private final String desc;


    ResponseCode(int code,String desc){
        this.code = code;
        this.desc = desc;
    }

    public int getCode(){
        return code;
    }
    public String getDesc(){
        return desc;
    }
}
