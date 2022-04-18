package com.hyh.Serialization;

import java.io.Serializable;

public class GameCharacter implements Serializable {
    int power;
    String type;

    public GameCharacter(int power, String type, String[] weapons) {
        this.power = power;
        this.type = type;
        this.weapons = weapons;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWeapons() {
        String weaponList = "";
        for (int i = 0; i < weaponList.length(); i++) {
            weaponList += weapons[i] + "";
        }
        return weaponList;
    }

    public void setWeapons(String[] weapons) {
        this.weapons = weapons;
    }

    String[] weapons;


}