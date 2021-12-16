package javase.IOStream;

import java.io.Serializable;

public class ObjectOutputStream03 {
    public static void main(String[] args) {

    }
}
class Customer implements Serializable {
    int no;
    public Customer (int no){
        this.no = no;
    }
}