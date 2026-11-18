import java.util.ArrayDeque;
import java.util.Queue;

public class AnimalShelter {
    private Queue<Animal> cats = new ArrayDeque<>();
    private Queue<Animal> dogs = new ArrayDeque<>();
    private int arrivalOrder = 0;

    public void enqueue(Animal animal) {
        animal = new Animal(animal.getName(), animal.getType(), arrivalOrder++);
        if (animal.getType().equals("cat")) {
            cats.add(animal);
        } else if (animal.getType().equals("dog")) {
            dogs.add(animal);
        } else {
            throw new IllegalArgumentException("Animal type must be 'cat' or 'dog'");
        }
    }

    public Animal dequeueAny() {
        if (cats.isEmpty() && dogs.isEmpty()) {
            return null; // No animals available
        } else if (cats.isEmpty()) {
            return dogs.poll();
        } else if (dogs.isEmpty()) {
            return cats.poll();
        } else {
            Animal cat = cats.peek();
            Animal dog = dogs.peek();
            if (cat.getArrivalOrder() < dog.getArrivalOrder()) {
                return cats.poll();
            } else {
                return dogs.poll();
            }
        }
    }

    public Animal dequeueCat() {
        return cats.poll(); // Returns null if no cats are available
    }

    public Animal dequeueDog() {
        return dogs.poll(); // Returns null if no dogs are available
    }
    
}
