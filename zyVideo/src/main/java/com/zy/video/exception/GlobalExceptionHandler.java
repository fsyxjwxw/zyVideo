package com.zy.video.exception;

import com.zy.video.entity.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author Ryan
 * @date 2023/5/12 16:54
 * @description
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    @ResponseBody
    public Result businessException(BusinessException e){
        return Result.err(e.getMessage());
    }

}
