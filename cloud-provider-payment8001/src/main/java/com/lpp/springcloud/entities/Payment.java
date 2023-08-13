package com.lpp.springcloud.entities;/*

@author shkstart

@create 2023-08-12 15:54

*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Data lombok组件使用
 * @AllArgsConstructor
 * @NoArgsConstructor
 * Serializable 实现序列化便于后续的分布式部署；
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private long id;
    private String serial;
}
