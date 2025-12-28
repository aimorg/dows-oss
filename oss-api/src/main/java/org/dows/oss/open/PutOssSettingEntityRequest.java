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
@Schema(description = "PutOssSettingEntityRequest 对象")
public class PutOssSettingEntityRequest {

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

}