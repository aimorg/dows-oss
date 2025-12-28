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
@Schema(description = "GetOssIdentifierPageResponse 对象")
public class GetOssIdentifierPageResponse {

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

    @Schema(description = "版本号")
    private Integer revision;

    @Schema(description = "应用id")
    private String app_id;

    @Schema(description = "时间戳")
    private LocalDateTime createTime;

    @Schema(description = "更新时间")
    private LocalDateTime updateTime;

    @Schema(description = "删除时间")
    private LocalDateTime deleteTime;

    @Schema(description = "创建者ID")
    private Long createId;

    @Schema(description = "更新者ID")
    private Long updateId;

}