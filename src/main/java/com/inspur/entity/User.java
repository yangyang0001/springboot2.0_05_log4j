package com.inspur.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

/**
 * User: YANG
 * Date: 2019/6/11-23:58
 * Description: No Description
 */

@Slf4j
@Getter
@Setter
public class User implements Serializable{

    private static final long serialVersionUID = -5295163920652631552L;
    private Long id;
    private String username;
    private Integer age;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args){

        User user = new User();
        user.setId(10000L);
        user.setUsername("zhangsan");
        user.setAge(10);

        log.info(user.toString());

    }
}
