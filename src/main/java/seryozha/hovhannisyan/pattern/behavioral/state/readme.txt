https://www.journaldev.com/1751/state-design-pattern-java

If we have to change the behavior of an object based on its state, we can have a state variable in the Object.
Then use if-else condition block to perform different actions based on the state.
State design pattern is used to provide a systematic and loosely coupled way to achieve this through Context and State implementations.

Context
State Pattern Context is the class that has a State reference to one of the concrete implementations of the State.
Context forwards the request to the state object for processing. Let’s understand this with a simple example.

Suppose we want to implement a TV Remote with a simple button to perform action.
If the State is ON, it will turn on the TV and if state is OFF, it will turn off the TV.