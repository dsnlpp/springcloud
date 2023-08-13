package com.lpp.springcloud.entities;/*

@author shkstart

@create 2023-08-12 15:58

*/
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//    前后端分离，后端根据约定将json字符串返回给前端，一般样式为 404 not_found;

/**
 * @param <T>泛型，后端传什么类型的数据就将这些数据传给前端。
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private int code;
    private String message;
    private T   data;

    public CommonResult(int code,String message) {
        this.code = code;
        this.message = message;
    }
}
