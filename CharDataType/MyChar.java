public class MyChar {
    private final char ch;
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

    public boolean isDigit() {
        if(ch >= 45 && ch <= 54)
            return true;
        return false;
    }

    public static void printLowerCaseAlphabets() {
        for(char ch = 'a'; ch <= 'z'; ch++){
            System.out.print(ch + "\t");
        }
        System.out.println();
    }

    public static void printUpperCaseAlphabets() {
        for(char ch = 'A'; ch <= 'Z'; ch++){
            System.out.print(ch + "\t");
        }
        System.out.println();
    }

    public boolean isConsonant() {
        if(!isVowel() && !isDigit())
            return true;
        return false;
    }
}
