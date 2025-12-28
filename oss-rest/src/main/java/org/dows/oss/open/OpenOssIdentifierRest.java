package org.dows.oss.open;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.dows.oss.open.PostOssIdentifierEntityRequest;
import org.dows.oss.open.PostOssIdentifierEntityResponse;
import org.dows.oss.open.PutOssIdentifierEntityRequest;
import org.dows.oss.open.PutOssIdentifierEntityResponse;
import org.dows.oss.open.GetOssIdentifierEntityRequest;
import org.dows.oss.open.GetOssIdentifierEntityResponse;
import org.dows.oss.open.GetOssIdentifierPageRequest;
import org.dows.oss.open.GetOssIdentifierPageResponse;
import org.dows.oss.open.DeleteOssIdentifierEntityRequest;
import org.dows.oss.open.DeleteOssIdentifierEntityResponse;

@RequiredArgsConstructor
@Tag(name = "OpenOssIdentifierRest", description = "标识")
@RestController
public class OpenOssIdentifierRest{

    @PostMapping("open/oss/identifier/entity")
    @Operation(summary = "保存")
    public PostOssIdentifierEntityResponse postEntity(@RequestBody PostOssIdentifierEntityRequest postOssIdentifierEntityRequest){
        return null;
    }

    @PutMapping("open/oss/identifier/entity")
    @Operation(summary = "更新")
    public void putEntity(@RequestBody PutOssIdentifierEntityRequest putOssIdentifierEntityRequest){
        
    }

    @GetMapping("open/oss/identifier/entity")
    @Operation(summary = "根据ID获取")
    public GetOssIdentifierEntityResponse getEntity( GetOssIdentifierEntityRequest getOssIdentifierEntityRequest){
        return null;
    }

    @GetMapping("open/oss/identifier/page")
    @Operation(summary = "分页")
    public GetOssIdentifierPageResponse getPage( GetOssIdentifierPageRequest getOssIdentifierPageRequest){
        return null;
    }

    @DeleteMapping("open/oss/identifier/entity")
    @Operation(summary = "删除")
    public void deleteEntity(@RequestBody DeleteOssIdentifierEntityRequest deleteOssIdentifierEntityRequest){
        
    }

}