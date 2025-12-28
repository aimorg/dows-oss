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
@Table("oss_trigger")
public class OssTriggerEntity extends CrudEntity<OssTriggerEntity> {

    @Schema(title = "触发ID")
    private Long ossTriggerId;
    @Schema(title = "账号标识ID")
    private Long ossIdentifierId;
    @Schema(title = "触发器（MCP[解析、编码，OCR，发布多平台...]）")
    private String trigger;
    @Schema(title = "回调[http:")
    private String callback;
    @Schema(title = "目标")
    private String target;
    @Schema(title = "触发参数(配置{retry:3,压缩率:10,...})")
    private String configJson;
    @Schema(title = "重试次数")
    private Integer retryCount;
    @Schema(title = "顺序")
    private Integer seq;
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