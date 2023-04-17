public class encryptedText {
    public static void main(String[] args) {
        String sm = "abcdefghijklmnopqrstuvwxyz";
        String cp = sm.toUpperCase();
        int key = 1;
        String str = "Bmk";
        StringBuilder result = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 65 && ch <= 90) {
                result.append(cp.charAt(cp.indexOf(ch) + key));
            }
            if (ch >= 97 && ch <= 122) {
                result.append("" + sm.charAt(sm.indexOf(ch) + key));
            }

        }
        System.out.println(result);
    }
}
