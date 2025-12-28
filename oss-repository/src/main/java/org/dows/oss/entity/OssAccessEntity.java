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
@Table("oss_access")
public class OssAccessEntity extends CrudEntity<OssAccessEntity> {

    @Schema(title = "访问ID")
    private Long ossAccessId;
    @Schema(title = "访问账号ID")
    private Long accontInstanceId;
    @Schema(title = "文件ID")
    private Long ossFileId;
    @Schema(title = "访问过期时间")
    private LocalDateTime expireTime;
    @Schema(title = "访问密钥")
    private String secretKey;
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