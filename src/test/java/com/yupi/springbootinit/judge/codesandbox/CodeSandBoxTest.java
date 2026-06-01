package com.yupi.springbootinit.judge.codesandbox;

import com.yupi.springbootinit.judge.codesandbox.impl.ExampleCodeSandbox;
import com.yupi.springbootinit.judge.codesandbox.model.ExecuteCodeRequest;
import com.yupi.springbootinit.judge.codesandbox.model.ExecuteRequestResponse;
import com.yupi.springbootinit.model.enums.QuestionSubmitLanguageEnum;
import org.aspectj.weaver.patterns.TypePatternQuestions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest  //标注测试类
class CodeSandBoxTest {

    @Test
    void contextLoads() {
        CodeSandBox codeSandBox=new ExampleCodeSandbox();
        String code ="int main(){ }";
        String language= QuestionSubmitLanguageEnum.JAVA.getValue();
        List<String> inputList= Arrays.asList("1 2","3 4");
        ExecuteCodeRequest executeCodeRequest = ExecuteCodeRequest.builder()
                .code(code)
                .language(language)
                .inputList(inputList)
                .build();
        ExecuteRequestResponse executeRequestResponse = codeSandBox.executeCode(executeCodeRequest);
        Assertions.assertNotNull(executeRequestResponse); //判断是否为空
    }
}