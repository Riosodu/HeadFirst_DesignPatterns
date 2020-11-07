package SimUDuck;

public class RubberDuck extends Duck implements Quackable{
    @Override
    public void quack() {
        System.out.println("Squeak");
    }

    @Override
    public void display() {
        System.out.println("Looks like a rubberduck");
    }
}
