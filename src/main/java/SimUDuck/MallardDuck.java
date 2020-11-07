package SimUDuck;

public class MallardDuck extends Duck implements Quackable, Flyable{
    @Override
    public void display() {
        System.out.println("Looks like a mallard");
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
