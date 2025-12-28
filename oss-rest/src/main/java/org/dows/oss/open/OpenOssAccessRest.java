package org.dows.oss.open;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.dows.oss.open.PostOssAccessEntityRequest;
import org.dows.oss.open.PostOssAccessEntityResponse;
import org.dows.oss.open.PutOssAccessEntityRequest;
import org.dows.oss.open.PutOssAccessEntityResponse;
import org.dows.oss.open.GetOssAccessPageRequest;
import org.dows.oss.open.GetOssAccessPageResponse;
import org.dows.oss.open.GetOssAccessEntityRequest;
import org.dows.oss.open.GetOssAccessEntityResponse;

@RequiredArgsConstructor
@Tag(name = "OpenOssAccessRest", description = "文件")
@RestController
public class OpenOssAccessRest{

    @PostMapping("open/oss/access/entity")
    @Operation(summary = "保存")
    public PostOssAccessEntityResponse postEntity(@RequestBody PostOssAccessEntityRequest postOssAccessEntityRequest){
        return null;
    }

    @PutMapping("open/oss/access/entity")
    @Operation(summary = "更新")
    public void putEntity(@RequestBody PutOssAccessEntityRequest putOssAccessEntityRequest){
        
    }

    @GetMapping("open/oss/access/page")
    @Operation(summary = "分页")
    public GetOssAccessPageResponse getPage( GetOssAccessPageRequest getOssAccessPageRequest){
        return null;
    }

    @GetMapping("open/oss/access/entity")
    @Operation(summary = "实体")
    public GetOssAccessEntityResponse getEntity( GetOssAccessEntityRequest getOssAccessEntityRequest){
        return null;
    }

}