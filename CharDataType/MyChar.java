public class MyChar {
    private char ch;
    public MyChar(char x) {
        this.ch = x;
    }

    public boolean isVowel() {
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            return true;
        }
        return false;
    }

    public boolean isNumber() {
        return true;
    }

    public static void printLowerCaseAlphabets() {
        for(int i = 97; i <= 122; i++){
            System.out.print((char)i + "\t");
        }
        System.out.println();
    }

    public static void printUpperCaseAlphabets() {
        for(int i = 65; i <= 90; i++){
            System.out.print((char)i + "\t");
        }
        System.out.println();
    }
}
