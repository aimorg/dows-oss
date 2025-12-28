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
@Table("oss_identifier")
public class OssIdentifierEntity extends CrudEntity<OssIdentifierEntity> {

    @Schema(title = "账号标识ID")
    private Long ossIdentifierId;
    @Schema(title = "账号实例ID")
    private Long accountInstanceId;
    @Schema(title = "密钥ID")
    private String secretId;
    @Schema(title = "密钥KEY")
    private String secretKey;
    @Schema(title = "存储通道[cos,oss,qiniu]")
    private String channel;
    @Schema(title = "第三方存储JSON配置")
    private String configJson;
    @Schema(title = "是否启用")
    private Boolean disable;
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