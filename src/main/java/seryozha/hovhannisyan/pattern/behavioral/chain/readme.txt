http://www.journaldev.com/1617/chain-of-responsibility-design-pattern-in-java
Chain of responsibility pattern is used to achieve loose coupling in software design
where a request from client is passed to a chain of objects to process them.
Then the object in the chain will decide themselves who will be processing the request
and whether the request is required to be sent to the next object in the chain or not.



Chain of Responsibility Pattern Example in JDK

Let’s see the example of chain of responsibility pattern in JDK and then we will proceed to implement
a real life example of this pattern. We know that we can have multiple catch blocks in a try-catch block code.
Here every catch block is kind of a processor to process that particular exception.

So when any exception occurs in the try block, its send to the first catch block to process.
If the catch block is not able to process it, it forwards the request to next object in chain i.e next catch block.
If even the last catch block is not able to process it, the exception is thrown outside of the chain to the calling program.

Chain of Responsibility Design Pattern Example

One of the great example of Chain of Responsibility pattern is ATM Dispense machine.
The user enters the amount to be dispensed and the machine dispense amount in terms of defined currency bills
such as 50$, 20$, 10$ etc.

The important point to note here is the implementation of dispense method.
You will notice that every implementation is trying to process the request and based on the amount,
it might process some or full part of it.

If one of the chain not able to process it fully, it sends the request to the next processor in chain to process the remaining request. If the processor is not able to process anything, it just forwards the same request to the next chain.

Chain of Responsibilities Design Pattern – Creating the Chain

This is a very important step and we should create the chain carefully, otherwise a processor might not be getting any request at all.
For example, in our implementation if we keep the first processor chain as Dollar10Dispenser and then Dollar20Dispenser,
then the request will never be forwarded to the second processor and the chain will become useless.