package strategy;

public abstract class Duck {
	FlyBehaviour flyBehavior;
	QuackBehaviour quackBehavior;

	public Duck() {
	}

	public void setFlyBehavior(FlyBehaviour fb) {
		flyBehavior = fb;
	}

	public void setQuackBehavior(QuackBehaviour qb) {
		quackBehavior = qb;
	}

	abstract void display();

	public void performFly() {
		flyBehavior.fly();
	}

	public void performQuack() {
		quackBehavior.quack();
	}

	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}

}