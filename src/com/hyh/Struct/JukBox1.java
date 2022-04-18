package com.hyh.Struct;

import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.io.*;
import java.util.Collections;

public class JukBox1 {
    ArrayList<String> songList = new ArrayList<String>();

    public static void main(String[] args) {
        new JukBox1().go();
    }

    public void go() {
        getSongs();
        System.out.println(songList);
//        排序
        Collections.sort(songList);
        System.out.println(songList);
    }

    public void getSongs() {
        try {
            File file = new File("SongsList.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while((line = reader.readLine())!=null) {
                addSong(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addSong(String lineToParse) {
        String[] tokens = lineToParse.split("/");
        songList.add(tokens[0]);
    }
}
