package SimUDuck;

public class RedheadDuck extends Duck implements Quackable, Flyable{
    @Override
    public void display() {
        System.out.println("Looks like a redhead");
    }

    @Override
    public void quack() {
        System.out.println("Quack!");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
