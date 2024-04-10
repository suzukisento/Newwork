package com.as.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private Integer stuId;  // ==stu_id
    private String stuName;
    private String stuSex;
    private Integer stuAge;
    private Date stuBirthday;
}