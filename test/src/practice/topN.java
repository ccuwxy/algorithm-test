package practice;

import java.util.*;

public class topN {
    public static void main(String[] args) {
        System.out.println(topKFrequent(new int[]{1, 2, 3, 3, 3, 3, 3, 2, 1, 1, 1}, 2));
    }

    public static List<Integer> topKFrequent(int[] nums, int k) {

        List<Integer> list = new ArrayList<Integer>();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
//		System.out.println(map);
        PriorityQueue<Node> pb = new PriorityQueue<>((o1, o2) -> o2.val - o1.val);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pb.add(new Node(entry.getKey(), entry.getValue()));
        }
        for (int i = 0; i < k; i++) {
            list.add(pb.poll().key);
        }
        return list;
    }

    public static class Node {
        int key;
        int val;

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }
}

