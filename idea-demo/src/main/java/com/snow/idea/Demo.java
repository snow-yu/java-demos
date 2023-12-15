package com.snow.idea;

/**
 * idea快捷键使用
 *
 * @author jiaXue
 * date 2023/12/14
 */
public class Demo {

    public static void main(String[] args) {
        testSuffix();
    }


    static void testSuffix() {
        // .var 后缀可快速补全变量引用和方法调用引用
        //  "".var; 回车 ｜ tab即可补全引用
        String s = "";

        // .sout 补全为直接打印变量
        // .soutv 补全为带有变量前缀打印变量
        System.out.println("1231");

        // .fori 补全循环数组
        int[] arr = {1,2,3,4};
        for (int i : arr) {

        }

        // .if 快速生成if判断结构
        // s==null.if
        if (s==null) {

        }

        // .null 快速生成为空判断结构
        // s.null
        if (s == null) {

        }
        // .nn 快速生成不为空判断结构
        // s.nn
        if (s != null) {

        }
    }
}
