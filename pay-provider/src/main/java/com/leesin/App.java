package com.leesin;

import org.apache.dubbo.container.Main;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {
        //本质是通过spring启动，所以通过这种方式也可以启动
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext(new String[]{"META-INF/spring/application.xml"});
        classPathXmlApplicationContext.start();
        System.in.read();

        //spring方式能查到错误，这种不能

        // dubbo提供的启动方式
        // Main.main(args);
        // Main.main(new String[]{"spring","log4j"});
    }
}
