package github.hz.remote.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum RpcResponseCodeEnum {

    SUCCESS(200, "Success."),
    FAIL(500, "Internal Failure. Please try again later.");

    private Integer code;
    private String message;

}
