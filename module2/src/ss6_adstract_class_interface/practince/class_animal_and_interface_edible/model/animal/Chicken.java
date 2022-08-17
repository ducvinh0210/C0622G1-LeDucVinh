package ss6_adstract_class_interface.practince.class_animal_and_interface_edible.model.animal;

import ss6_adstract_class_interface.practince.class_animal_and_interface_edible.model.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck- cluck! ";
    }

    @Override
    public String howToEat() {
        return "could be filled";
    }
}
