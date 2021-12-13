package juit.utils;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;

public class Audio {
    File file;
    AudioInputStream audioInputStream;
    Clip clip = AudioSystem.getClip();

    public Audio(String File) throws LineUnavailableException, UnsupportedAudioFileException, IOException {
        this.audioInputStream = AudioSystem.getAudioInputStream(new File(File));
        clip.open(audioInputStream);
    }

    public void playAudio(String filePathWithName,int length,boolean playAudio) throws IOException, UnsupportedAudioFileException, LineUnavailableException {
        this.file = new File(filePathWithName);
        this.audioInputStream = AudioSystem.getAudioInputStream(file);
        clip.open(audioInputStream);
        if(playAudio){
            clip.start();
            for(int i = 0;i < length;i++){}
        }
    }
    public Clip getClip(String filePathWithName,int length) throws LineUnavailableException {
        return  AudioSystem.getClip();
    }
    public void start(){
        clip.start();
    }
    public void stop(){
        clip.stop();
    }
    public void setSecondsPlayed(float secondsPlayed){
        clip.setMicrosecondPosition((long) (secondsPlayed*1000000));
    }
    public void wait(int second) throws InterruptedException {
        Thread.sleep(second* 1000000L);
    }
}
