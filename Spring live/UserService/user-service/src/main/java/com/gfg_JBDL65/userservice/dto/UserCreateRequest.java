package com.gfg_JBDL65.userservice.dto;

import com.gfg_JBDL65.userservice.Model.User;
import com.gfg_JBDL65.userservice.util.Constant;
import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class UserCreateRequest {

    private String name;
    private String mobile;
    private String email;
    private String password;

    public User to() {
        return User.builder()
                .name(name)
                .password(password)
                .email(email)
                .mobile(mobile)
                .Authority(Constant.USER_AUTHORITY)
                .build();
    }


}