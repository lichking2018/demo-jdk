package com.wt.study.jdk.classloader;

public class CustomerLoaderTarget {
    public void say(){
        System.out.println("自定义加载器，加载目标："+CustomerLoaderTarget.class.getSimpleName());
    }
}
