package org.dows.oss.entity;

import com.mybatisflex.annotation.Table;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.dows.rade.crud.CrudEntity;

import java.time.LocalDateTime;
import java.math.BigDecimal;

@Data
@EqualsAndHashCode(callSuper = true)
@Table("oss_bucket")
public class OssBucketEntity extends CrudEntity<OssBucketEntity> {

    @Schema(title = "存储空间ID")
    private Long ossBucketId;
    @Schema(title = "账号标识ID")
    private Long ossIdentifierId;
    @Schema(title = "区域")
    private String region;
    @Schema(title = "桶名称")
    private String bucketName;
    @Schema(title = "目录数")
    private Integer folderCount;
    @Schema(title = "文件数")
    private Integer fileCount;
    @Schema(title = "当前桶大小")
    private Integer currentSize;
    @Schema(title = "版本号")
    private Integer revision;
    @Schema(title = "应用id")
    private String appId;
    @Schema(title = "时间戳")
    private LocalDateTime createTime;
    @Schema(title = "更新时间")
    private LocalDateTime updateTime;
    @Schema(title = "删除时间")
    private LocalDateTime deleteTime;
    @Schema(title = "创建者ID")
    private Long createId;
    @Schema(title = "更新者ID")
    private Long updateId;
}