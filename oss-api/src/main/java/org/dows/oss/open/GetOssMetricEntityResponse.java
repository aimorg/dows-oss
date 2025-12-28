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
@Schema(description = "GetOssMetricEntityResponse 对象")
public class GetOssMetricEntityResponse {

    @Schema(description = "统计ID")
    private Long ossMetricId;

    @Schema(description = "文件ID")
    private Long ossFileId;

    @Schema(description = "统计类型(0:pv,1:uv,2:播放,3:收藏，4：下载)")
    private Integer type;

    @Schema(description = "数量")
    private Long count;

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