Decorator design pattern is used to modify the functionality of an object at runtime.
At the same time other instances of the same class will not be affected by this,
so individual object gets the modified behavior.
Decorator design pattern is one of the structural design pattern
(such as Adapter Pattern, Bridge Pattern, Composite Pattern) and uses abstract classes or interface with composition to implement.



We use inheritance or composition to extend the behavior of an object
but this is done at compile time and its applicable to all the instances of the class.
We can’t add any new functionality of remove any existing behavior at runtime – this is when Decorator pattern comes into picture.

Suppose we want to implement different kinds of cars –
we can create interface Car to define the assemble method and then
we can have a Basic car,
further more we can extend it to Sports car and Luxury Car.
The implementation hierarchy will look like below image.

But if we want to get a car at runtime that has both the features of sports car and luxury car,
then the implementation gets complex and if further more
we want to specify which features should be added first, it gets even more complex.
Now imagine if we have ten different kind of cars,
the implementation logic using inheritance and composition will be impossible to manage.
To solve this kind of programming situation, we apply decorator pattern in java.

We need to have following types to implement decorator design pattern.

Decorator Design Pattern – Important Points

1.Decorator design pattern is helpful in providing runtime modification abilities and hence more flexible.
    Its easy to maintain and extend when the number of choices are more.
2.The disadvantage of decorator design pattern is that it uses a lot of similar kind of objects (decorators).
3.Decorator pattern is used a lot in Java IO classes, such as FileReader, BufferedReader etc.


http://stackoverflow.com/questions/1673841/examples-of-gof-design-patterns-in-javas-core-libraries
Decorator (recognizeable by creational methods taking an instance of same abstract/interface type which adds additional behaviour)

All subclasses of java.io.InputStream, OutputStream, Reader and Writer have a constructor taking an instance of same type.
java.util.Collections, the checkedXXX(), synchronizedXXX() and unmodifiableXXX() methods.
javax.servlet.http.HttpServletRequestWrapper and HttpServletResponseWrapper