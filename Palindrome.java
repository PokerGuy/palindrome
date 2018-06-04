public class Palindrome {
    static boolean isPal(String pal) {
        if (pal.length() == 1) {
            return true;
        } else if (pal.substring(0, 1).equals(pal.substring(pal.length() - 1, pal.length()))) {
            if (pal.length() == 2 || pal.length() == 3) {
                return true;
            } else {
                return isPal(pal.substring(1, pal.length() - 1));
            }
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        StringBuilder smoosh = new StringBuilder();
        for (String arg : args) {
            smoosh.append(arg.toLowerCase());
        }
        System.out.println(smoosh.toString());
        System.out.println(isPal(smoosh.toString()));
    }
}
