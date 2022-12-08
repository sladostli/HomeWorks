import java.util.Random;

public class HomeWork6 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik");
        Dog dog1 = new Dog("Sharik");
        cat1.jump(3.0);
        cat1.swim(1.0);
        dog1.swim(0.5);


    }
}

class Animal {
    String name;
    double runLim;
    double jumpLim;
    double swimLim;
    Random random = new Random();

    public Animal(String name) {
        this.name = name;
    }

    public void run(double len){
        if (len <= this.runLim) {
            System.out.println("Run: true");
        } else {
            System.out.println("Run: false");
        }
    }

    public void jump(double h){
        if (h <= this.jumpLim) {
            System.out.println("Jump: true");
        } else {
            System.out.println("Jump: false");
        }
    }

    public void swim(double len){
        if (len <= this.swimLim) {
            System.out.println("Swim: true");
        } else {
            System.out.println("Swim: false");
        }
    }
}

class Dog extends Animal{
    public Dog(String name){
        super(name);
        this.runLim = this.random.nextDouble(200.0, 500.0);
        this.jumpLim = this.random.nextDouble(0.3, 0.5);
        this.swimLim = this.random.nextDouble(2.0, 10.0);
    }
}

class Cat extends Animal{
    public Cat(String name){
        super(name);
        this.jumpLim = this.random.nextDouble(1.0, 2.0);
        this.runLim = this.random.nextDouble(50.0, 200.0);
        this.swimLim = 0;
    }

}
