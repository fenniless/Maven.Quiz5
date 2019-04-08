package rocks.zipcode.io.quiz4.generics;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.Stack;
import java.util.function.Consumer;

/**
 * @author leon on 11/12/2018.
 */
public class MyStack<SomeType> implements Iterable<SomeType>{
    Stack<SomeType> stack;
    private Object EmptyStackException;

    public MyStack() {
        this.stack = new Stack<>();
    }

    public Boolean isEmpty() {
        if (this.stack.empty()){
            return true;
        }
        return false;
    }

    public void push(SomeType i) {
        stack.add(0,i);
    }

    public SomeType peek() {
        if(stack.isEmpty()){
            return null;
        }
        return stack.firstElement();
    }

    public SomeType pop(){
        if(stack.isEmpty()) {
            throw new EmptyStackException();
        }
        SomeType element = stack.get(0);
        stack.remove(0);
        return element;
    }

    @Override
    public Iterator<SomeType> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super SomeType> action) {

    }

    @Override
    public Spliterator<SomeType> spliterator() {
        return null;
    }
}
