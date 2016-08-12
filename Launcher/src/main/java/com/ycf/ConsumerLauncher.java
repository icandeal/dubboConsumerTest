package com.ycf;

import com.alibaba.dubbo.container.Main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Created by sniper on 16-8-11.
 */
public class ConsumerLauncher {
    public static void main(String []args) {

        final ApplicationContext context = new ClassPathXmlApplicationContext("/spring/applicationContext.xml");
        new Thread(new Runnable() {
            public void run() {
                try{
                    System.out.println("in this thread");

                    for(int i = 0;i < 100; i ++) {
                        GradeAPI gradeAPI = (GradeAPI) context.getBean("gradeAPI");
                        System.out.println("grade count is : "+ gradeAPI.getGradeCount());
                    }
                } catch (Exception e) {
                    System.out.println(e);
                    e.printStackTrace();
                }
            }
        }).start();
        Main.main(null);
    }
}
