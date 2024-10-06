import java.util.*;

public class permutation {

    public static void main(String[] args) {

        ArrayList<String> ans = solve("", "abc");
        for (String s : ans) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> solve(String p, String up) {
        ArrayList<String> result = new ArrayList<>();
        if (up.isEmpty()) {
            result.add(p);
            return result;
        }
        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {

            ArrayList<String> coll = solve(p.substring(0, i) + ch + p.substring(i), up.substring(1));
            result.addAll(coll);
        }
        return result;
    }
}
