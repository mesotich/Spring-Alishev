package ru.alishev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        Music music1 = context.getBean("musicBean", Music.class);
        Music music2 = context.getBean("musicBean", Music.class);
        System.out.println(music1.getSong());
        System.out.println(music2.getSong());
        context.close();
    }
}
