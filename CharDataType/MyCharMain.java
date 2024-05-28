public class MyCharMain {
    public static void main(String[] args) {
        MyChar myChar = new MyChar('d');
        System.out.println(myChar.isVowel());     // 'a','e','i','o','u' and their UpperCase
        System.out.println(myChar.isNumber());
        MyChar.printLowerCaseAlphabets();
        MyChar.printUpperCaseAlphabets();
    }
}
