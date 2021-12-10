package javase.collection.LinkListwork01;

public class Test {
    public static void main(String[] args) {
        //创建了一个集合对象
        Link link = new Link();
        link.add(100);
        link.add(200);
        //获取元素个数
        System.out.println(link.size());
    }
}
