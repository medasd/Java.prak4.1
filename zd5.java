package Animal;

public class zd5 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];

        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Dog();

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}

class Animal {
    public void makeSound() {
        System.out.println("Generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Гав!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Мяу!");
    }
}