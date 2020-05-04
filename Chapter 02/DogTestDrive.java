class Dog {
    int size;
    String breed;
    String name;

    void bark() {
        System.out.println("Ruff!");
    }
}

public class DogTestDrive {
    public static void main (String[] args) {
        Dog d = new Dog();
        d.size = 40;
        d.bark();
        System.out.println(d.size);
    }
}
