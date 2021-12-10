package javase.expection.homework2;

public class Tank extends Weapon implements Shootable,Moveable{
    @Override
    public void move() {
        System.out.println("tank is moving!");
    }

    @Override
    public void shoot() {
        System.out.println("tank is shooting!");
    }
}
