public class interface02 {
    public static void main(String[] args) {
        Flyable f = new Cats();
        f.fly();
        Flyable f2 = new Snake();
        f2.fly();
    }
}

class Animals{

}
interface Flyable{
    void fly();

}
class Cats extends Animals implements Flyable{
    public void fly(){
        System.out.println("cat is flying");
    }
}
class Pigs extends Animals{

}
class Snake extends Animals implements Flyable{
    @Override
    public void fly() {
        System.out.println("snake is flying");
    }
}