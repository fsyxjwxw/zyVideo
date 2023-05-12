package com.zy.video.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Ryan
 * @date 2023/5/12 8:29
 * @description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Result {
    private Integer code;
    private String message;
    private Object data;

    public static Result success(String message,Object data){
        return Result.builder()
                .code(200)
                .message(message)
                .data(data)
                .build();
    }

    public static Result err(String message){
        return Result.builder()
                .code(201)
                .message(message)
                .data("This is the result that we are all unwilling to face.")
                .build();
    }

}
