import java.util.*;

public class Solution977ViaPriorityQueue {
    public int[] sortedSquares(int[] A) {
        Queue<Integer> q = new PriorityQueue<>(A.length);

        for (int i = 0; i < A.length; i++) {
            q.offer(A[i] * A[i]);
        }

        for (int i = 0; i < A.length; i++) {
            A[i] = q.poll();
        }

        return A;
    }
}
