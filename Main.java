public class Main {
    public static void main(String[] args) {
        AnimalShelter shelter = new AnimalShelter();

        // Enqueue some animals
        shelter.enqueue(new Animal("Whiskers", "cat", 0));
        shelter.enqueue(new Animal("Fido", "dog", 0));
        shelter.enqueue(new Animal("Mittens", "cat", 0));
        shelter.enqueue(new Animal("Rex", "dog", 0));

        // Dequeue any animal
        System.out.println("Dequeue Any: " + shelter.dequeueAny());

        // Dequeue a cat
        System.out.println("Dequeue Cat: " + shelter.dequeueCat());

        // Dequeue a dog
        System.out.println("Dequeue Dog: " + shelter.dequeueDog());

        // Dequeue any animal again
        System.out.println("Dequeue Any: " + shelter.dequeueAny());
    }
        
}
