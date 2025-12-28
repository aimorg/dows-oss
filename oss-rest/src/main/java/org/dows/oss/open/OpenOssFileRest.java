package org.dows.oss.open;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.dows.oss.open.PostOssFileEntityRequest;
import org.dows.oss.open.PostOssFileEntityResponse;
import org.dows.oss.open.PutOssFileEntityRequest;
import org.dows.oss.open.PutOssFileEntityResponse;
import org.dows.oss.open.GetOssFilePageRequest;
import org.dows.oss.open.GetOssFilePageResponse;
import org.dows.oss.open.GetOssFileEntityRequest;
import org.dows.oss.open.GetOssFileEntityResponse;

@RequiredArgsConstructor
@Tag(name = "OpenOssFileRest", description = "文件")
@RestController
public class OpenOssFileRest{

    @PostMapping("open/oss/file/entity")
    @Operation(summary = "保存")
    public PostOssFileEntityResponse postEntity(@RequestBody PostOssFileEntityRequest postOssFileEntityRequest){
        return null;
    }

    @PutMapping("open/oss/file/entity")
    @Operation(summary = "更新")
    public void putEntity(@RequestBody PutOssFileEntityRequest putOssFileEntityRequest){
        
    }

    @GetMapping("open/oss/file/page")
    @Operation(summary = "分页")
    public GetOssFilePageResponse getPage( GetOssFilePageRequest getOssFilePageRequest){
        return null;
    }

    @GetMapping("open/oss/file/entity")
    @Operation(summary = "实体")
    public GetOssFileEntityResponse getEntity( GetOssFileEntityRequest getOssFileEntityRequest){
        return null;
    }

}