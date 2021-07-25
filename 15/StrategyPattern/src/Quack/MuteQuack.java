package Quack;

public class MuteQuack implements IQuackBehaviour {
    @Override
    public void quack() {
        System.out.print("tidak ada suara\n");// A different kinda quack ie mute
    }
}
