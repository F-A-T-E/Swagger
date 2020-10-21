package com.java.spring_swagger.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @Description: TODO
 * @Date: 2020/10/21 10:29
 * @Author: miaoxiong
 * @ModifiedBy:miaoxiong
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain=true)
public class User {
    private String id;
    private String name;
}
