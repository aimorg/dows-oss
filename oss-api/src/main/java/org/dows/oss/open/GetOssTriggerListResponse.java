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
@Schema(description = "GetOssTriggerListResponse 对象")
public class GetOssTriggerListResponse {

    @Schema(description = "触发ID")
    private Long ossTriggerId;

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