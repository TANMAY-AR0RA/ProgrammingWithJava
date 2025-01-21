import java.util.ArrayList;

public class MyCustomList1<T> {
    ArrayList<T> list = new ArrayList<>();

    public void addElement(T element){
        list.add(element);
    }

    public void removeElement(T element){
        list.remove(element);
    }

    public String toString(){
        return list.toString();
    }

    public T get(int i) {
        return list.get(i);
    }
}
