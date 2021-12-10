package javase.expection.homework2;

public class Army {
    private Weapon[] weapons;

    /**
     * 初始化武器
     * @param count 武器数量
     */
    public Army(int count) {
        this.weapons  =new Weapon[count];
    }
    public void addWeapon(Weapon weapon) throws AddWeaponException {
        for (int i = 0; i < weapons.length; i++){
            if (null == weapons[i]){
                weapons[i] = weapon;
                System.out.println("添加成功");
                return;
            }
        }
        throw new AddWeaponException("武器数量上限");

    }
    public void attackAll(){
        for (int i = 0; i < weapons.length; i++){
            if (weapons[i] instanceof Shootable){
                Shootable shootable =(Shootable) weapons[i];
                shootable.shoot();
            }
        }
    }
    public void MoveAll(){
        for (int i = 0; i < weapons.length; i++){
            if (weapons[i] instanceof Moveable){
                Moveable moveable =(Moveable) weapons[i];
                moveable.move();
            }
        }
    }

}
