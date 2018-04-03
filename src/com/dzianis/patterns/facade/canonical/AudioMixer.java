package com.dzianis.patterns.facade.canonical;

import java.io.File;

public class AudioMixer {
    public static File fix(VideoFile result){
        System.out.println("AudioMixer: fixing audio...");
        return new File("tmp");
    }
}
