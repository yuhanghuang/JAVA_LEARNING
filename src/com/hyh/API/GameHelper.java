package com.hyh.API;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Locale;

/**
 * 虽然ArrayList只能携带对象而不是primitive主数据类型，但是编译器能够自动地将primitive主数据类型包装成Object
 * 来存放到ArrayList中。
 */
public class GameHelper {
    private static final String alphabet = "abcdefg";
    private int gridLength = 7;
    private int gridSize = 49;
    private int [] grid = new int[gridSize];
    private int comCount = 0;
    public String getUserInput(String prompt){
        String inputLine =null;
        System.out.println(prompt+" ");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length()==0) return null;
        }catch (IOException e){
            System.out.println("IOException" +e);
        }
        return inputLine.toLowerCase();
    }

        public static void test(){
            ArrayList.class.getName();
            new ArrayList<>().isEmpty();
        }
    public ArrayList<String> placeDotCom(int comsize){
        ArrayList<String> alphaCells = new ArrayList<String>();
        String [] alphacoords = new String[comsize];
        String temp = null;
        int [] coords = new int[comsize];
        int attempts = 0;
        boolean success =false;
        int location = 0;
        comCount++;
        int incr =1;
        if ((comsize % 2)==1){
            incr = gridLength;
        }
        while (!success & attempts++<200){
            location = (int) (Math.random()*gridSize);
            int x =0;
            success = true;
            while (success && x < comsize){
                if (grid[location] == 0){
                    coords[x++] = location;
                    location += incr;
                    if (location >= gridSize){
                        success = false;
                    }
                    if (x>0 && (location % gridLength == 0)){
                        success = false;
                    }
                }else {
                    success = false;
                }
            }
        }
        int x = 0;
        int row = 0;
        int column =0;
        while (x<comsize){
            grid[coords[x]] =1 ;
            row = coords[x]/gridLength;
            column = coords[x]/gridLength;
            temp = String.valueOf(alphabet.charAt(column));
            alphaCells.add(temp.concat(Integer.toString(row)));
            x++;
        }
        return alphaCells;
    }

}
