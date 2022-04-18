package com.hyh.Exception;

import javax.sound.midi.*;
import java.io.IOException;
import java.io.InputStream;

public class MiniMusicApp {
    public static void main(String[] args) {
        MiniMusicApp mini = new MiniMusicApp();
        mini.play();
    }
    public void play() {
        try {
            Sequencer player = MidiSystem.getSequencer();
            player.open();//取得Sequencer并将其打开

            Sequencer sequencer = (Sequencer) new Sequence(Sequence.PPQ,4);
            Track track = sequencer.getSequence().createTrack();

            ShortMessage a = new ShortMessage();
            a.setMessage(144,1,44,100);
            MidiEvent noteon = new MidiEvent(a,1);
            track.add(noteon);

            ShortMessage b =new ShortMessage();
            b.setMessage(128,1,44,100);
            MidiEvent noteoff = new MidiEvent(b,16);
            track.add(noteoff);

            player.setSequence((InputStream) sequencer);
            player.start();

        } catch (MidiUnavailableException | InvalidMidiDataException | IOException e) {
            System.out.println("出错了");
            e.printStackTrace();
        }
    }
}
