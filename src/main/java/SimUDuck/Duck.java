package SimUDuck;

public abstract class Duck {
    public void quack() {
        System.out.println("Quack!");
    }

    public void swim() {
        System.out.println("I'm swiming");
    }

    public abstract void display();

    public void fly() {
        System.out.println("I'm flying");
    }

}
