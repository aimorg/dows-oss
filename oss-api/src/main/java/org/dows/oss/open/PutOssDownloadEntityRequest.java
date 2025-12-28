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
@Schema(description = "PutOssDownloadEntityRequest 对象")
public class PutOssDownloadEntityRequest {

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

}