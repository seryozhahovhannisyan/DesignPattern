Memento design pattern is one of the behavioral design pattern.
Memento design pattern is used when we want to save the state of an
object so that we can restore later on. Memento pattern is used to implement this in
such a way that the saved state data of the object is not accessible outside of the object,
this protects the integrity of saved state data.

Memento design pattern is implemented with two objects – Originator and Caretaker.

Originator is the object whose state needs to be saved and
restored and it uses an inner class to save the state of Object.
The inner class is called Memento and it’s private, so that it can’t be accessed from other objects.

Caretaker is the helper class that is responsible for storing and restoring the Originator’s
state through Memento object. Since Memento is private to Originator,
Caretaker can’t access it and it’s stored as an Object within the caretaker.

Memento Design Pattern Java

One of the best real life example is the text editors where we can save it’s data anytime and
use undo to restore it to previous saved state.

We will implement the same feature and provide a utility where we can write and save contents to a File anytime
and we can restore it to last saved state. For simplicity, I will not use any IO operations to write data into file.

Memento pattern is simple and easy to implement, one of the thing needs to take care is that
Memento class should be accessible only to the Originator object.
Also in client application, we should use caretaker object for saving and restoring the originator state.

Also if Originator object has properties that are not immutable,
we should use deep copy or cloning to avoid data integrity issue like
I have used in above example. We can use Serialization to achieve memento pattern implementation
that is more generic rather than Memento pattern where every object needs to have it’s own Memento class implementation.

One of the drawback is that if Originator object is very huge then
Memento object size will also be huge and use a lot of memory.

Memento (recognizeable by behavioral methods which internally changes the state of the whole instance)

java.util.Date (the setter methods do that, Date is internally represented by a long value)
All implementations of java.io.Serializable
All implementations of javax.faces.component.StateHolder