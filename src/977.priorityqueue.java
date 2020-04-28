import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int[] sortedSquares(int[] A) {
        Queue<Integer> q = new PriorityQueue<>(A.length);

        for (int i = 0; i < A.length; i++) {
            q.offer((int) Math.pow(A[i], 2));
        }

        for (int i = 0; i < A.length; i++) {
            A[i] = (int) q.poll();
        }

        return A;
    }
}
