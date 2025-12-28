package org.dows.oss.open;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.dows.oss.open.PostOssMetricEntityRequest;
import org.dows.oss.open.PostOssMetricEntityResponse;
import org.dows.oss.open.PutOssMetricEntityRequest;
import org.dows.oss.open.PutOssMetricEntityResponse;
import org.dows.oss.open.GetOssMetricPageRequest;
import org.dows.oss.open.GetOssMetricPageResponse;
import org.dows.oss.open.GetOssMetricEntityRequest;
import org.dows.oss.open.GetOssMetricEntityResponse;

@RequiredArgsConstructor
@Tag(name = "OpenOssMetricRest", description = "文件")
@RestController
public class OpenOssMetricRest{

    @PostMapping("open/oss/metric/entity")
    @Operation(summary = "保存")
    public PostOssMetricEntityResponse postEntity(@RequestBody PostOssMetricEntityRequest postOssMetricEntityRequest){
        return null;
    }

    @PutMapping("open/oss/metric/entity")
    @Operation(summary = "更新")
    public void putEntity(@RequestBody PutOssMetricEntityRequest putOssMetricEntityRequest){
        
    }

    @GetMapping("open/oss/metric/page")
    @Operation(summary = "分页")
    public GetOssMetricPageResponse getPage( GetOssMetricPageRequest getOssMetricPageRequest){
        return null;
    }

    @GetMapping("open/oss/metric/entity")
    @Operation(summary = "实体")
    public GetOssMetricEntityResponse getEntity( GetOssMetricEntityRequest getOssMetricEntityRequest){
        return null;
    }

}