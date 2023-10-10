import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.NoSuchElementException;

class SimpleLinkedList<T> {
    LinkedList<T> myList;

    SimpleLinkedList() {
        myList = new LinkedList<T>();
    }

    SimpleLinkedList(T[] values) {
        myList = new LinkedList<T>();
        for (T val : values) {
            myList.add(val);
        }
    }

    void push(T value) {
        myList.push(value);
    }

    T pop() {
        if (myList.size() == 0) {
            throw new NoSuchElementException();
        }
        return myList.pop();
    }

    void reverse() {
        LinkedList<T> reversedList = new LinkedList<T>();

        for (T it : myList) {
            reversedList.push(it);
        }
        this.myList = reversedList;

    }

    T[] asArray(Class<T> clazz) {
        T[] arr = (T[]) Array.newInstance(clazz, myList.size());
        int i = 0;
        for (T item : myList) {
            arr[i] = item;
            i++;
        }
        return arr;
    }

    int size() {
        return myList.size();
    }
}
