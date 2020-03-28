package nowcoder.testhortor;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class t3 {
    static class Node{
        String val;
//        boolean visited;
        Node next;

        public Node(String val,Node next) {
            this.val = val;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] split = str.split("|");
        String[] edges = split[0].split(";");
        String[] startNode = split[1].split(",");
        Set<String> startSet = new LinkedHashSet<String>(Arrays.asList(startNode));

        String[] endNode = split[2].split(",");
        Set<String> endSet = new LinkedHashSet<String>(Arrays.asList(endNode));
        Set<Node> startNodes = new LinkedHashSet<>();
        for (int i = 0; i < startSet.size(); i++) {
            Node node = new Node(startNode[i],null);
            startNodes.add(node);
        }
//        Node[] nodes = new Node[startNode.length];
//        for (int i = 0; i < nodes.length; i++) {
//            nodes[i].val = startNode[i];
//            nodes[i].next = null;
//
//        }


    }


}