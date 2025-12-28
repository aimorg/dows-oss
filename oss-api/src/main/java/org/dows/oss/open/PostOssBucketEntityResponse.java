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
@Schema(description = "PostOssBucketEntityResponse 对象")
public class PostOssBucketEntityResponse {

    @Schema(description = "存储空间ID")
    private Long ossBucketId;

}