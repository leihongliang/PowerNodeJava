package array;

import java.util.Objects;
import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Scanner s = new Scanner(System.in);
        while (true){
            System.out.println("welcome![1]list [2]order room [3]exit room");
            s.nextInt();
            int i = s.nextInt();
            if (i == 1){
                hotel.print();
            }else if (i == 2){
                System.out.println("which room?");
                int roomNo = s.nextInt();
                hotel.order(roomNo);
            }else if (i == 3){
                System.out.println("which room?");
                int roomNo = s.nextInt();
                hotel.exit(roomNo);
            }
        }

    }
}

class Room{
    private int no;
    private String type;
    private boolean status;

    public Room() {
    }

    public Room(int no, String type, boolean status) {
        this.no = no;
        this.type = type;
        this.status = status;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString(){
        return no+","+type+","+(status?"empty":"full")+" | ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return no == room.no && status == room.status && Objects.equals(type, room.type);
    }

}

class Hotel{
    private Room[][] rooms;
    public Hotel(){
        rooms = new Room[3][10];
        for (int i=0;i<rooms.length;i++){
            for (int j=0; j<rooms[i].length; j++){
                if (i==0){
                    rooms[i][j]=new Room((i+1)*100+j+1,"level1",true);
                }else if (i==1){
                    rooms[i][j]=new Room((i+1)*100+j+1,"level2",true);
                }else if (i==2){
                    rooms[i][j]=new Room((i+1)*100+j+1,"level3",true);
                }
            }
        }
    }

    public void print(){
        for (int i= 0;i<rooms.length;i++){
            for (int j=0;j<rooms[i].length;j++){
                Room room = rooms[i][j];
                System.out.print(room);
            }
            System.out.println();
        }
    }

    public void order(int roomNo){
        Room room = rooms[roomNo/100-1][roomNo%100-1];
        room.setStatus(false);
        System.out.println(room);
        System.out.println("ROOM: "+roomNo+" success");
    }
    public void exit(int roomNo){
        Room room = rooms[roomNo/100-1][roomNo%100-1];
        room.setStatus(true);
        System.out.println("ROOM: "+roomNo+" success");
    }
}