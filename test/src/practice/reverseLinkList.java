package practice;


import javax.naming.LinkLoopException;
import java.util.LinkedList;

public class reverseLinkList<T> {
    public static void main(String[] args) {
        printNode(reverseLinkedList1(readyNode()));
    }

    static void printNode(Node node){
        while (node!=null){
            System.out.println(node.data);
            node = node.next;
        }
    }
    static Node reverseLinkedList1(Node node){
        Node currentNode = node;
        Node pNode = null;
        Node headNode = null;
        while (currentNode!=null){
            Node nNode = currentNode.next;
            if (nNode == null){
                headNode = currentNode;
            }
            currentNode.next = pNode;
            pNode = currentNode;
            currentNode = nNode;
        }
        return headNode;
    }
    LinkedList<T> reverseLinkedList(LinkedList<T> linkedList){
        LinkedList<T> newLinkedList = new LinkedList<>();
        for (T o : linkedList) {
            newLinkedList.add(0,o);
        }
        return newLinkedList;
    }
    static Node reverseLinkedList(Node node){
        if (node.next==null){
            return node;
        }else {
            Node headNode = reverseLinkedList(node.next);
            node.next.next = node;
            node.next = null;
            return headNode;
        }
    }
    static class Node {
        Integer data;
        Node next;
    }

    static Node readyNode() {
        Node linkNode1 = new Node();
        linkNode1.data = 1;
        Node linkNode2 = new Node();
        linkNode2.data = 2;
        Node linkNode3 = new Node();
        linkNode3.data = 3;
        Node linkNode4 = new Node();
        linkNode4.data = 4;
        Node linkNode5 = new Node();
        linkNode5.data = 5;
        Node linkNode6 = new Node();
        linkNode6.data = 6;
        linkNode1.next = linkNode2;
        linkNode2.next = linkNode3;
        linkNode3.next = linkNode4;
        linkNode4.next = linkNode5;
        linkNode5.next = linkNode6;
        linkNode6.next = null;
        return linkNode1;
    }
}
