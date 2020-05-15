One of the great real life example of Adapter design pattern is mobile charger.
Mobile battery needs 3 volts to charge but the normal socket produces either 120V (US) or 240V (India).
So the mobile charger works as an adapter between mobile charging socket and the wall socket.

We will try to implement multi-adapter using adapter design pattern in this tutorial.

While implementing Adapter pattern,
there are two approaches –
    class adapter and object adapter –
    however both these approaches produce same result.


    Adapter (recognizeable by creational methods taking an instance of different abstract/interface type
    and returning an implementation of own/another abstract/interface type which decorates/overrides the given instance)

    java.util.Arrays#asList()
    java.util.Collections#list()
    java.util.Collections#enumeration()
    java.io.InputStreamReader(InputStream) (returns a Reader)
    java.io.OutputStreamWriter(OutputStream) (returns a Writer)
    javax.xml.bind.annotation.adapters.XmlAdapter#marshal() and #unmarshal()