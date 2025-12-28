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
@Schema(description = "PostOssSettingEntityResponse 对象")
public class PostOssSettingEntityResponse {

    @Schema(description = "存储设置ID")
    private Long ossSettingId;

}