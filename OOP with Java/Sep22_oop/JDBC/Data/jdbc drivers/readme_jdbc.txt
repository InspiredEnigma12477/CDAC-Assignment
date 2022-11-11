WHY JDBC ? (Java Database Connectivity)
JDBC ensures (PARTIAL) DB vendor independence + platform independence to Java Applications .

HOW it grants DB independence?

1. JAR supplied by DB vendor or Driver vendor --- consists of JDBC driver -- i.e. a converter for Java Data <-----> Native DB types & implementation classes , vendor specific.
2. JDBC API (java.sql) consists of largely --- Interfaces.

Java  supplies specifications or WHAT (i/fs ) & leaves implementation to DB vendors or 3rd party JDBC drvr vendors.

eg : java.sql.Connection --i/f sun supplied(Java SE)
Imple class provided by MySQL -- com.mysql.cj.jdbc.ConnectionImpl.class
Imple class provided by Oracle
oracle.jdbc.OracleConnection

DB2Connection etc....



Generalized steps for DB connectivity (ref : jdbc overview)

1. Place the JDBC driver in the Java classpath
Typically JDBC drivers are in form of JAR(Java archival format : compressed bundle of pkged Java classes) : 
Oracle supplies Type IV Thin Client type of the Driver : ojdbc14.jar/classes12.jar/ojdbc6.jar/ojdbc8.jar
MySQL supplies Type IV JDBC Driver : mysql-connector-java-8.0.20.jar

How to add JDBC drvr's JAR  to the classpath(w/o IDE)
set classpath=g:\oracle\jdbc\lib\ojdbc8.jar;
With IDE --- simply Add external Jar.

2. Load & register JDBC driver 

2.1 Load the JDBC driver in JVM's memory.

Method of java.lang.Class<T>
public static Class forName(String F.Q clsName) throws ClassNotFoundException

eg : Class.forName("com.mysql.cj.jdbc.Driver");


3. Get the fixed DB connection thro' the JDBC driver.
API : java.sql.DriverManager (class)
public static Connection getConnection(String dbURL,String userName,String password) throws SQLException

Params : dbURL : URL to reach DB thro the drvr.
jdbc:oracle:thin:@HostDetails --- for oracle Type IV thin clnt driver
HostDetails = DBServerHost:1521:SID

eg : jdbc:oracle:thin:@localhost:1521:orcl
For mysql
jdbc:mysql://localhost:3306/test?useSSL=false&allowPublicKeyRetrieval=true
test : DB name



4.Create the JDBC statement
Connection i/f  method
public Statement createStatement() throws SQLException :
creates an empty JDBC stmt to hold the query &  exec. 


5. Fill in the query & execute the same.
Statement i/f method
If query is : select : u must use executeQuery method.If the query is DML other than select(i.e insert,delete,update) or DDL then use the method executeUpdate


5.1 For select query :(for result set returning query)
public ResultSet executeQuery(String sql) throws SQLException
Returns the result set consisting of selected rows & cols.


5.2 For others : (queries not returning RST)
public int executeUpdate(String sql) throws SQLException
Returns the updated row count : indicating how many rows were affected.

6.1 Process the ResultSet
API : ResultSet I/f method

public boolean next() throws SQLException 
Advances the RST cursor to the next row & returns true : if valid data or false if no results.(end of results)
If valid data exists : then read row data
Methods from ResultSet i/f
Type getType(int colPosition) throws SQLException( colPos : as it appears in RST)
or
Type getType(String colName) throws SQLException

Type=JDBC data type.

Mapping bet. Oracle Data types & JDBC data type

varchar/varchar2 : String
number(n) : integer
number(m,n) : double/float
date : java.sql.Date
TimeStamp : java.sql.TimeStamp



7 : Insertion of a row to the table (any query returning updateCnt)
Only changes are : query & replace executeQuery by executeUpdate.

8. If Java appln is exiting : close RST,close ST & then close Cn from the finally block or finalize method.(Typically closing Cn , closes all stmts & rsts.)


What is the type of the ResultSet so far  created? : Forward type only & read only
To such a RST : previous() or abs. positioning meths(absolute(n) or relative(n) positioning meths will raise SE.

How to create a scrollable RST?
Replace step 4 by the following.

4.Create the JDBC statement to support scrollable RST
Connection i/f  method
public Statement createStatement(int resultSetType,int concurrencyType) throws SQLException :
resultSet type : forward type(ResultSet.TYPE_FORWARD_ONLY) or scrollable(ResultSet.TYPE_SCROLL_INSENSITIVE OR ResultSet.TYPE_SCROLL_SENSITIVE) : 

Difference between these 2 
A result set that is TYPE_SCROLL_INSENSITIVE does not reflect changes made while it is still open and one that is TYPE_SCROLL_SENSITIVE does. Both types of result sets will make changes visible if they are closed and then reopened:

resultset Concurrency : read only result set(ResultSet.CONCUR_READ_ONLY) or updatable result set.(i.e can make changes to RST & same changes can also be applied to the DB table. can replace thus : insert,update,delete queries)


Additional API of scrollable ResultSet :
boolean absolute(int n) throws SE : tries to place the RST cursor on the nth row.

relative,afterLast,beforeFirst,first,last,previous,getRow


Why use PreparedStatement ?

1. PST represents pre-parsed & pre-compiled Stmts. At the time of creation of the PST,  3 steps out of 4(i.e parsing ,syntax chking,compiling )  take place. So when User reqs for data(eg : via a button click) the only remaining step is : fill in user data & exec query.


2. U can't pass the IN params to Statement , but can pass IN params to PST.

How to create PST?
1. Use Connection i/f method :
public PreparedStatement prepareStatement(String sql) throws SE
eg : PreparedStatememt pst=cn.prepareStatement("select * from my_emp where id=?");
? : IN param. to be filled prior to query exec.

The RST associated  with above PST is of : TYPE_FORWARD_ONLY & CONCUR_READ_ONLY

How to make it scrollable?
API : Connection i/f

public PreparedStatement prepareStatement(String sql,int resultType,int concurrencyType) 
throws SE


3. How to set IN params of PST?(to be invoked  : in event listener : after user gives i/p or in server side code after clnt sends request)
API : PreparedStatement i/f

void setType(int placeHolderPos,Type value) throws SE
Type : JDBC data type
PlaceHolder pos : 1.....counted from left
eg : to set emp id .
pst.setInt(1,....);

4. exec the query
 rst=pst.executeQuery();

5. process rst in the standard manner.



RMI clnt : sends emp id & RMI srvr contact DB : if emp exists ---sends emp info , ow. raises exc empnot found  -- via pst.


CallableStatement : i/f from java.sql
Statement <--- PST  <--- CallableStatement
why CST ?
1. Use CST to execute stored procedures & stored funs exisitng on DB
2. To pass IN,OUT,IN OUT type of params

Steps to invoke & exec. the stored proc/fun
1. Create CST
API : Connection i/f
public CallableStatement prepareCall(String invocationSyntax) throws SqlException
invocationSyntax for stored proc : "{call procName(?,?.....?)}"
invocationSyntax for stored fun : "{?=call funcName(?,?.....?)}"
? : represents IN,OUT or IN OUT param
{} : represent the esc seq. for the JDBC drvr. JDBC drvr will translate this invocation to a native DB invocation form.

2. Set IN params : methods inherited from PST

void setType(int placeHolderPos,Type value) throws SE

3. Register OUT / IN OUT params (i.e specify the JDBC data type of the OUT/IN OUT param to JVM)
Method of CST
void registerOutParameter(int paramPosition,int type) throws SE

paramPosition : placeHolder pos 1....
type : java.sql.Types : class constant

3.5 For 	IN OUT PARAM : invoke step 2 & 3 (ie. set IN val & register out param data type)

4. Execute the stored proc or a fun

public boolean execute() throws SE

Ret val is ignored.

5. Extract the results from OUT/IN OUT
CallableStatement methods 
Type getType(int paramPos) throws SE
type : JDBC data type


Objective : Using scanner : accept sid,did,amt for funds transfer, exec the st.proc & disp the results. 


DB Transactions 
Functionally grouped SQL stmts : representing a B.L.
Tx => all the stmts from a Tx either fail or succeed.
i.e If any stmt fails : entire Tx has to be discarded. 
The changes made by the Tx will be made permanent : IFF all the stmts succeed.
eg : Purchase a product
Involves 1. Checking availability of the product
2. Customer credit/debit limit & updating the same
3. Updating stock .

How to do it from JDBC API?

1. Start a Tx
Connection i/f method 
void setAutoCommit(boolean flag)
ie. unset the auto-commit flag.
eg : cn.setAutoCommit(false);
2. Wrap entire Tx within a separate try-catch block.
3. If the entire try block succeds (i.e at the end of try) ---> commit the Tx
API : cn.commit();
4.But if u reach inside the catch clause(due to system exc or custom exc) : rollback the Tx
API : cn.rollback();
5. To continue : set auto-commit to true again.

6. To rollback a transaction partially , there exists additional method for setting save points.
Connection i/f method
public Savepoint setSavepoint() throws SQLException

7. How to restore the DB state to a savepoint ?
Connection i/f method
void rollback(Savepoint savepoint) throws SQLException
Undoes all changes made after the given Savepoint object was set.



Updatable ResultSet : 
How to create a PST which supports scrollable & updatable RST?

1. API : Connection i/f

public PreparedStatement prepareStatement(String sql,int resultType,int concurrencyType) 
throws SE
resultSet type : TYPE_SCROLL_INSENSITIVE/SENSITIVE
concurrencyType : CONCUR_UPDATABLE

2. Alternative to update query
2.1 Get the updatable RST.(eg : via pst.executeQuery())
2.2 Place the RST cursor on the row to be updated.(via absolute/relative meths of RST)
2.3 Update the col. vals-- on the RST
ResultSet API
public void updateType(int colPosition,Type newVal) throws SE
type--- JDBC data type
OR
public void updateType(String colName,Type newVal) throws SE
type--- JDBC data type

2.4 Once all changes to a particular row are done invoke :
API : public void updateRow() throws SE
to apply these changes to the underlying DB table.





3. Alternative to insert query
3.1 Get the updatable RST.(eg : via pst.executeQuery())
3.2 Place the RST cursor on the new row to be inserted.
API 
ResultSet : void moveToInsertRow() throws SE
This places the RST cursor on the newly created row.

3.3 Update the col. vals-- on the RST copy
Invoke update methods (mandatory for NOT NULL constraint) : as in step 2.3

ResultSet API
public void updateType(int colPosition,Type val) throws SE
type--- JDBC data type

3.4 Once all col vals are inserted : 
API : public void insertRow() throws SE
to apply these changes to the underlying DB table. (i.e new row gets inserted in DB)
3.5 To place cursor back to original row
API : public void moveToCurrentRow() throws SE


4. Alternative to delete query
4.1 Get the updatable RST.(eg : via pst.executeQuery())
4.2 Place the RST cursor on the row to be deleted (via absolute/relative)
4.3 Delete row :
ResultSet API 
void deleteRow() throws SE  (NOTE : deletes row from RST & DB too!!!!! use it with care!)


For date/time handling from JDBC
classes to be used from java.sql are :
Date,Time & TimeStamp

{d 'yyyy-mm-dd'}
{t 'hh:mm:ss'}
{ts 'yyyy-mm-dd hh:mm:ss'}

steps : for handling date
1. Create a table with col. type=date
2. Create a PST
3. Use java.sql.Date API
method :
public static Date valueOf(String dateFormat) 

dateFormat : yyyy-mm-dd

4. Use PST's method
public void setDate(int pos,Date val) throws SE.


Meta data associated with JDBC
1. Database meta data : holds the info like : DB version,DB drvr version, Tx are supported or not, scrollable/updateble rsts, names of all tables from DB.....,max conns available
To get D.M.D
API : Connection i/f
DatabaseMetaData getMetaData() throws SE
DatabaseMetaData : i/f 
Has methods : getVersion(),getTables().....


How to get all the table names for the current user?
Use DMD : method
ResultSet getTables(String catalog,String schemaPattern,
                    String tableNamePattern,
                    String[] types)
                    throws SQLException

Usage
DatabaseMetadata dmd=cn.getMetaData();
ResultSet rst=dmd.getTables(null,null,null,new String[] {"TABLE"});
//to retrieve table name
invoke : rst.getString(3) ; //3 => table name


2. ResultSetMetaData : metadata about the RST
How to get it?
Method in ResultSet API
ResultSetMetaData getMetaData() throws SE
eg :
ResultSetMetaData rmd=rst.getMetaData();

2.1 Methods of RMD
int getColumnCount() throws SE
String getColumnLabel(int colPos) throws SE
int getColumnType(int colPos) throws SE



Dirty Read --Enables un-committed tx data, to read from current tx.
Un-repeatable reads -- Enables to read committed data from concurrent tx, may lead to un repeatable results.
Phantom reads-- Enables to read committed data from concurrent tx, may lead to additional rows appearing in same tx.


Handling BLOBs with JDBC API
How to store BLOB data?
1. Create DB table having blob type of column.
eg create table my_images(id number(2),name varchar2(30),snap blob);
2. Accept bin file from user to store on DB.
3. Use PreparedStatement API method -- to store BLOB on DB
API
public void setBinaryStream(int placeholderPos, InputStream in, int length) throws SqlException
4. Use executeUpdate to insert row data.

How to restore BLOB data from DB ?
1.Use API of PreparedStatement to read BLOB.
public Blob getBlob(int colPos) throws SqlException
2. Use java.sql.Blob i/f method
public byte[] getBytes(long pos,int length)
NOTE : pos begin with 1 .
3. Once u have byte[] , u can store the same on File(bin) using FOS or send it over sockets using Socket.getOutputStream()



Reference for MySQL connectivity
1.install MySQL


2. Clnt i/f 
create database testjdbc;
use testjdbc;

create table Employee( empId int primary key, name varchar(25), deptId int, isPermanent boolean,sal double);
insert into Employee values(1,'aa',123,true,2000);
insert into Employee values(2,'ab',101,true,3000);


Driver class name : com.mysql.jdbc.Driver 
To load/register driver ---- Class.forName(String F.Q className) throws ClassNotFoundExc
DB URL - jdbc:mysql://hostname:3306/databaseName
root -- user name 
root -- password
example code for conn to MySQL ----
Class.forName("com.mysql.jdbc.Driver");
String dbURL="jdbc:mysql://localhost:3306/testjdbc";
//use DM.getConnection(url,username,pass)
			

Objective ---- RMI & JDBC integration
Func requirement --1.  disp emp dtls --- if present , ow. raise cust exc.
2. Insert new emp record --- ret success msg  or raise cust exc in case failure.

Server side steps
1. B.I --- method decl ---
String getEmpDtls(int empId) throws RE,EmpNotFoundExc
2. String insertEmp(emp specific dtls) throws RE,EmpInsertExc
2. Create impl class --- rem obj 
constr --- cn,psts
B.M ---get ---- 
insert




HOW TO make JDBC applns/applets completely DB independent?
1.Create text based properties file.
key & value pair.(keys --- arbitrary values---changing as per DB setting)
2.Create empty java.util.Properties<K,V> --- sub-class of HashTable
Key & values must be --- String
Can load Properties directly from any stream.
Properties API 
public void load(Reader r) throws IOExc

3.Can access the Property value using API
Properties API
String getProperty(String key)
ret type=value asso with key.
 

eg--
Properties props = new Properties();
		
FileInputStream in = new FileInputStream("database_mysql.properties");
props.load(in);
in.close();
String drivers = props.getProperty("jdbc.drivers");
Class.forName(drivers);
String url = props.getProperty("jdbc.url");
String username = props.getProperty("jdbc.username");
String password = props.getProperty("jdbc.password");
return DriverManager.getConnection(url, username, password);


Regarding jar cmd line utility
0. For runnable jars --- create manifest.txt --- 1liner having Main-Class: tester.Test, new line & save file
1.cd to folder where ur classes are(eg bin)

1. From bin --- jar cvfm test.jar manifest.txt *
2. To run jar
java -jar test.jar













































































































































































