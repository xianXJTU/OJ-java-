package com.yupi.springbootinit.judge.codesandbox.impl;

import com.yupi.springbootinit.judge.codesandbox.CodeSandBox;
import com.yupi.springbootinit.judge.codesandbox.model.ExecuteCodeRequest;
import com.yupi.springbootinit.judge.codesandbox.model.ExecuteRequestResponse;
/*
* 远程代码沙箱（实际调用接口）
* */
public class RemoteCodeSandbox implements CodeSandBox {
    @Override
    public ExecuteRequestResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("远程代码沙箱");
        return null;
    }
}
