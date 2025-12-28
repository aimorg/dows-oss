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
@Schema(description = "GetOssFileEntityResponse 对象")
public class GetOssFileEntityResponse {

    @Schema(description = "文件ID")
    private Long ossFileId;

    @Schema(description = "存储空间ID")
    private Long ossBucketId;

    @Schema(description = "上传ID")
    private Long ossUploadId;

    @Schema(description = "来源（uim")
    private String source;

    @Schema(description = "存储路径")
    private String bucketPath;

    @Schema(description = "原文件名")
    private String fileName;

    @Schema(description = "文件存储路径")
    private String filePath;

    @Schema(description = "文件后缀")
    private String fileExt;

    @Schema(description = "文件全量路径")
    private String fileLink;

    @Schema(description = "访问密码")
    private String cipher;

    @Schema(description = "原始md5")
    private String md5;

    @Schema(description = "编码格式")
    private String encoding;

    @Schema(description = "文件信息(扩展信息json格式{分辨率:100,长:,宽:...})")
    private String fileInfo;

    @Schema(description = "原始文件大小KB")
    private Integer fileSize;

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