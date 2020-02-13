package li.jesse.shoppingmallaccount.common;

import java.io.Serializable;

public class ServerResponse<T> implements Serializable {

    private int status;
    private String msg;
    private T data;

    public ServerResponse(byte status) {
        this.status = status;
    }

    public boolean isSuccessful() {
        return this.status == ResponseCode.SUCCESS.getCode();
    }
}
