package org.example;

public class Main {
    public static void main(String[] args){
        System.out.println("число:" + generateRandomAge());



    }

    public static int generateRandomAge(){
        int ageRandom=0+(int)(Math.random()*100);
        return ageRandom;
    }


}
