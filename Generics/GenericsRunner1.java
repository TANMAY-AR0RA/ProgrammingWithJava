public class GenericsRunner1 {
    public static void main(String[] args) {
        MyCustomList1<String> list = new MyCustomList1<>();
        list.addElement("Hello");
        list.addElement("World");

        System.out.println(list);

        String element = list.get(0);
        System.out.println(element);


        MyCustomList1<Integer> numberList = new MyCustomList1<>();
        numberList.addElement(1234);
        numberList.addElement(4321);

        System.out.println(numberList);

        Integer numberElement = numberList.get(1);
        System.out.println(numberElement);

    }
}
