import java.util.*;

public class Solution901 {
    public class StockSpanner {
        private Deque<Pair> stack;

        private class Pair {
            public int price;
            public int weight;

            public Pair(int price, int weight) {
                this.price = price;
                this.weight = weight;
            }
        }

        public StockSpanner() {
            stack = new ArrayDeque<>();
        }

        public int next(int price) {
            int weight = 1;

            while (!stack.isEmpty() && stack.peek().price <= price) {
                weight += stack.pop().weight;
            }

            stack.push(new Pair(price, weight));

            return weight;
        }
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
