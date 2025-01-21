import java.util.List;

public class GenericsRunner2 {
    public static void main(String[] args) {
        MyCustomList2<Long> list = new MyCustomList2<>();
        list.addElement(12L);
        list.addElement(51L);

        MyCustomList2<Integer> numberList = new MyCustomList2<>();
        numberList.addElement(1234);
        numberList.addElement(4321);

        System.out.println(list);
        System.out.println(numberList);

        Long element = list.get(0);
        System.out.println(element);

        Integer numberElement = numberList.get(1);
        System.out.println(numberElement);
    }
}
