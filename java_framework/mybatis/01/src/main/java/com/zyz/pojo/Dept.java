package com.zyz.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther : YongggzHi
 * @Date : 2021/7/9 - 20:46
 * @Description : IntelliJ IDEA
 * @Version : 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dept {
    private Integer deptno;
    private String deptname;
    private String loc;
}
