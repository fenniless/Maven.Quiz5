package rocks.zipcode.io.quiz4.collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * @author leon on 11/12/2018.
 */
public class SimpleStringGroup implements Iterable<String>{
    private ArrayList<String> list;
    private Iterable<String> itList;
    public SimpleStringGroup() {
        this.list = new ArrayList<>();
    }

    public Integer count() {
        return list.size();
    }

    public void insert(String string) {
        this.list.add(string);
    }

    public Boolean has(String string) {
        if(this.list.contains(string)){
            return true;
        }
        return false;
    }

    public String fetch(int indexOfValue) {
        return this.list.get(indexOfValue);
    }

    public void delete(String string) {
        list.remove(string);
    }

    public void clear() {
        list.clear();
    }

    @Override
    public Iterator<String> iterator() {
        return list.iterator();
    }

    @Override
    public void forEach(Consumer<? super String> action) {

    }

    @Override
    public Spliterator<String> spliterator() {
        return null;
    }
}
