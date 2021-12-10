package array;

public class ArrayTest05 {
    public static void main(String[] args) {
        Animals a1 = new Animals();
        Animals a2 = new Animals();
        Animals[] animals = {a1, a2};

        for (int i=0; i<animals.length; i++){
            Animals a = animals[i];
            a.move();
        }
        System.out.println("------------");

        Animals[] ans = new Animals[2];
        ans[0]= new Animals();
        ans[1]= new Cat();
        for (int i=0; i<ans.length; i++){
            Animals a = ans[i];
            a.move();
        }


    }
}
class Animals{
    public void move(){
        System.out.println("moving");
    }
}
class Cat extends Animals{
    public void move(){
        System.out.println("cat is moving");
    }
}