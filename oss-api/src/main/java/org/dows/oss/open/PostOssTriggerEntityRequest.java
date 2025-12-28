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
@Schema(description = "PostOssTriggerEntityRequest 对象")
public class PostOssTriggerEntityRequest {

    @Schema(description = "账号标识ID")
    private Long ossIdentifierId;

    @Schema(description = "触发器（MCP[解析、编码，OCR，发布多平台...]）")
    private String trigger;

    @Schema(description = "回调[http:")
    private String callback;

    @Schema(description = "目标")
    private String target;

    @Schema(description = "触发参数(配置{retry:3,压缩率:10,...})")
    private String configJson;

    @Schema(description = "重试次数")
    private Integer retryCount;

    @Schema(description = "顺序")
    private Integer seq;

}