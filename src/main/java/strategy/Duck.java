package strategy;

import strategy.fly.FlyBehavior;
import strategy.quack.QuackBehavior;





public abstract class Duck {
    // 잘 변하는 기능들
    // 인터페이스를 기능을 구현하고 상위 클래스의 필드로 넣음으로써 기능을 위임한다.
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    //위임된 기능들을 사용할 수 있도록 메소드 구현
    public void performFly(){
        flyBehavior.fly();
    }
    public void performQuack(){
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    // 변하지 않거나 잘 변하지 않는 코드
    public void swim(){
        System.out.println("normal swim");
    }
    public void display(){
        System.out.println("look nice");
    }
}
