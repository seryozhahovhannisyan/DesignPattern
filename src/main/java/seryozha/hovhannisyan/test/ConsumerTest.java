package seryozha.hovhannisyan.test;

import java.util.Comparator;
import java.util.HashMap;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerTest<T> {
    public static void main(String[] args) {
        AnObject anObject = new AnObject();

        Consumer<String> consumer1 = (String str) -> anObject.setName(str);
        Consumer<String> consumerName = anObject::setName;
        Consumer<String> consumerDesc = anObject::setDesc;
        Consumer<String> consumerStaticDesc = AnObject::staticDesc;

        Supplier<AnObject> anObjectSupplier = AnObject::new;

        System.out.println("Before accept ");

        consumerName.accept("name");
        consumerDesc.accept("consumerDesc");
        consumerStaticDesc.accept("consumerStaticDesc");

        HashMap hashMap = new HashMap();
//        HashMap.SimpleEntry se = hashMap.
        hashMap.put(1, "1");
        hashMap.get(1);
        Comparator.naturalOrder();
        System.out.println("After accept ");

        ConsumerTest test = new ConsumerTest();
        test.execute(null);
    }

    T execute(Supplier<T> supplier) throws NullPointerException {
        return supplier.get();
    }

}
