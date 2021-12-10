package javase.expection.homework2;

public class Fighter extends Weapon implements Moveable, Shootable{
    @Override
    public void move() {
        System.out.println("起飞");
    }

    @Override
    public void shoot() {
        System.out.println("空对空导弹发射");
    }
}
