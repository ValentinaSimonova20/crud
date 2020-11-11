package internship;

import internship.lsp.Animal;
import internship.lsp.Cat;
import internship.lsp.Dog;
import internship.lsp.Speaker;
import internship.srp.Buzzer;
import internship.srp.Fizzer;

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
