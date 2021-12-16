package B_OOP.e23_interface;

public class interface03 {
    public static void main(String[] args) {
        FoodMenu cook1 = new AmericaCook();//多态  可以换成Chinese American
        Customers customers1 = new Customers(cook1);
        customers1.order();
    }
}
class Customers{
    private FoodMenu foodMenu;
    public Customers(FoodMenu foodMeanu){
        this.foodMenu = foodMeanu;
    }

    public FoodMenu getFoodMenu() {
        return foodMenu;
    }

    public void setFoodMenu(FoodMenu foodMeanu) {
        this.foodMenu = foodMeanu;
    }

    public void order(){
        FoodMenu fm = this.getFoodMenu();
        foodMenu.baozi();
    }
}
//
interface FoodMenu{
    void baozi();
}
class AmericaCook implements FoodMenu{
    public void baozi(){
        System.out.println("america boazi");
    }

}
class ChineseCook implements FoodMenu{
    public void baozi(){
        System.out.println("chinese boazi");
    }
}


