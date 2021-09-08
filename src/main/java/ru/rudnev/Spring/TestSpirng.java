package ru.rudnev.Spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpirng {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext");

       // Music music = context.getBean("musicBean",Music.class);
        //внедрение зависимостей
        //MusicPlayer musicPlayer = new MusicPlayer(music);//внедрили
        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
        musicPlayer.playMusic();
        context.close();
    }

}
