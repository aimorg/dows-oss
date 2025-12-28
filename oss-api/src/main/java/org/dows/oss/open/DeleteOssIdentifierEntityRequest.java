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
@Schema(description = "DeleteOssIdentifierEntityRequest 对象")
public class DeleteOssIdentifierEntityRequest {

    @Schema(description = "账号标识ID")
    private Long ossIdentifierId;

}