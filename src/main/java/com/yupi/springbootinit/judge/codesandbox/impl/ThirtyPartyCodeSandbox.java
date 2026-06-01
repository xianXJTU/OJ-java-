package com.yupi.springbootinit.judge.codesandbox.impl;

import com.yupi.springbootinit.judge.codesandbox.CodeSandBox;
import com.yupi.springbootinit.judge.codesandbox.model.ExecuteCodeRequest;
import com.yupi.springbootinit.judge.codesandbox.model.ExecuteRequestResponse;
/*
* 第三方代码沙箱（调用现成的代码沙箱）
* */
public class ThirtyPartyCodeSandbox implements CodeSandBox {
    @Override
    public ExecuteRequestResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("第三方代码沙箱");
        return null;
    }
}
