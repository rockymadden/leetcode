class Trie {
    private Node root;

    private class Node {
        public Character letter;
        public Map<Character, Node> children;

        public Node (Character letter) {
            this.letter = letter;
            this.children = new HashMap<>();
        }
    }


    /** Initialize your data structure here. */
    public Trie() {
        root = new Node(null);
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        char[] letters = word.toCharArray();
        Node node = root;

        for (char letter : letters) {
            if (!node.children.containsKey(letter)) {
                node.children.put(letter, new Node(letter));
            }

            node = node.children.get(letter);
        }

        node.children.put('\0', new Node('\0'));
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        char[] letters = word.toCharArray();
        Node node = root;

        for (char letter : letters) {
            if (!node.children.containsKey(letter)) return false;

            node = node.children.get(letter);
        }

        return node.children.containsKey('\0');
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        char[] letters = prefix.toCharArray();
        Node node = root;

        for (char letter : letters) {
            if (!node.children.containsKey(letter)) return false;

            node = node.children.get(letter);
        }

        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
