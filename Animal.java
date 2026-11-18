public class Animal {
    private String name;
    private String type; // "cat" or "dog"
    private int arrivalOrder;

    public Animal(String name, String type, int arrivalOrder) {
        this.name = name;
        this.type = type;
        this.arrivalOrder = arrivalOrder;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getArrivalOrder() {
        return arrivalOrder;
    }

    @Override 
    public String toString() {
        return "Animal{name='" + name + "', type='" + type + "', arrivalOrder=" + arrivalOrder + "}";
    }
}