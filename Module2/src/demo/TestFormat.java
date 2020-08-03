package demo;

public class TestFormat {

    public static void main(String args[]) {
        String str1 = "GFG";
        String str2 = "GeeksforGeeks";
        String str3 = "GeeksforGeeks";

        //%1$ represents first argument, %2$ second argument
        String gfg2 = String.format("%1s,%20s,%30s", str1, str2, str3);
        String gfg3 = String.format("%1s,%10s,%30s", str1, str2, str3);
        String gfg4 = String.format("%1s,%50s,%30s", str1, str2, str3);
        String gfg4 = String.format()
        System.out.println(gfg2);
        System.out.println(gfg3);
        System.out.println(gfg4);
    }
}