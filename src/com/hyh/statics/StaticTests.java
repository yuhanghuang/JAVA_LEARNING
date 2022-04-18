package com.hyh.statics;
import javax.sound.midi.*;
public class StaticTests extends StaticSuper{
    static int rand;
    static {
        rand = (int) (Math.random()*6);
        System.out.println("static block "+rand);
    }

    public StaticTests() {
        System.out.println("constructor");
    }

    public static void main(String[] args) throws MidiUnavailableException {
        Sequencer sequencer = MidiSystem.getSequencer();
        System.out.println("main开始了");
        StaticTests st = new StaticTests();
    }
}
