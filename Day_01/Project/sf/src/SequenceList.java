import java.util.Iterator;

public class SequenceList<T> implements Iterable<T> {//<>为泛型

    private int length;
    private T[] elements;

    public SequenceList(int size) {
        this.length = 0;
        this.elements = (T[]) new Object[size];
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int getLength() {
        return length+1;
    }

    public void clear() {
        this.length = 0;
    }

    public T get(int i){
        return elements[i];
    }

    public void insert(T t){
        if (length == elements.length) {
            resize(2*elements.length);
        }
        elements[length++] = t;
    }

    public void insert(int i, T t){
        if (length == elements.length) {
            resize(2*elements.length);
        }
        for (int index = length; index >i;index--) {
            elements[index] = elements[index-1];
        }
        elements[i] = t;
        length++;
    }

    public T remote(int i){
        T current = elements[i];
        for (int index = i; index < length-1;index++) {
            elements[index] = elements[index+1];
        }
        length--;
        if(length<elements.length/4) {
            resize(elements.length/2);
        }
        return current;
    }

    public void resize(int newSize) {
        T[] temp = elements;
        elements = (T[]) new Object[newSize];
        for (int i = 0;i<length;i++) {
            elements[i] = temp[i];
        }
    }

    public int indexof(T t) {
        for (int i =0;i<length;i++) {
            if (elements[i].equals(t)){
                return i;
            }
        }
        return -1;
    }


    @Override
    public Iterator<T> iterator() {
        return new SIterator();
    }

    private class SIterator implements Iterator{
        private int cursor;

        public SIterator() {
            this.cursor = 0;
        }

        @Override
        public boolean hasNext() {
            return cursor<length;
        }

        @Override
        public Object next() {
            return elements[cursor++];
        }
    }
}
