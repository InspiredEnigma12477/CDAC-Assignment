What is Hibernate ?
0. Complete solution to the problem of managing persistence  in Java.
1. ORM tool.(Object Relational Mapping)  used mainly in data access layer or DAO layer.
2. Provides automatic & transperent persistence.
3. JPA(Java Persistence API) implementor
JPA vs Hibernate
JPA ---standard part of J2EE specification --vendor --J2EE / Jakarta EE(sun/oracle/Eclipse)
Implementation classes -- JAR ---hibenrate core JARs(implementor of JPA)

Provides automatic & transparent persistence framework to store & retrieve data from database.
Open Source Java based framework founded by Gavin King in 2001, hosted on hibernate.org
Currently hosted on sourceforge.net
Java Persistence API (JPA) compliant
Current version Hibernate 5.x / 6.x
Other popular ORM Frameworks 
EclipseLink,iBATIS,Kodo etc.



WHY Hibernate?

It mediates the applications interaction with a relational database, leaving the developer free to concentrate on the business problem at hand.

J2EE developer does not have to use JDBC API & manage data persistence at RDBMS level. 
No need to go to Table/Query/Column level.
One has to bootstrap Hibernate framework , create transient(=not yet persistent) POJOs & then rely entirely on Hibernate frmwork to manage persistence

ref : why hibernate readme
--------------------
Details

There is huge mismatch between Object & Relational world.
Formally referred as -- Object-Relational Impedance Mismatch' (sometimes called the 'paradigm mismatch)

Important Mismatch Points
1. Granularity
2. Sub Types or inheritance n polymorphism
3. Identity
4. Associations
5. Data Navigation

Cost of Mismatch
1.SQL queries in Java code 
2.Iterating through ResultSet & mapping it to POJOs or entities.
3.SQL Exception handling.
4. Transaction management
5. Caching 
6. Connection pooling
7. Boiler plate code





Hibernate Frmwork --- popular ORM Tool ---JPA (Java perssitence API) provider 

Hibernate 4.x --- JPA compliant --- Java persistence API --- Its part of J2EE specifications.  ---Is fully JPA compliant 
BUT it also has additional services / annotations --- specific to Hibernate.

Dev MUST add hibernate JARs ---while deploying appln on web server. Need not add JPA provider JARs , while working on appln server.


Transparent persistence provider.(As POJOs or Entities are not bound to any Persistence API ---  its written completely independent of Persistence Provider.)

--Fully supports OOP features --- association,inheritance & polymorphism

--can persist object graphs , consisting of asso. objects

--caches data which is fetched repeatedly (via L1 & L2 cache) -- thus reduces DB traffic(L1 cache - at session level -- built in. L2 cache - pluggable) (More on caching at end of document)

--supports lazy loading -- thus increases DB performance.
(Meaning --- Lazy fetchingThe associated object or collection is fetched lazily, when its first accessed. This results in a new request to the database (unless the associated object is cached). Eager fetchingThe associated object or collection is fetched together with the owning object, using an SQL outer join, and no further database request is required.

--supports Objectified version of SQL -- HQL --works on objects & properties
--Hibernate usually obtains exactly the right lock level automatically . so developer need not worry about applying Read/Write lock.

Some basics 

1. Hibernate uses runtime reflection to determine the persistent properties of a class. 

2.
The objects to be persisted(called as POJO or Entity) are defined in a mapping document or marked with annotations.
Either these HBM XML docs or annotations serves to describe the persistent fields and associations, as well as any subclasses or proxies of the persistent object. 

3.

The mapping documents or annotations are compiled at application startup time and provide the framework with necessary information for a persistent class.
4.

What is Hibernate config.?

An instance of Hib Configuration allows the application to specify properties and mapping documents to be used at the frmwork start-up.
The Configuration  : initialization-time object. 

5.

SessionFactory is created from the compiled collection of mapping documents . 
The SessionFactory provides the mechanism for managing persistent classes, the Session interface. 
 
6.
A web application or Java SE apllication will create a single Configuration, build a single instance of SessionFactory and then instantiate multiple Sessions in threads servicing client requests. 

SessionFactory :  immutable and does not reflect  any changes done later  to the Configuration.

7. The Session class provides the interface between the persistent data store and the application. 
The Session interface wraps a JDBC connection, which can be user-managed or controlled by Hibernate.


Hibernate Session 

A Hibernate Session  is a set of managed entity instances that exist in a particular data store. 


Managing an Entity Instances Life Cycle

You manage entity instances(or POJOs) by invoking operations on the entity/POJO  using EntityManager/Session instance. 

Entity instances are in one of four states  (2 imp aspects of it : its asso. with the hibernate session & sync of its state with the underlying DB)

States : new or transient , managed or persistent, detached, removed.

New entity instances have no persistent identity and are not yet associated with a hib. session (transient)

Managed entity instances have a persistent identity and are associated with a hib. session.(persistent : via save() or saveOrUpdate()) Changes to DB will be done when tx is commited.

Detached entity instances have a persistent identity and are not currently associated with a persistence context/Hib session.

Removed entity instances have a persistent identity, are associated with a persistent context and are scheduled for removal from the data store.(removed via  session.delete(obj))

Introduction to Hibernate Caching

While working with Hibernate web applications we will face so many problems in its performance due to database traffic. That too when the database traffic is very heavy . Actually hibernate is well used just because of its high performance only. So some techniques are necessary to maintain its performance. 

Caching is the best technique to solve this problem. 

The performance of Hibernate web applications is improved using caching by optimizing the database applications. 

The cache actually stores the data already loaded from the database, so that the traffic between our application and the database will be reduced when the application want to access that data again. 
At maximum the application will work with the data in the cache only. Whenever some another data is needed, the database will be accessed. Because the time needed to access the database is more when compared with the time needed to access the cache. So obviously the access time and traffic will be reduced between the application and the database. 
Here the cache stores only the data related to current running application. In order to do that, the cache must be cleared time to time whenever the applications are changing.


Difference in get & load
1. Both use common API (i.e load or get(Class c,Serializable id))
Ret type = T
In get --- if id doesn't exist --- rets null
In load --- if id doesn't exist & u are accessing it from within hib session --- throws ObjectNotFoundExc
2. In get --- Hibernate uses eager fetching policy ---- meaning will generate select query always & load the state from DB in persistent POJO ref. --- so even if u access the same from within the session(persistent pojo)  or outside (detached) the hib session --- NO EXCEPTION(proxy + state)

3. In load --- Hib uses lazy fetching policy ---- meaning it will , by default NOT generate any select query --- so what u have is ONLY PROXY(wrapper ---with no state loaded from DB) --- on such a proxy --- if u access anything outside the hib session(detached) ---- 
U WILL GET ---LazyInitializationExc 
Fix --- 1. Change fetch type --- to eager (NOT AT ALL reco.=> no caching , disabling L1 cache) 
2. If u want to access any POJO in detached manner(i.e outside hib session scope) -
fire non-id get method from within session & then hib has to load entire state from DB ---NO LazyInitializationExc 



Session API update Vs merge
Both methods transition detached object to persistent state.

 Update():- if you are sure that the session does not contain an already persistent instance with the same identifier then use update to save the data in hibernate.  If session has such object with same id , then it throws ---  org.hibernate.NonUniqueObjectException: a different object with the same identifier value was already associated with the session:


Merge():-if you want to save your modificatiions at any time with out knowing about the state of an session then use merge() in hibernate.

 





Lazy fetching (becomes important in relationships or in Load Vs get)
When a client requests an entity(eg - Course POJO) and its associated graph of objects(eg -Student POJO)  from the database, it isnt usually necessary to retrieve the whole graph of every (indirectly) associated
object. You wouldnt want to load the whole database into memory at once;
eg: loading a single Category shouldnt trigger the loading of all Items in that category(one-->many)
----------------------------------------------------------

 What is Session?

Represents a wrapper around pooled out jdbc connection.

---------------------
Session object is persistance manager for the 
hibernate application

Session object is the abstraction of hibernate 
engine for the Hibernate application

Session object provides methods to perform
 CRUD operations

Example

  save()                 -    Inserting the record
  get() / load()         -    Retrieveing the record
  update()               -    Updating the record
  delete()               -    Deleting the record



What is SessionFactory?
-------------------------------
It is a factory(provider) of session objects.

we use sessionfactory object to create session 
object

It is a heavy weight object, therefore it has to
be created only once for an application(typically @ appln start up time) -- typically one per DB per web application.

Its immutable --- Once SF is created , changes made to hibernate.cfg.xml will  not be auto reflected in SF.





What is Configuration Object ?
------------------------------------------
Configuration object is used to create the 
SessionFactory object.

Object Oriented Representation of  Hibernate 
configuration file  and 
mapping files(or annotations)  is nothing but Configuration object.

When we call configure() method on configuration
 object ,hibernate configuration file(hibernate.cfg.xml from run time classpath)  and mapping 
files (or resources) are loaded in the memory.
---------------------
Why connection pooling?

Java applications should use connection pools because :
    Acquiring a new connection is too expensive
    Maintaining many idle connections is expensive
    Creating prepared statements is expensive

Hibernate provides basic or primitive connection pool -- useful only for classroom testing.
Replace it by 3rd party vendor supplied connection pools(eg Apache or C3P0 or hikari in spring boot) for production grade applications.
-----------------------
Natural Key Vs Surrogate Key

If u have User reg system -- then u have a business rule that --- user email must be distinct. So if u want to make this as a prim key --then user will have to supply this during regsitration. 
This is called as natural key. Since its value will be user supplied , u cant tell hibernate to generate it for u---i.e cant use @GeneratedValue at all.

Where  as -- if u say I will reserve user id only for mapping purposes(similar to serial no ), it need not come from user at all & can definitely use hib. to auto generate it for u---this is ur surrogate key & can then use @GeneratedValue.























