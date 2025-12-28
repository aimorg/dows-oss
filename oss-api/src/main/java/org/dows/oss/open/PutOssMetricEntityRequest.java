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
@Schema(description = "PutOssMetricEntityRequest 对象")
public class PutOssMetricEntityRequest {

    @Schema(description = "统计ID")
    private Long ossMetricId;

    @Schema(description = "文件ID")
    private Long ossFileId;

    @Schema(description = "统计类型(0:pv,1:uv,2:播放,3:收藏，4：下载)")
    private Integer type;

    @Schema(description = "数量")
    private Long count;

}