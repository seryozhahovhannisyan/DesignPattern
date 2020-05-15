package seryozha.hovhannisyan.test;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierTest<T> {
    public static void main(String[] args) {
        Supplier<AnObject> supplier = AnObject::new;
        System.out.println("not executed");

        SupplierTest<AnObject> test = new SupplierTest<>();
        AnObject anObject = test.execute(supplier);

        System.out.println("before name");
        Supplier<String> stringSupplier = anObject::getName;
        System.out.println("executed stringSupplier " + stringSupplier.get());


    }

    T execute(Supplier<T> supplier) {
        return supplier.get();
    }

}
