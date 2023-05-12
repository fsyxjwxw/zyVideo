package com.zy.video.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author Ryan
 * @date 2023/5/12 8:49
 * @description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UploadVideoRo {
    private MultipartFile file;
}
