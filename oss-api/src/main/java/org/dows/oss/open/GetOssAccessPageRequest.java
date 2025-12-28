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
@Schema(description = "GetOssAccessPageRequest 对象")
public class GetOssAccessPageRequest {

    @Schema(description = "访问账号ID")
    private Long accontInstanceId;

    @Schema(description = "文件ID")
    private Long ossFileId;

    @Schema(description = "访问过期时间")
    private LocalDateTime expireTime;

}