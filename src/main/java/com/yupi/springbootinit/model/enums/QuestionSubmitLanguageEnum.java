package com.yupi.springbootinit.model.enums;

import org.apache.commons.lang3.ObjectUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 【QuestionSubmitLanguageEnum - 题目提交编程语言枚举】
 * 核心作用：定义OJ系统支持的编程语言类型。
 *
 * 用户提交代码时需要指定编程语言，判题服务会根据语言类型
 * 选择不同的编译器和执行环境来运行代码。
 *
 * === 各枚举值说明 ===
 * JAVA     - Java语言
 * CPLUSPLUS - C++语言
 * GOLANG   - Go语言
 *
 * @author 程序员鱼皮 (https://github.com/liyupi)
 * @from 编程导航知识星球 (https://yupi.icu)
 */
public enum QuestionSubmitLanguageEnum {

    /** Java编程语言 */
    JAVA("java", "java"),
    /** C++编程语言 */
    CPLUSPLUS("cpp", "cpp"),
    /** Go编程语言 */
    GOLANG("go", "go");

    /** 语言描述文字 */
    private final String text;

    /** 语言标识值（程序内部使用，存入数据库） */
    private final String value;

    QuestionSubmitLanguageEnum(String text, String value) {
        this.text = text;
        this.value = value;
    }

    /** 获取所有语言值的列表 */
    public static List<String> getValues() {
        return Arrays.stream(values()).map(item -> item.value).collect(Collectors.toList());
    }

    /**
     * 根据value查找对应枚举（用于校验前端传来的语言是否合法）
     *
     * @param value 语言标识字符串（如 "java"）
     * @return 对应的枚举实例，非法语言则返回null
     */
    public static QuestionSubmitLanguageEnum getEnumByValue(String value) {
        if (ObjectUtils.isEmpty(value)) {
            return null;
        }
        for (QuestionSubmitLanguageEnum anEnum : QuestionSubmitLanguageEnum.values()) {
            if (anEnum.value.equals(value)) {
                return anEnum;
            }
        }
        return null;
    }

    public String getValue() {
        return value;
    }

    public String getText() {
        return text;
    }
}
