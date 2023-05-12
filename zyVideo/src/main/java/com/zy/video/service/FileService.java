package com.zy.video.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author Ryan
 * @date 2023/5/12 9:04
 * @description
 */
public interface FileService {

    /**
     * 存储视频并返回唯一id
     *
     * @param file
     * @return
     */
    public String saveVideo(MultipartFile file);

    /**
     * 验证视频类型
     *
     * @param file
     * @return
     */
    public Boolean verifyVideoType(MultipartFile file);

}
