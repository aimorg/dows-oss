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
@Schema(description = "PutOssBucketEntityRequest 对象")
public class PutOssBucketEntityRequest {

    @Schema(description = "存储空间ID")
    private Long ossBucketId;

    @Schema(description = "账号标识ID")
    private Long ossIdentifierId;

    @Schema(description = "目录数")
    private Integer folderCount;

    @Schema(description = "文件数")
    private Integer fileCount;

    @Schema(description = "当前桶大小")
    private Integer currentSize;

}