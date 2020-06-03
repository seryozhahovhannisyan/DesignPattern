cFacade design pattern is used to help client applications to easily interact with the system.

Provide a unified interface to a set of interfaces in a subsystem.
Facade Pattern defines a higher-level interface that makes the subsystem easier to use.

Suppose we have an application with set of interfaces to use MySql/Oracle database
and to generate different types of reports, such as HTML report, PDF report etc.

So we will have different set of interfaces to work with different types of database.
Now a client application can use these interfaces to get the required database connection and generate reports.

But when the complexity increases or the interface behavior names are confusing,
client application will find it difficult to manage it.

So we can apply Facade design pattern here and provide a wrapper interface on top of the existing interface
 to help client application


Facade Design Pattern Important Points

1.Facade design pattern is more like a helper for client applications,
    it doesn’t hide subsystem interfaces from the client.
    Whether to use Facade or not is completely dependent on client code.
2.Facade design pattern can be applied at any point of development,
    usually when the number of interfaces grow and system gets complex.
3.Subsystem interfaces are not aware of Facade and they shouldn’t have any reference of the Facade interface.
4.Facade design pattern should be applied for similar kind of interfaces,
    its purpose is to provide a single interface rather than multiple interfaces that does the similar kind of jobs.
5.We can use Factory pattern with Facade to provide better interface to client systems.



http://stackoverflow.com/questions/1673841/examples-of-gof-design-patterns-in-javas-core-libraries
Facade (recognizeable by behavioral methods which internally uses instances of different independent abstract/interface types)

javax.faces.context.FacesContext, it internally uses among others the abstract/interface types
    LifeCycle, ViewHandler, NavigationHandler and many more
    without that the enduser has to worry about it (which are however overrideable by injection).
javax.faces.context.ExternalContext, which internally uses
    ServletContext, HttpSession, HttpServletRequest, HttpServletResponse, etc.