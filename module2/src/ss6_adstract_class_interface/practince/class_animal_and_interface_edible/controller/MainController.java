package ss6_adstract_class_interface.practince.class_animal_and_interface_edible.controller;

import ss6_adstract_class_interface.practince.class_animal_and_interface_edible.model.animal.Animal;
import ss6_adstract_class_interface.practince.class_animal_and_interface_edible.model.animal.Chicken;
import ss6_adstract_class_interface.practince.class_animal_and_interface_edible.model.animal.Tiger;
import ss6_adstract_class_interface.practince.class_animal_and_interface_edible.model.fruit.Apple;
import ss6_adstract_class_interface.practince.class_animal_and_interface_edible.model.fruit.Fruit;
import ss6_adstract_class_interface.practince.class_animal_and_interface_edible.model.fruit.Orange;

public class MainController {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals){
            System.out.println(animal.makeSound());
        }
        Fruit[]fruits= new Fruit[2];
        fruits[0] = new Apple();
        fruits[1]= new Orange();
        for(Fruit fruit : fruits){
            System.out.println(fruit.howToEat());
        }
    }

    }
