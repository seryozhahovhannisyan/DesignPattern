http://www.journaldev.com/1392/factory-design-pattern-in-java

Factory design pattern is used when we have a super class with multiple sub-classes
and based on input, we need to return one of the sub-class.
This pattern take out the responsibility of instantiation of a class from client program to the factory class.

Let’s first learn how to implement factory design pattern in java and then we will look into factory pattern advantages.
We will see some of factory design pattern usage in JDK.
Note that this pattern is also known as Factory Method Design Pattern.

Super class in factory design pattern can be an interface, abstract class or a normal java class.
For our factory design pattern example, we have abstract super class with overridden toString() method for testing purpose.


java.util.Calendar#getInstance()
java.util.ResourceBundle#getBundle()
java.text.NumberFormat#getInstance()
java.nio.charset.Charset#forName()
java.net.URLStreamHandlerFactory#createURLStreamHandler(String) (Returns singleton object per protocol)
java.util.EnumSet#of()
javax.xml.bind.JAXBContext#createMarshaller() and other similar methods

java.util.Calendar, ResourceBundle and NumberFormat getInstance() methods uses Factory pattern.
valueOf() method in wrapper classes like Boolean, Integer etc.