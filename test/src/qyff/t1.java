package qyff;

public class t1 {

    public static void main(String[] args) {

    }

    public Node findMid(Node root) {
        Node head = root;
        Node temps = head;
        Node tempf = head;
        int len = 0;

        while (tempf != null && tempf.next != null) {

            temps = temps.next;
            tempf = tempf.next.next;
            if (temps == tempf)
                return null;

        }
        tempf = head;
        return temps;
//        temps = head;
//        while (temps != null) {
//            len++;
//            temps = temps.next;
//        }
//        temps = head;
//        for (int i = 0; i < len / 2; i++) {
//            temps = temps.next;
//        }
//        return temps;
    }

     public static class Node {
        Node next;
    }
}
