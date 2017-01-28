
If you are familiar with factory design pattern in java, you will notice that we have a single Factory class.
This factory class returns different subclasses based on the input provided and factory class
uses if-else or switch statement to achieve this.

In Abstract Factory pattern, we get rid of if-else block and have a factory class for each sub-class.
Then an Abstract Factory class that will return the sub-class based on the input factory class.
At first it seems confusing but once you see the implementation,
its really easy to grasp and understand the minor difference between Factory and Abstract Factory pattern.

Like our factory pattern post, we will use the same super class and sub-classes.

Abstract factory (recognizeable by creational methods returning the factory itself
which in turn can be used to create another abstract/interface type)

javax.xml.parsers.DocumentBuilderFactory#newInstance()
javax.xml.transform.TransformerFactory#newInstance()
javax.xml.xpath.XPathFactory#newInstance()