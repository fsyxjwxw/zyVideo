package com.zy.video.controller;

import com.zy.video.entity.Result;
import com.zy.video.entity.UploadVideoRo;
import com.zy.video.service.FileService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Ryan
 * @date 2023/5/12 8:24
 * @description
 */
@Api(tags = "【文件】")
@RestController
public class FileController {

    @Resource
    private FileService service;

    @ApiOperation("视频上传")
    @PostMapping("/uploadVideo")
    public Result uploadVideo(UploadVideoRo ro){
        //验证是否为视频格式
        service.verifyVideoType(ro.getFile());

        return null;
    }
}
