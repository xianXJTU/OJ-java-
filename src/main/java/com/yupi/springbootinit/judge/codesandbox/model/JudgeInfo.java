package com.yupi.springbootinit.judge.codesandbox.model;

import lombok.Data;

@Data
public class JudgeInfo {

    /**
     * 程序执行的最终结果消息
     * 如 "Accepted"（通过）、"Wrong Answer"（答案错误）、"Memory Limit Exceeded"（内存超限）等
     */
    private String message;

    /**
     * 程序运行消耗的内存（单位：KB）
     * 是由沙箱环境测量的实际内存峰值
     */
    private Long memory;

    /**
     * 程序运行消耗的时间（单位：毫秒 ms）
     * 是由沙箱环境测量的实际运行耗时
     */
    private Long time;
}
