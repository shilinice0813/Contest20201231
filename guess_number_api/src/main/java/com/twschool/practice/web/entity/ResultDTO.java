package com.twschool.practice.web.entity;

import com.twschool.practice.web.dao.entity.UserInfo;
import lombok.Data;

@Data
public class ResultDTO extends DTO {
    private UserInfo userInfo;
}
