package javase.expection.homework2;

public class Test {
    public static void main(String[] args) {
        Army army = new Army(4);
        Fighter fighter = new Fighter();
        Tank tank = new Tank();
        Yun20 yun20 = new Yun20();
        GaoShePao gaoShePao = new GaoShePao();
        Fighter fighter2 = new Fighter();

        try {
            army.addWeapon(fighter);
            army.addWeapon(tank);
            army.addWeapon(yun20);
            army.addWeapon(gaoShePao);
            army.addWeapon(fighter2);
        }catch (AddWeaponException e){
            System.out.println(e.getMessage());
        }
        army.attackAll();
        army.MoveAll();


    }

}
