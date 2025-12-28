package org.dows.oss.open;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.dows.oss.open.PostOssSettingEntityRequest;
import org.dows.oss.open.PostOssSettingEntityResponse;
import org.dows.oss.open.PutOssSettingEntityRequest;
import org.dows.oss.open.PutOssSettingEntityResponse;
import org.dows.oss.open.GetOssSettingPageRequest;
import org.dows.oss.open.GetOssSettingPageResponse;
import org.dows.oss.open.GetOssSettingEntityRequest;
import org.dows.oss.open.GetOssSettingEntityResponse;

@RequiredArgsConstructor
@Tag(name = "OpenOssSettingRest", description = "文件")
@RestController
public class OpenOssSettingRest{

    @PostMapping("open/oss/setting/entity")
    @Operation(summary = "保存")
    public PostOssSettingEntityResponse postEntity(@RequestBody PostOssSettingEntityRequest postOssSettingEntityRequest){
        return null;
    }

    @PutMapping("open/oss/setting/entity")
    @Operation(summary = "更新")
    public void putEntity(@RequestBody PutOssSettingEntityRequest putOssSettingEntityRequest){
        
    }

    @GetMapping("open/oss/setting/page")
    @Operation(summary = "分页")
    public GetOssSettingPageResponse getPage( GetOssSettingPageRequest getOssSettingPageRequest){
        return null;
    }

    @GetMapping("open/oss/setting/entity")
    @Operation(summary = "实体")
    public GetOssSettingEntityResponse getEntity( GetOssSettingEntityRequest getOssSettingEntityRequest){
        return null;
    }

}