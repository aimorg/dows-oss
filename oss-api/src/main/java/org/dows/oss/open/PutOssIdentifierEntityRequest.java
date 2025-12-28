package org.dows.oss.open;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotNull;

import java.util.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Schema(description = "PutOssIdentifierEntityRequest 对象")
public class PutOssIdentifierEntityRequest {

    @Schema(description = "账号标识ID")
    private Long ossIdentifierId;

    @Schema(description = "账号实例ID")
    private Long accountInstanceId;

    @Schema(description = "密钥ID")
    private String secretId;

    @Schema(description = "密钥KEY")
    private String secretKey;

    @Schema(description = "存储通道[cos,oss,qiniu]")
    private String channel;

    @Schema(description = "第三方存储JSON配置")
    private String configJson;

    @Schema(description = "是否启用")
    private Boolean disable;

}