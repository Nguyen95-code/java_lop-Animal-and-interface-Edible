package animal;

import edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken : lá chanh, lá chanh";
    }

    @Override
    public String howToEat() {
        return "Thịt em đi ";
    }
}
