package seryozha.hovhannisyan.ocp.functional.predicate;

import java.util.Objects;

@FunctionalInterface
public interface MyPredicate<T> {


    boolean test(T t);

    default MyPredicate<T> and(MyPredicate<? super T> other) {
        Objects.requireNonNull(other);
        return (t) -> test(t) && other.test(t);
    }

    default MyPredicate<T> negate() {
        return (t) -> !test(t);
    }

    default MyPredicate<T> or(MyPredicate<? super T> other) {
        Objects.requireNonNull(other);
        return (t) -> test(t) || other.test(t);
    }

    static <T> MyPredicate<T> isEqual(Object targetRef) {
        return (null == targetRef)
                ? Objects::isNull
                : object -> targetRef.equals(object);
    }

    @SuppressWarnings("unchecked")
    static <T> MyPredicate<T> not(MyPredicate<? super T> target) {
        Objects.requireNonNull(target);
        return (MyPredicate<T>) target.negate();
    }

}
