package com.hp.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
@TableName("user")
public class User {
    @TableId(type = IdType.AUTO)

    @ApiModelProperty(value = "用户编号", required = true)
    private Integer userId;
    @ApiModelProperty(value = "密码", required = true)
    private String password;


}
