package rocks.zipcode.io.quiz4.generics;

import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<T> extends Group<T> {
    private Set<T> set = new HashSet<>();

    public SortedGroup(){
        this.set = new HashSet<>();
    }
    @Override
    public void insert(T value) {
        set.add(value);
    }

    @Override
    public void delete(T value) {
        this.set.remove(value);
    }

    public Integer indexOf(T value) {
        Object[] arr = set.toArray();
        for(int i =0 ; i < arr.length; i++){
            if(arr[i].equals(value)){
                return i;
            }
        }
        return null;
    }
}
