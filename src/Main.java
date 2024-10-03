import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException {
        File music = new File("Ready.wav");
        AudioInputStream AIn = AudioSystem.getAudioInputStream(music);
        Clip clip = AudioSystem.getClip();
        clip.open(AIn);
        clip.start();
        long lengthInMicroseconds = clip.getMicrosecondLength();
        long lengthInMilliseconds = lengthInMicroseconds / 1000;
        System.out.println("Length of the audio file in Microseconds: " + lengthInMicroseconds);
        System.out.println("Length of the audio file in milliseconds: " + lengthInMilliseconds);


        Thread.sleep(lengthInMicroseconds);
    }
}