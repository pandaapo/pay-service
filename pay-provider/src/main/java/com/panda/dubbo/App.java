package com.panda.dubbo;

import org.apache.dubbo.container.Main;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
//        //spring里面通过api的方式去加载springxml文件，启动服务
//        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(new String[]{"META-INF/spring/application.xml"});
//        classPathXmlApplicationContext.start();
//        System.in.read();

        //Dubbo提供的启动类方法，它会启动dubbo中配置的多个container
//        Main.main(args);
        Main.main(new String[]{"spring", "log4j"});
    }
}
