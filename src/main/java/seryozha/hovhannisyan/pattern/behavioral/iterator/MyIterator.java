package seryozha.hovhannisyan.pattern.behavioral.iterator;


import java.util.*;
import java.util.function.Consumer;

public interface MyIterator<E> {

    boolean hasNext();

    E next();

    default void remove() {
        throw new UnsupportedOperationException("remove");
    }

    default void forEachRemaining(Consumer<? super E> action) {
        Objects.requireNonNull(action);
        while (hasNext())
            action.accept(next());
    }
}
