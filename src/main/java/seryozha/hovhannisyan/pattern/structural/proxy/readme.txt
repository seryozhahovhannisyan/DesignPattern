Proxy design pattern intent according to GoF is:

The definition itself is very clear and proxy design pattern is used
when we want to provide controlled access of a functionality.

Let’s say we have a class that can run some command on the system.
Now if we are using it, its fine but if we want to give this program to a client application,
it can have severe issues because client program can issue command to
delete some system files or change some settings that you don’t want.

java.lang.reflect.Proxy
java.rmi.*
javax.ejb.EJB (explanation here)
javax.inject.Inject (explanation here)
javax.persistence.PersistenceContext