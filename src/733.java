class Solution {
    private class Pair {
        public final int row;
        public final int column;

        public Pair(int row, int column) {
            this.row = row;
            this.column = column;
        }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        Deque<Pair> stack = new ArrayDeque<>();
        final int startingColor = image[sr][sc];
        stack.push(new Pair(sr, sc));

        while (!stack.isEmpty()) {
            Pair pair = stack.pop();

            if (image[pair.row][pair.column] == startingColor) {
                image[pair.row][pair.column] = newColor;

                if (pair.row - 1 >= 0 && image[pair.row - 1][pair.column] != newColor) // Top.
                    stack.push(new Pair(pair.row - 1, pair.column));
                if (pair.column + 1 <= image[0].length - 1 && image[pair.row][pair.column + 1] != newColor) // Right.
                    stack.push(new Pair(pair.row, pair.column + 1));
                if (pair.row + 1 <= image.length - 1 && image[pair.row + 1][pair.column] != newColor) // Bottom.
                    stack.push(new Pair(pair.row + 1, pair.column));
                if (pair.column - 1 >= 0 && image[pair.row][pair.column - 1] != newColor) // Left.
                    stack.push(new Pair(pair.row, pair.column - 1));
            }
        }

        return image;
    }
}
