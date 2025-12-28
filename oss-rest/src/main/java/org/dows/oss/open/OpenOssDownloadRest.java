package org.dows.oss.open;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.dows.oss.open.PostOssDownloadEntityRequest;
import org.dows.oss.open.PostOssDownloadEntityResponse;
import org.dows.oss.open.PutOssDownloadEntityRequest;
import org.dows.oss.open.PutOssDownloadEntityResponse;
import org.dows.oss.open.GetOssDownloadPageRequest;
import org.dows.oss.open.GetOssDownloadPageResponse;
import org.dows.oss.open.GetOssDownloadEntityRequest;
import org.dows.oss.open.GetOssDownloadEntityResponse;

@RequiredArgsConstructor
@Tag(name = "OpenOssDownloadRest", description = "文件")
@RestController
public class OpenOssDownloadRest{

    @PostMapping("open/oss/download/entity")
    @Operation(summary = "保存")
    public PostOssDownloadEntityResponse postEntity(@RequestBody PostOssDownloadEntityRequest postOssDownloadEntityRequest){
        return null;
    }

    @PutMapping("open/oss/download/entity")
    @Operation(summary = "更新")
    public void putEntity(@RequestBody PutOssDownloadEntityRequest putOssDownloadEntityRequest){
        
    }

    @GetMapping("open/oss/download/page")
    @Operation(summary = "分页")
    public GetOssDownloadPageResponse getPage( GetOssDownloadPageRequest getOssDownloadPageRequest){
        return null;
    }

    @GetMapping("open/oss/download/entity")
    @Operation(summary = "实体")
    public GetOssDownloadEntityResponse getEntity( GetOssDownloadEntityRequest getOssDownloadEntityRequest){
        return null;
    }

}