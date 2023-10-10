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
        // myList.reverse
    }

    T[] asArray(Class<T> clazz) {
        T[] arr = myList.toArray(arr 0);
        return 

    }

    int size() {
        return myList.size();
    }
}
