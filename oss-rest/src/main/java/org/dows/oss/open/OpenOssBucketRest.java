package org.dows.oss.open;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.dows.oss.open.PostOssBucketEntityRequest;
import org.dows.oss.open.PostOssBucketEntityResponse;
import org.dows.oss.open.PutOssBucketEntityRequest;
import org.dows.oss.open.PutOssBucketEntityResponse;
import org.dows.oss.open.GetOssBucketListRequest;
import org.dows.oss.open.GetOssBucketListResponse;

@RequiredArgsConstructor
@Tag(name = "OpenOssBucketRest", description = "存储桶")
@RestController
public class OpenOssBucketRest{

    @PostMapping("open/oss/bucket/entity")
    @Operation(summary = "保存")
    public PostOssBucketEntityResponse postEntity(@RequestBody PostOssBucketEntityRequest postOssBucketEntityRequest){
        return null;
    }

    @PutMapping("open/oss/bucket/entity")
    @Operation(summary = "更新")
    public void putEntity(@RequestBody PutOssBucketEntityRequest putOssBucketEntityRequest){
        
    }

    @GetMapping("open/oss/bucket/list")
    @Operation(summary = "列表")
    public GetOssBucketListResponse getList( GetOssBucketListRequest getOssBucketListRequest){
        return null;
    }

}