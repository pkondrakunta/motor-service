# Motor Service Management 

An application for a Motor Service/Repair System with multiple access roles (employee, client, mechanic). Can create employees, register clients, create jobs, transfer job sheets to mechanics and maintain status of the job. The main focus was to implement **Object Oriented Design Principles**.

### CSYE6200 (Object Oriented Design) Final Project 

## Scope of Operations
* Add and Manage Employees 
    * Employee name, age, salary, credentials
    * Separate dashboard to login and access application 
* Add and Manage incoming Clients
    * Client name, age, credentials
    * Report the required motor service jobs to the client
    * Separate dashboard to login and access application 
* Add Mechanics
    * Mechanic name, age, credentials
    * Separate dashboard to login and access application 
    * Book appointment with mechanics to motor service jobs
* Maintain job service status 
* Record the completed job

## Build Instructions
Setting up the project, the dependencies and running it:

1. Open Apache NetBeans IDE 12.6
2. Go to File>Import Project>From ZIP. Select the project .zip and click Open. 
3. If any Project Problems pops up resolve it using the following .jar files (Found in Jars 
folder of the project): **mongo-java-driver-3.12.8.jar**
4. Once the project is open, click on **Run Project** to start the application.
5. Start the mongo db server using: `mongod`
> * Ensure that it is running on the assigned port 27017
> * Packages: java.util, javax.swing
> * Libraries: mongo-java-driver-3.12.8.jar

### Design Features Implemented
*  Collections 
*  Exception Handling
*  Singleton Design Pattern
*  Streams API
*  Java Swing
*  OOP Concepts
    *  Inheritance
    *  Polymorphism 
    *  Abstraction (private attributes and public methods)

> Operational Instructions included in the project


