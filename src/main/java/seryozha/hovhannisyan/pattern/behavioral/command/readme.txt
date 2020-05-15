Command Pattern is one of the Behavioral Design Pattern.
Command design pattern is used to implement loose coupling in a request-response model.

In command pattern, the request is send to the invoker and invoker pass it to the encapsulated command object.

Command object passes the request to the appropriate method of Receiver to perform the specific action.

The client program create the receiver object and then attach it to the Command.
Then it creates the invoker object and attach the command object to perform an action.

Now when client program executes the action, it’s processed based on the command and receiver object.

Command Design Pattern Example

We will look at a real life scenario where we can implement Command pattern.
Let’s say we want to provide a File System utility with methods to open, write and close file.
This file system utility should support multiple operating systems such as Windows and Unix.

To implement our File System utility, first of all we need to create the receiver classes that will actually do all the work.

Since we code in terms of interface in java, we can have FileSystemReceiver interface and
it’s implementation classes for different operating system flavors such as Windows, Unix, Solaris etc.

https://howtodoinjava.com/design-patterns/behavioral/command-pattern/


