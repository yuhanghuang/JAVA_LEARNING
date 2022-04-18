package com.hyh.Struct;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class JukBox5 {
    ArrayList<Song> songList = new ArrayList<Song>();

    public static void main(String[] args) {
        new JukBox5().go();
    }

    public void getSongs() {
        try {
            File file = new File("SongsList.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine())!=null) {
                addSong(line);
            }
        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void addSong(String lineRoParse) {
        String[] tokens = lineRoParse.split("/");
//        使用解析出来的四项属性来创建Song对象并加入到List。
        Song nextSong = new Song(tokens[0],tokens[1],tokens[2],tokens[3]);
        songList.add(nextSong);
    }
    public void go() {
//        还是会把songs加到ArrayList中去。
        getSongs();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);

        TreeSet<Song> songTreeSet = new TreeSet<Song>();
        songTreeSet.addAll(songList);
        System.out.println(songList);
//        创建参数化的HashSet来保存Song。

        HashSet<Song> songSet = new HashSet<Song>();
        songSet.addAll(songList);
        System.out.println(songSet);
   }
}
