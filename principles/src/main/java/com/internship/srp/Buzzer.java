package com.internship.srp;

public class Buzzer {
    public void buzz(){
        System.out.println("Buzz");
    }

    public void countTokens(String text){
        String[] tokens = text.split(" ");
        System.out.println(tokens.length);
    }
}
