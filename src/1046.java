import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> q = new PriorityQueue<>(stones.length, Collections.reverseOrder());

        for (int i = 0; i < stones.length; i++) {
            q.offer(stones[i]);
        }

        while (q.size() > 1) {
            int y = q.poll();
            int x = q.poll();

            if (x != y) { q.offer(y - x); }
        }

        return q.isEmpty() ? 0 : q.poll();
    }
}
