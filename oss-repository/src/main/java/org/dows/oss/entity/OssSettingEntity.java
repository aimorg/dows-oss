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
@Table("oss_setting")
public class OssSettingEntity extends CrudEntity<OssSettingEntity> {

    @Schema(title = "存储设置ID")
    private Long ossSettingId;
    @Schema(title = "关联源ID")
    private Long correlativeId;
    @Schema(title = "关联源")
    private String correlativeSource;
    @Schema(title = "配置键名[触发器配置，其他配置......]")
    private String keyName;
    @Schema(title = "键值")
    private String setValue;
    @Schema(title = "数据类型[class,string,integer,json...]")
    private String dataType;
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