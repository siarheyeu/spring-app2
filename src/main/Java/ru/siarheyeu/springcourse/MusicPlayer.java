package ru.siarheyeu.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    private ClassicalMusic classicalMusic;
    private RockMusic rockmusic;
@Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockmusic) {
        this.classicalMusic = classicalMusic;
        this.rockmusic = rockmusic;
    }

    public String playMusic(){
        return "Playing" + classicalMusic.getSong();

    }
}
