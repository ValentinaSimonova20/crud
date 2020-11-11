package internship.lsp;

public class Speaker {
    public void speak(Animal animal){
        if(animal instanceof Cat){
            ((Cat)animal).meow();
        } else if(animal instanceof Dog){
            ((Dog)animal).bark();
        }
    }
}
