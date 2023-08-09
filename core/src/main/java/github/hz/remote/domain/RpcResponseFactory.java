package github.hz.remote.domain;

public class RpcResponseFactory {

    public static <T> RpcResponse<T> getSuccessResponse(T data, String requestId) {
        RpcResponse.RpcResponseBuilder<T> responseBuilder = RpcResponse.builder();
        responseBuilder
                .responseCode(RpcResponseCodeEnum.SUCCESS.getCode())
                .message(RpcResponseCodeEnum.SUCCESS.getMessage())
                .requestId(requestId);

        if (data != null) responseBuilder.data(data);

        return responseBuilder.build();
    }

    public static <T> RpcResponse<T> getFailResponse(RpcResponseCodeEnum failCode) {
        return RpcResponse.<T>builder()
                .responseCode(failCode.getCode())
                .message(failCode.getMessage())
                .build();
    }

}
