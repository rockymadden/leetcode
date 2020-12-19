public class Solution1678 {
    public String interpret(String command) {
        char[] cmd = command.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < cmd.length; i++) {
            if (cmd[i] == 'G') {
                sb.append("G");
            } else if (cmd[i] == 'a') {
                sb.append("al");
                i += 2;
            } else if (cmd[i] != '(') {
                sb.append("o");
            }
        }

        return sb.toString();
    }
}
