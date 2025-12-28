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
@Table("oss_file")
public class OssFileEntity extends CrudEntity<OssFileEntity> {

    @Schema(title = "文件ID")
    private Long ossFileId;
    @Schema(title = "存储空间ID")
    private Long ossBucketId;
    @Schema(title = "上传ID")
    private Long ossUploadId;
    @Schema(title = "来源（uim")
    private String source;
    @Schema(title = "存储路径")
    private String bucketPath;
    @Schema(title = "原文件名")
    private String fileName;
    @Schema(title = "文件存储路径")
    private String filePath;
    @Schema(title = "文件后缀")
    private String fileExt;
    @Schema(title = "文件全量路径")
    private String fileLink;
    @Schema(title = "访问密码")
    private String cipher;
    @Schema(title = "原始md5")
    private String md5;
    @Schema(title = "编码格式")
    private String encoding;
    @Schema(title = "文件信息(扩展信息json格式{分辨率:100,长:,宽:...})")
    private String fileInfo;
    @Schema(title = "原始文件大小KB")
    private Integer fileSize;
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