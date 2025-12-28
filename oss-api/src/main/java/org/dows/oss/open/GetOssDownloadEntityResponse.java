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
@Schema(description = "GetOssDownloadEntityResponse 对象")
public class GetOssDownloadEntityResponse {

    @Schema(description = "下载ID")
    private Long ossDownloadId;

    @Schema(description = "账号实例ID")
    private Long accountInstanceId;

    @Schema(description = "文件ID")
    private Long ossFileId;

    @Schema(description = "下载进度")
    private Long process;

    @Schema(description = "状态")
    private Integer state;

    @Schema(description = "下载连接")
    private String link;

    @Schema(description = "存储文件名(另存为可重命名)")
    private String fileName;

    @Schema(description = "本地路径(异步下载时可端点继传，确保文件路径存在)")
    private String localPath;

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