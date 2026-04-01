# Spring Professional Certification 

### 1.1 Dependency Injection
- Software Design Technique where Object doesn't create dependency on itself, Instead it declares dependency and It's the role of external Object or the Framework to provide concrete dependency to the Object.
- Types:
  - Constructor Injection,
  - Setter Injection,
  - Field Injection (Spring Supports), and
  - Interface Injection (Spring doesn't Support)
  - Method Injection (Not a standard DI, Spring uses it for injecting Prototype Beans (using @Lookup annotation) in Singleton Bean)
- Advantages:
  - Decrease Coupling, 
  - Increase Cohesion
- [Demo Link](src/main/java/com/wmware/certification/practice/revision/module1/dependencyInjection/Main.java)

### 1.2 Design Pattern and Anti-Pattern
- Design Pattern
  - Solution of often occurring problems in software design
  - Can be categories into Creational, Structural  and Behavioral
  - **Creational Design Pattern**
    - Singleton,
    - FactoryMethod,
    - AbstractFactory,
    - Builder and,
    - Prototype
  - **Structural Design Pattern**
    - Adapter,
    - Builder,
    - Composite,
    - Decorator,
    - Proxy,
    - Facade and,
    - FlyWeight
  - **Behavioral Design Pattern**
    - Strategy,
    - State,
    - Visitor,
    - TemplateMethod,
    - Chain Of Responsibility,
    - Iterator,
    - Observer,
    - Mediator,
    - Command,
    - Interpreter and,
    - Memento,
  - Note: DI also satisfies Design Pattern Definition
- Anti-Pattern
  - Inefficient and conter-productive solution to often occurring problems
    - God Object,
    - Circular Dependency,
    - Sequencial Coupling,
    - Hard Code,
    - Soft Code, etc

### 1.3 Interface vs Abstract Class
- **Interface**
  - It's a description of actions that Object can perform. It's a way to impose action on the Objects that implements them
  - [Demo Link](src/main/java/com/wmware/certification/practice/revision/module1/interfaceDemo/Main.java)
-  **AbstractClass**
   - It's a class which can't be instantiated, It is used as a base class to describe common behavior for it's subclasses
   - [Demo Link](src/main/java/com/wmware/certification/practice/revision/module1/abstractClassDemo/Main.java)

### 1.4 Application Context
- It's a central Interface of Spring Container, which is response for Initializing, Configuring and Managing beans, and provide additional features like event handling, Internationalization, Resource loading.
- **Concreate Implementation of Application Context Interface**
  - [AnnotationConfigApplicationContext](src/main/java/com/wmware/certification/practice/revision/module1/applicationContext/annotationConfigApplicationContext/AnnotationConfigApplicationContextDemo.java)
  - [ClassPathXmlApplicationContext](src/main/java/com/wmware/certification/practice/revision/module1/applicationContext/annotationConfigApplicationContext/ClassPathXmlApplicationContextDemo.java)
  - [FileSystemXmlApplicationContext](src/main/java/com/wmware/certification/practice/revision/module1/applicationContext/annotationConfigApplicationContext/FileSystemXmlApplicationContextDemo.java)
  - [AnnotationConfigWebApplicationContext](src/main/java/com/wmware/certification/practice/revision/module1/applicationContext/annotationConfigApplicationContext/AnnotationConfigWebApplicationContextDemo.java)
  - [XmlWebApplicationContext](src/main/java/com/wmware/certification/practice/revision/module1/applicationContext/annotationConfigApplicationContext/XmlWebApplicationContextDemo.java)
  - [GenericApplicationContext](src/main/java/com/wmware/certification/practice/revision/module1/applicationContext/annotationConfigApplicationContext/GenericApplicationContextDemo.java)
  - [GenericWebApplicationContext](src/main/java/com/wmware/certification/practice/revision/module1/applicationContext/annotationConfigApplicationContext/GenericWebApplicationContextDemo.java)

### 1.5 IoC (Inversion of Control) Container
- IoC Container is core component of Spring Framework It's main responsibility is managing Bean lifecycle.
  - BeanFactory (Simplest version)
    - Create Bean
    - Perform Dependency Injection
    - Mange Bean Lifecycle
  - ApplicationContext (Advanced version) 
    - Perform all the task of Bean Factory 
    - Provide other functionality like event Handling, localization, Resource locator

### 1.6 Bean Scopes
- [Non-Web Application](src/main/java/com/wmware/certification/practice/revision/module1/beanScopeDemo/nonWeb/Main.java)
  - Singleton (Default)
  - Prototype
- [Web Application](src/main/java/com/wmware/certification/practice/revision/module1/beanScopeDemo/web/Main.java)
  - Request
  - Session
  - Application
  - WebSocket
