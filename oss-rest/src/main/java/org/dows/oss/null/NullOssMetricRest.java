package org.dows.oss.null;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@Tag(name = "NullOssMetricRest", description = "文件")
@RestController
public class NullOssMetricRest{

}