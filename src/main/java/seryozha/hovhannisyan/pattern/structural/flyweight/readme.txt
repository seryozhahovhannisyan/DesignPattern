Flyweight design pattern is a Structural design pattern
like Facade pattern, Adapter Pattern and Decorator pattern.

Flyweight design pattern is used when we need to create a lot of Objects of a class.
Since every object consumes memory space that can be crucial for low memory devices, such as mobile devices or embedded systems,
flyweight design pattern can be applied to reduce the load on memory by sharing objects.

Before we apply flyweight design pattern, we need to consider following factors

1.The number of Objects to be created by application should be huge.
2.The object creation is heavy on memory and it can be time consuming too.
3.The object properties can be divided into intrinsic and extrinsic properties,
    extrinsic properties of an Object should be defined by the client program.

To apply flyweight pattern, we need to divide Object property into intrinsic and extrinsic properties.
Intrinsic properties make the Object unique
whereas extrinsic properties are set by client code and used to perform different operations.
For example, an Object Circle can have extrinsic properties such as color and width.

For applying flyweight pattern, we need to create a Flyweight factory that returns the shared objects.
For our example, lets say we need to create a drawing with lines and Ovals.
So we will have an interface Shape and its concrete implementations as Line and Oval.
Oval class will have intrinsic property to determine whether to fill the Oval with given color or not
whereas Line will not have any intrinsic property

Notice that I have intensionally introduced delay in creating the Object of concrete classes
to make the point that flyweight pattern can be used for Objects that takes a lot of time while instantiated.

Flyweight Factory

The flyweight factory will be used by client programs to instantiate the Object,
so we need to keep a map of Objects in the factory that should not be accessible by client application.

Whenever client program makes a call to get an instance of Object, it should be returned from the HashMap,
if not found then create a new Object and put in the Map and then return it.
We need to make sure that all the intrinsic properties are considered while creating the Object.

All the wrapper classes valueOf() method uses cached objects showing use of Flyweight design pattern.
The best example is Java String class String Pool implementation.

1.In our example, the client code is not forced to create object using Flyweight factory but
    we can force that to make sure client code uses flyweight pattern implementation but its a complete design decision
    for particular application.
2.Flyweight pattern introduces complexity and if number of shared objects are huge then
    there is a trade of between memory and time, so we need to use it judiciously based on our requirements.
3.Flyweight pattern implementation is not useful when the number of intrinsic properties of Object is huge,
    making implementation of Factory class complex.

Flyweight (recognizeable by creational methods returning a cached instance, a bit the "multiton" idea)

java.lang.Integer#valueOf(int) (also on Boolean, Byte, Character, Short, Long and BigDecimal)