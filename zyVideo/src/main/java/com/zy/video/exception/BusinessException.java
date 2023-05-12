package com.zy.video.exception;

import lombok.Data;

/**
 * @author Ryan
 * @date 2023/5/12 16:51
 * @description
 */
@Data
public class BusinessException extends RuntimeException {

    public BusinessException(String message) {
        super(message);
    }

}
