package com.zc.exercise.common.domain;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author zhangchi
 * @date 2019/11/26
 */
@Data
@Accessors
public class User {
    private Long id;

    private String name;

    private String password;

    private String realName;

    private String phone;

    private String email;

    private String address;
}
