package com.hyh.Exception;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

public class MusicTest1 {
    public void play() {
        try{
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("successfully got a sequencer");
        } catch (MidiUnavailableException e) {
            System.out.println("bummber");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MusicTest1 mt = new MusicTest1();
        mt.play();
    }
}
