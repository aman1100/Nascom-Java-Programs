public class Sample4 {
    public static void printLastChars(String str) {
        String[] arr = str.split(" ");
        StringBuffer newStr = new StringBuffer();

        for (String cur : arr) {
            if (!cur.isBlank())
                newStr.append(cur.charAt(cur.length() - 1));
        }

        System.out.println(newStr);
    }

    public static void main(String[] args) {
        String str = "Hello Welcome Java  World";
        printLastChars(str);
    }
}