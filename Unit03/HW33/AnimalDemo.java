
import java.util.ArrayList;
import java.util.Collections;

public class AnimalDemo {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Lion", 420.5));
        animals.add(new Animal("Elephant", 1200.0));
        animals.add(new Animal("Zebra", 450.8));
        animals.add(new Animal("Giraffe", 800.3));

        System.out.println("Before Sorting:");
        for (Animal animal : animals) {
            System.out.println(animal);
        }

        Collections.sort(animals);

        System.out.println("\nAfter Sorting:");
        for (Animal animal : animals) {
            System.out.println(animal);
        }

        System.out.println("\nAverage Weight: " + Animal.calcAvg(animals) + " lbs");
    }
}
