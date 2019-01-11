package com.wt.study.jdk.classloader;

import org.junit.Test;

public class LauncherTest {
    /**
     * BootStrapLoader加载类的路径
     */
    @Test
    public void test(){
        Launcher launcher = new Launcher();
        launcher.getbootClassPath();
    }

    /**
     * ExtClassLoader加载类的路径
     */
    @Test
    public void test1(){
        Launcher launcher = new Launcher();
        launcher.getExtClassLoader();
    }

    /**
     * AppClassLoader加载类的路径
     */
    @Test
    public void test2(){
        Launcher launcher = new Launcher();
        launcher.getClassPath();
    }

    @Test
    public void test3(){
        ClassLoader classLoader = Launcher.class.getClassLoader();
        System.out.println("自定义类ClassLoader is"+classLoader.toString());
        System.out.println("APPClassLoader父类 is" + classLoader.getParent().toString());
        System.out.println("ExtClassLoader父类 is" + classLoader.getParent().getParent().toString());


        ClassLoader classLoader1 = String.class.getClassLoader();
        System.out.println("ClassLoader is"+classLoader1.toString());
    }

}
