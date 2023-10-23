package com.lvju.springboot.pojo;
//lombok插件的使用
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@EqualsAndHashCode
public class User
{
    private String name;
    private Integer age;
}
