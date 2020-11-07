package SimUDuck;

public abstract class Duck {
    FlyBehaviour flyBehavior;
    QuackBehavior quackBehavior;

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public abstract void display();

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

}
