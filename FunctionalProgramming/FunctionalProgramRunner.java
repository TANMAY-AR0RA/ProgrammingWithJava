import java.util.List;

public class FunctionalProgramRunner {
    public static void main(String[] args) {
        List<String> list = List.of("Apple", "Bat", "Cat", "Dog","Rat");
        //printBasic(list);
        //printWithFP(list);
        //printBasicWithFiltering(list);
        printWithFPWithFiltering(list);
    }
    public static void printWithFP(List<String> list){
        list.stream()
                .forEach(
                        element -> System.out.println(element) //lambda expression
                );
    }
    public static void printBasic(List<String> list){
        for(String str : list) {
            System.out.println(str);
        }
    }

    public static void printBasicWithFiltering(List<String> list){
        for(String str : list){
            if(str.endsWith("at")){
                System.out.println(str);
            }
        }
    }

    public static void printWithFPWithFiltering(List<String> list){
        list.stream()
                .filter(
                        element -> element.endsWith("at"))
                .forEach(
                        element -> System.out.println(element)
                );
    }
}
