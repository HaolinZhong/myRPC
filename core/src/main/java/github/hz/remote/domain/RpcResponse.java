package github.hz.remote.domain;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class RpcResponse<T> implements Serializable {

    private static final long serialVersionUID = 6943258476829055398L;

    private String requestId;

    private Integer responseCode;

    private String message;

    private T data;

}
