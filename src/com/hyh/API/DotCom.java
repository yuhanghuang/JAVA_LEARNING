package com.hyh.API;

import java.util.ArrayList;

public class DotCom {
    private ArrayList<String> locationCells;
    private String name;

    public ArrayList<String> getLocationCells() {
        return locationCells;
    }

    /**
     *
     * @param locationCells
     */
    public void setLocationCells(ArrayList<String> locationCells) {
        this.locationCells = locationCells;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String checkYourself(String userInput){
        String result = "miss";
        int index = locationCells.indexOf(userInput);
        if (index >=0){
            locationCells.remove(index);
            if (locationCells.isEmpty()){
                result = "kill";
                System.out.println("ouch! ypu sunk"+name+" ");
            }else {
                result = "hit";
            }
        }
        return result;
    }

}
