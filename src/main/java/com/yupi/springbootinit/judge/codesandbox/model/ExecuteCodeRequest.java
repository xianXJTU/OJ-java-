package com.yupi.springbootinit.judge.codesandbox.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data   //get set tostring equals hashCode 无参构造
@Builder  //
@NoArgsConstructor
@AllArgsConstructor
public class ExecuteCodeRequest {

    private List<String> inputList;  //接收一组输入

    private String code;  //用户的代码

    private String language;  //用户使用的语言


}
