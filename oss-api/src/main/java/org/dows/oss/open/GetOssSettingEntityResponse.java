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
@Schema(description = "GetOssSettingEntityResponse 对象")
public class GetOssSettingEntityResponse {

    @Schema(description = "存储设置ID")
    private Long ossSettingId;

    @Schema(description = "关联源ID")
    private Long correlativeId;

    @Schema(description = "关联源")
    private String correlativeSource;

    @Schema(description = "配置键名[触发器配置，其他配置......]")
    private String keyName;

    @Schema(description = "键值")
    private String setValue;

    @Schema(description = "数据类型[class,string,integer,json...]")
    private String dataType;

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