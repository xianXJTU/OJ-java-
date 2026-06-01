package com.yupi.springbootinit.judge.codesandbox.impl;

import com.yupi.springbootinit.judge.codesandbox.CodeSandBox;
import com.yupi.springbootinit.judge.codesandbox.model.ExecuteCodeRequest;
import com.yupi.springbootinit.judge.codesandbox.model.ExecuteRequestResponse;
/*
* 示例代码沙箱（跑通流程）
* */
public class ExampleCodeSandbox implements CodeSandBox {
    /*
    * CRAL 加 I 快速实现接口方法
    * CRAL 加 O 快速重写父类方法
    * */
    @Override
    public ExecuteRequestResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("示例代码沙箱");
        return null;
    }
}
