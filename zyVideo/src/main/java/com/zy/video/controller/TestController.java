package com.zy.video.controller;

import com.zy.video.utils.FfmpegUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * @author Ryan
 * @date 2023/5/11 9:51
 * @description
 */
@Api(tags = "测试接口")
@RestController
public class TestController {

    @ApiOperation("test")
    @GetMapping("/test")
    public Boolean test(HttpServletResponse response) {
        String sourcePath = "D:/Projects/video/ssa.avi";
        String targetPath = "D:/Projects/video/ssassa.mp4";
        return FfmpegUtils.videoToMp4(sourcePath,targetPath);
    }

}
