package com.wt.study.jdk.classloader;

public class Launcher {
    /**
     * BootStrapLoader加载类的路径
     */
    public void getbootClassPath(){
        System.out.println(System.getProperty("sun.boot.class.path"));
    }

    /**
     * ExtClassLoader加载类的路径
     */
    public void getExtClassLoader(){
        System.out.println(System.getProperty("java.ext.dirs"));
    }

    /**
     * AppClassLoader加载类的路径
     */
    public void getClassPath(){
        System.out.println(System.getProperty("java.class.path"));
    }
}
