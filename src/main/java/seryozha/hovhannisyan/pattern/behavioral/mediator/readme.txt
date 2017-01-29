Mediator design pattern is one of the behavioral design pattern,
so it deals with the behaviors of objects.
Mediator design pattern is used to provide a centralized communication medium between different objects in a system.

Mediator design pattern is very helpful in an enterprise application where
multiple objects are interacting with each other.
If the objects interact with each other directly,
the system components are tightly-coupled with each other that makes higher maintainability cost
and not hard to extend. Mediator pattern focuses on provide a
mediator between objects for communication and help in implementing lose-coupling between objects.

Air traffic controller is a great example of mediator pattern
where the airport control room works as a mediator for communication between different flights.
Mediator works as a router between objects and it can have it’s own logic to provide way of communication.

The system objects that communicate each other are called Colleagues.
Usually we have an interface or abstract class that provides the contract for communication
and then we have concrete implementation of mediators.

Mediator (recognizeable by behavioral methods taking an instance of different abstract/interface type
(usually using the command pattern) which delegates/uses the given instance)

java.util.Timer (all scheduleXXX() methods)
java.util.concurrent.Executor#execute()
java.util.concurrent.ExecutorService (the invokeXXX() and submit() methods)
java.util.concurrent.ScheduledExecutorService (all scheduleXXX() methods)
java.lang.reflect.Method#invoke()