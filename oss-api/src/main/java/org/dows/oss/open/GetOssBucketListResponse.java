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
@Schema(description = "GetOssBucketListResponse 对象")
public class GetOssBucketListResponse {

    @Schema(description = "存储空间ID")
    private Long ossBucketId;

    @Schema(description = "账号标识ID")
    private Long ossIdentifierId;

    @Schema(description = "区域")
    private String region;

    @Schema(description = "桶名称")
    private String bucketName;

    @Schema(description = "目录数")
    private Integer folderCount;

    @Schema(description = "文件数")
    private Integer fileCount;

    @Schema(description = "当前桶大小")
    private Integer currentSize;

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