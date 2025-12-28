package org.dows.oss.open;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.dows.oss.open.PostOssUploadEntityResponse;
import org.dows.oss.open.PutOssUploadEntityResponse;

@RequiredArgsConstructor
@Tag(name = "OpenOssUploadRest", description = "上传")
@RestController
public class OpenOssUploadRest{

}