package javase.collection.LinkListwork01;

public class Node {
    //数据
    Object data;
    //下一个节点的内存地址
    Node next;

    public Node(){}

    public Node(Object data,Node next){
        this.data = data;
        this.next = next;
    }
}
