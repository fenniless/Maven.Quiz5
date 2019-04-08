package rocks.zipcode.io.quiz4.generics;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @author leon on 11/12/2018.
 */
public class ComparableTreeSet<T> extends TreeSet<T> implements Comparable<T>{
    private Set<T> set = new TreeSet<>();
    public ComparableTreeSet(T... arr) {
        set.addAll(Arrays.asList(arr));
    }

    public ComparableTreeSet() {
        this.set = new TreeSet<>();
    }

    public int compareTo(ComparableTreeSet<T> o) {
//        for(int i =0;i<set.size();i++){
//            if(set.contains(o.))
//        }
        if(set.containsAll(o)){
            return set.size();
        }
        return 0;
    }

    public int compareTo(T o) {
        return 0;
    }

    @Override
    public boolean removeIf(Predicate<? super T> filter) {
        return false;
    }

    @Override
    public Stream<T> stream() {
        return null;
    }

    @Override
    public Stream<T> parallelStream() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super T> action) {

    }
//    @Override
//    public String toString(){
//        return set.toArray().toString();
//    }
}
