package com.hyh.Struct;

public class Song implements Comparable<Song>{
//    对应四种属性的四个实例变量
    String title;
    String artist;
    String rating;
    String bpm;

    public Song(String title, String artist, String rating, String bpm) {
        this.title = title;
        this.artist = artist;
        this.rating = rating;
        this.bpm = bpm;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getRating() {
        return rating;
    }

    public String getBpm() {
        return bpm;
    }

//    覆盖toString()方法，让其返回歌名
    @Override
    public String toString() {
        return  title;
    }

    @Override
    public int hashCode() {
//        String也有覆盖过得hashcode()，注意到hashcode()与equals()使用相同的实例变量。
        return title.hashCode();
    }

    /**
     *
     * @param obj 要被比较的对象
     * @return
     * 由于歌名是String,并且String本来就覆盖过equals(),所以可以调用
     */
    @Override
    public boolean equals(Object obj) {
        Song s = (Song) obj;
        return this.title.equals(s.getTitle());
    }

    @Override
    public int compareTo(Song o) {
//        下面的compareTo方法是定义在String.java文件内的。
        return title.compareTo(o.getTitle());
//        return title == (o.getTitle());
    }
}
