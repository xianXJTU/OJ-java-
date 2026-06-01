package com.yupi.springbootinit.judge.codesandbox;

import com.yupi.springbootinit.judge.codesandbox.model.ExecuteCodeRequest;
import com.yupi.springbootinit.judge.codesandbox.model.ExecuteRequestResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandBox {
    //接受响应参数 返回参数
    //输入 /** 按下回车可以得到多行注释
    //CRAL SHIRFT T 便捷的创建测试类

    /**
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteRequestResponse executeCode(ExecuteCodeRequest executeCodeRequest );
}
