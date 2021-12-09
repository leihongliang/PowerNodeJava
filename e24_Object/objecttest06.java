import java.util.Objects;

public class objecttest06 {
    public static void main(String[] args) {
        User2 u1 = new User2("lhl",new Address2("hangzhou","xiasha","000"));
        User2 u2 = new User2("lhl",new Address2("hangzhou","xiasha","000"));
        System.out.println(u1.equals(u2));
    }
}
class User2{
    String name;
    Address2 addr;

    public User2(String name, Address2 addr) {
        this.name = name;
        this.addr = addr;
    }

    //用户名和住址相同
    public boolean equals(Object o){
        if (this == o)return true;
        if (o == null || !(o instanceof User2)) return false;
        User2 user2 = (User2) o;
        return this.name.equals(user2.name) && this.addr.equals(user2.addr);
    }

}
class Address2 {
    String city;
    String street;
    String zipcode;

    public Address2(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address2 address2 = (Address2) o;
        return Objects.equals(city, address2.city) && Objects.equals(street, address2.street) && Objects.equals(zipcode, address2.zipcode);
    }
}

