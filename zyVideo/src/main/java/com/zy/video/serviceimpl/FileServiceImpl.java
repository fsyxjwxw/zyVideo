package com.zy.video.serviceimpl;

import com.zy.video.exception.BusinessException;
import com.zy.video.service.FileService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.apache.tika.Tika;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * @author Ryan
 * @date 2023/5/12 9:04
 * @description
 */
@Slf4j
@Service
public class FileServiceImpl implements FileService {

    @Override
    public String saveVideo(MultipartFile file) {
        return null;
    }

    @Override
    public Boolean verifyVideoType(MultipartFile mfile) {
        String fileName = mfile.getOriginalFilename();
        Tika tika = new Tika();
        File file = new File(fileName);
        try {
            FileUtils.copyInputStreamToFile(mfile.getInputStream(), file);
            String detect = tika.detect(file);
            if (detect.indexOf("video") > -1) {
                return true;
            } else {
                throw new BusinessException("【无效的类型】非视频格式" + detect);
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new BusinessException("【格式验证】格式验证失败");
        }
    }

}
