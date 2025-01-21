import java.util.ArrayList;

public class MyCustomList2<T extends Number> {
//All subclasses of Number class can be used
    ArrayList<T> list = new ArrayList<>();
    public void addElement(T element){
        list.add(element);
    }

    public void removeElement(T element){
        list.remove(element);
    }

    public T get(int i) {
        return list.get(i);
    }

    public String toString(){
        return list.toString();
    }
}
