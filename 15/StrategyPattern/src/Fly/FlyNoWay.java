package Fly;

public class FlyNoWay implements IFlyBehaviour {
    @Override
    public void fly() {
        System.out.print("tidak dapat terbang\n");// Cannot Fly
    }
}
