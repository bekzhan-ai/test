package Main2;

import java.util.Arrays;

public class Guitar {


    public Guitar(String color, int stringCount, int[] tensions) {
        this.color = color;
        this.stringCount = stringCount;
        this.tensions = tensions;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    String color;

    public int getStringCount() {
        return stringCount;
    }

    public void setStringCount(int stringCount) {
        this.stringCount = stringCount;
    }

    int stringCount = 6;

    public int[] getTensions() {
        return tensions;
    }

    int[] tensions = new int[stringCount];

    public void tune(){
        Arrays.fill(tensions, 5);
    }

    public void play(){
        System.out.println("Восток моей юности, запад пройденных дней\n" +
                "Я на вечной дороге, на вечной дороге\n" +
                "Восход моей юности, запах беглых огней\n" +
                "На вечной дороге, на вечной дороге\n");
        unsettle();
    }

    public void unsettle(){
        Arrays.fill(tensions, (int) (Math.random()*3));
    }
}

//for test;
