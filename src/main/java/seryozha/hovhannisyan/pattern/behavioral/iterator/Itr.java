package seryozha.hovhannisyan.pattern.behavioral.iterator;

import java.util.*;
import java.util.function.Consumer;

public class Itr<E> implements MyIterator<E> {
    int cursor;       // index of next element to return
    int lastRet = -1; // index of last element returned; -1 if no such
    int expectedModCount = 0, modCount =0;//modCount;

    // prevent creating a synthetic constructor
    Itr() {}

    public boolean hasNext() {
//        return cursor != size;
        return false;
    }

    @SuppressWarnings("unchecked")
    public E next() {
//        checkForComodification();
//        int i = cursor;
//        if (i >= size)
//            throw new NoSuchElementException();
//        Object[] elementData = ArrayList.this.elementData;
//        if (i >= elementData.length)
//            throw new ConcurrentModificationException();
//        cursor = i + 1;
//        return (E) elementData[lastRet = i];
        return null;
    }

    public void remove() {
        if (lastRet < 0)
            throw new IllegalStateException();
        checkForComodification();

        try {
//            ArrayList.this.remove(lastRet);
            cursor = lastRet;
            lastRet = -1;
            expectedModCount = modCount;
        } catch (IndexOutOfBoundsException ex) {
            throw new ConcurrentModificationException();
        }
    }

    @Override
    public void forEachRemaining(Consumer<? super E> action) {
        Objects.requireNonNull(action);
//        final int size = ArrayList.this.size;
//        int i = cursor;
//        if (i < size) {
//            final Object[] es = elementData;
//            if (i >= es.length)
//                throw new ConcurrentModificationException();
//            for (; i < size && modCount == expectedModCount; i++)
//                action.accept(elementAt(es, i));
//            // update once at end to reduce heap write traffic
//            cursor = i;
//            lastRet = i - 1;
//            checkForComodification();
//        }
    }

    final void checkForComodification() {
//        if (modCount != expectedModCount)
//            throw new ConcurrentModificationException();
    }
}
//
//private class ListItr extends ArrayList.Itr implements ListIterator<E> {
//    ListItr(int index) {
//        super();
//        cursor = index;
//    }
//
//    public boolean hasPrevious() {
//        return cursor != 0;
//    }
//
//    public int nextIndex() {
//        return cursor;
//    }
//
//    public int previousIndex() {
//        return cursor - 1;
//    }
//
//    @SuppressWarnings("unchecked")
//    public E previous() {
//        checkForComodification();
//        int i = cursor - 1;
//        if (i < 0)
//            throw new NoSuchElementException();
//        Object[] elementData = ArrayList.this.elementData;
//        if (i >= elementData.length)
//            throw new ConcurrentModificationException();
//        cursor = i;
//        return (E) elementData[lastRet = i];
//    }
//
//    public void set(E e) {
//        if (lastRet < 0)
//            throw new IllegalStateException();
//        checkForComodification();
//
//        try {
//            ArrayList.this.set(lastRet, e);
//        } catch (IndexOutOfBoundsException ex) {
//            throw new ConcurrentModificationException();
//        }
//    }
//
//    public void add(E e) {
//        checkForComodification();
//
//        try {
//            int i = cursor;
//            ArrayList.this.add(i, e);
//            cursor = i + 1;
//            lastRet = -1;
//            expectedModCount = modCount;
//        } catch (IndexOutOfBoundsException ex) {
//            throw new ConcurrentModificationException();
//        }
//    }
//}
