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
@Table("oss_download")
public class OssDownloadEntity extends CrudEntity<OssDownloadEntity> {

    @Schema(title = "下载ID")
    private Long ossDownloadId;
    @Schema(title = "账号实例ID")
    private Long accountInstanceId;
    @Schema(title = "文件ID")
    private Long ossFileId;
    @Schema(title = "下载进度")
    private Long process;
    @Schema(title = "状态")
    private Integer state;
    @Schema(title = "下载连接")
    private String link;
    @Schema(title = "存储文件名(另存为可重命名)")
    private String fileName;
    @Schema(title = "本地路径(异步下载时可端点继传，确保文件路径存在)")
    private String localPath;
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