package org.dows.oss.open;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.dows.oss.open.PostOssTriggerEntityRequest;
import org.dows.oss.open.PostOssTriggerEntityResponse;
import org.dows.oss.open.PutOssTriggerEntityRequest;
import org.dows.oss.open.PutOssTriggerEntityResponse;
import org.dows.oss.open.GetOssTriggerListRequest;
import org.dows.oss.open.GetOssTriggerListResponse;
import org.dows.oss.open.DeleteOssTriggerEntityRequest;
import org.dows.oss.open.DeleteOssTriggerEntityResponse;

@RequiredArgsConstructor
@Tag(name = "OpenOssTriggerRest", description = "触发器")
@RestController
public class OpenOssTriggerRest{

    @PostMapping("open/oss/trigger/entity")
    @Operation(summary = "保存")
    public PostOssTriggerEntityResponse postEntity(@RequestBody PostOssTriggerEntityRequest postOssTriggerEntityRequest){
        return null;
    }

    @PutMapping("open/oss/trigger/entity")
    @Operation(summary = "更新")
    public void putEntity(@RequestBody PutOssTriggerEntityRequest putOssTriggerEntityRequest){
        
    }

    @GetMapping("open/oss/trigger/list")
    @Operation(summary = "列表")
    public GetOssTriggerListResponse getList( GetOssTriggerListRequest getOssTriggerListRequest){
        return null;
    }

    @DeleteMapping("open/oss/trigger/entity")
    @Operation(summary = "删除")
    public void deleteEntity(@RequestBody DeleteOssTriggerEntityRequest deleteOssTriggerEntityRequest){
        
    }

}