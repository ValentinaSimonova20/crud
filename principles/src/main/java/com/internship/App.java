package com.internship;

import com.internship.lsp.Animal;
import com.internship.lsp.Cat;
import com.internship.lsp.Dog;
import com.internship.lsp.Speaker;
import com.internship.srp.Buzzer;
import com.internship.srp.Fizzer;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Fizzer fizzer = new Fizzer();
        Buzzer buzzer = new Buzzer();

        fizzer.fizz();
        buzzer.buzz();
        buzzer.countTokens("Hello my dear friends ");

        Animal cat = new Cat();
        Animal dog = new Dog();

        Speaker speaker = new Speaker();
        speaker.speak(cat);
        speaker.speak(dog);
    }
}
