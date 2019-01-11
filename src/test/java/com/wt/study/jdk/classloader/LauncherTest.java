package com.wt.study.jdk.classloader;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class LauncherTest {
    /**
     * BootStrapLoader加载类的路径
     */
    @Test
    public void test() {
        Launcher launcher = new Launcher();
        launcher.getbootClassPath();
    }

    /**
     * ExtClassLoader加载类的路径
     */
    @Test
    public void test1() {
        Launcher launcher = new Launcher();
        launcher.getExtClassLoader();
    }

    /**
     * AppClassLoader加载类的路径
     */
    @Test
    public void test2() {
        Launcher launcher = new Launcher();
        launcher.getClassPath();
    }

    /**
     * 测试ClassLoader的父类
     */
    @Test
    public void test3() {
        ClassLoader classLoader = Launcher.class.getClassLoader();
        System.out.println("自定义类ClassLoader is" + classLoader.toString());
        System.out.println("APPClassLoader父类 is" + classLoader.getParent().toString());
        System.out.println("ExtClassLoader父类 is" + classLoader.getParent().getParent().toString());


        ClassLoader classLoader1 = String.class.getClassLoader();
        System.out.println("ClassLoader is" + classLoader1.toString());
    }

    /**
     * 测试自定义Loader
     */
    @Test
    public void test4() {
//创建自定义classloader对象。
        DiskClassLoader diskLoader = new DiskClassLoader("D:\\download\\");
        try {
            //加载class文件
            Class c = diskLoader.loadClass("com.wt.study.jdk.classloader.CustomerLoaderTarget");

            if (c != null) {
                try {
                    Object obj = c.newInstance();
                    Method method = c.getDeclaredMethod("say", null);
                    //通过反射调用Test类的say方法
                    method.invoke(obj, null);
                } catch (InstantiationException | IllegalAccessException
                        | NoSuchMethodException
                        | SecurityException |
                        IllegalArgumentException |
                        InvocationTargetException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
