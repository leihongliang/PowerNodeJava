package javase.collection.LinkListwork01;

public class Link {
    //头节点
    Node header;

    int size = 0;
    public int size() {
        return size;
    }
    //向链表末尾添加元素的方法
    public void add(Object data) {
        //创建一个新的节点对象，让之前单链表的末尾节点指向新的节点对象
        if (header == null) {
            //这时候头节点即是一个头节点，又是一个末尾节点
            header = new Node(data, null);
        } else {
            // 头节点已经有了
            Node currentLastNode = findLast(header);
            currentLastNode.next = new Node(data, null);
        }
        size++;
    }

    //
    private Node findLast(Node node) {
        //next为空则为末尾节点
        if (node.next == null) {
            return node;
        }
        //递归
        return findLast(node.next);
    }


}