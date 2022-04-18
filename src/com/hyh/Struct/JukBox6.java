package com.hyh.Struct;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class JukBox6 {
    ArrayList<Song> songArrayList = new ArrayList<Song>();
    int val;

    public static void main(String[] args) {
        new JukBox6().go();
    }

    public void go() {
        getSongs();
        System.out.println(songArrayList);
        Collections.sort(songArrayList);
        System.out.println(songArrayList);
//        调用没有参数的构造函数来用TreeSet取代HashSet意味着以对象的compareTo()方法来排序。
        TreeSet<Song> songTreeSet = new TreeSet<Song>();
        songTreeSet.addAll(songArrayList);
        System.out.println(songArrayList);
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
        songArrayList.add(nextSong);
    }
}
