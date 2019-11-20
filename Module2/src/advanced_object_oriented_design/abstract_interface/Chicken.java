package advanced_object_oriented_design;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck cluck";
    }

    @Override
    public String howToeat() {
        return "gà có thể luộc,chiên,kho";
    }
}
