# Spring Professional Certification 

## 1. Spring Core and Bean Lifecycle
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

### 1.6 Beans 
 - Beans are the objects which is instantiated, configured and managed by IoC container
 - How to create Beans:
    - using @Component annotation and it's Stereotypes(@Service, )
    - using @Bean annotation inside configuration Annotation
 - [Demo Link](src/main/java/com/wmware/certification/practice/revision/module1/beanDemo/BeanDemo.java)

### 1.7 @Component and It's Stereotypes
- Component is a class which is represented by @Component annotation, It is being discovered during classpath scan and being registered by IoC container
- What are the stereotypes of Component
- Stereotypes annotations are derived from Component Annotation and indicate specific purpose of bean in the application
  - @Service
  - @Repository
  - @Controller

### 1.8 Configuration Annotation
- Configuration bean is a Spring managed bean, It contains Bean methods, It is used for configuring and registering Beans to ApplicationContext
- note: although Configuration Bean is a meta-annotation of Component but Spring manages it differently
- Configuration Bean is being Proxied(CGLIB) to avoid creating new instance of other Beans when the bean method is called
- We can disable this using ProxyBeanMethods=false
- [Demo Link](src/main/java/com/wmware/certification/practice/revision/module1/configurationDemo/Main.java)

### 1.9 Bean Scopes
- [**Non-Web Application**](src/main/java/com/wmware/certification/practice/revision/module1/beanScopeDemo/nonWeb/Main.java)
  - Singleton (Default)
  - Prototype
- [**Web Application**](src/main/java/com/wmware/certification/practice/revision/module1/beanScopeDemo/web/Main.java)
  - Request
  - Session
  - Application
  - WebSocket
- [**Prototype Beans injected inside Singleton Bean**](src/main/java/com/wmware/certification/practice/revision/module1/beanScopeDemo/prototypeInjectedInSingletonBean/beans/Main.java)
  - If It's injected using Autowired or Inject Annotation then It will behave like a singleton bean
  - The above problem can be solved in two ways
    - Method Injection using Lookup annotation
    - using ObjectProvider<PrototypedBean> or Provider<PrototypedBean> (JSR 330)
- **[lazy vs eagerly](src/main/java/com/wmware/certification/practice/revision/module1/beanScopeDemo/prototypeInjectedInSingletonBean/beans/Main.java)**
  - By Default Beans are created eagerly (By default Singleton Bean is created)
  - The behavior can be altered using Lazy annotation at Component or at Global level using ComponentScan(lazyInit = true) annotation
  - If the Scope type is Prototype or Request type then They are called lazily

### 1.10 PropertySource
PropertySource is a Spring abstraction on Environment Key-Value pairs, which can come from:-
- JVM Properties
- System Environment Properties
- JNDI Properties
- Servlet Parameters
- Properties files located inside fileSystem
- Properties files located inside classPath
- [Demo Link](src/main/java/com/wmware/certification/practice/revision/module1/propertySourceDemo/Main.java)

### 1.11 BeanFactoryPostProcessor
- The purpose of BeanFactoryPostProcessor is to modify metadata before beans are created
- It's a functional interface which implements method void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory)
- Classes which implements BeanFactoryPostProcessor are
  - BeanDefinitionRegistryPostProcessor (Interface)
  - ConfigurationClassPostProcessor
    - Configures @Configuration, @Bean, @Import, @ComponentScan classes
  - PropertySourcesPlaceholderConfigurer (This Bean is static because it resolves @Value which must run before any bean is configured)

### 1.12 BeanPostProcessor
- It's a Spring Extension point that let you perform custom logic on the Bean before and after it's initialization callbacks are executed
- Methods implemented by BeanPostProcessor
  - BeanPostProcessor#postProcessBeforeInitialization()
  - BeanPostProcessor#postProcessAfterInitialization()
- AnnotationAwareAspectJAutoProxyCreator -> It's a spring internal BeanPostProcessor that automatically detects @Aspect class and create AOP proxy for matching bean
- CommonAnnotationBeanPostProcessor
  - It's responsible for handling lifecycle callback and dependency injection PostConstruct, PreDestroy, and Resource Annotations (JSR 250)
- [Demo Link](src/main/java/com/wmware/certification/practice/revision/module1/beanPostProcssorDemo/Main.java)

### 1.13 Profiles
- @Profile allows us to conditionally enable and disable Bean registration in Spring Framework
- It checks for spring.profiles.active value from Environment
- [Demo Link](src/main/java/com/wmware/certification/practice/revision/module1/profileDemo/Main.java)

### 1.14 Spring Expression Language SpEL
- Spring Expression Language is an expression language in Spring framework that supports querying and manipulating objects at the runtime.
- SpEL supports following operations:-
  - Literals
  - Bean Property Access
  - Arithmetic Operations
  - Relational Operations
  - Logical Operations
  - Ternary Operations
- [Demo Link](src/main/java/com/wmware/certification/practice/revision/module1/springExpressionLanguage/Main.java)

## 2. Aspect Oriented Programming (AOP)

### 2.1 Aspect Oriented Programming
- It's a programming paradigm which complements Object-Oriented Programming by separating cross-cutting concerns from business logic code.
- Cross-cutting concerns includes
  - Logging
  - Performance Logging
  - Caching
  - Monitoring
  - Transaction
  - Security

### 2.2 Main Problems solved by AOP
- Code Duplication
- Mixing of Concerns

### 2.3 JDK dynamic Proxy vs CGLIB Proxy
- Proxy is a structural design pattern where proxy object act as a substitute or placeholder for another object
- **JDK dynamic Proxy** is a builtin Java feature that creates runtime proxy object using java.lang.reflect.Proxy class
- **CGLIB (Code Generation Library) proxy** It's a thrid-party library that generates proxies by creating a subclass of target class at runtime

### 2.4 Join point and Pointcut
- Join Point is a well-defined point during program execution where an aspect can be applied 
- In Spring Join Points are limited to method execution(via proxy)
- However, in general Join point can be intercepted by
  - Method Interception
  - Constructor Interception
  - Field Access Interception
  - Static method interception
  - Compile time weaving
  - Bytecode level control
- Pointcut is a predicate(expression) which select specific join points where aspect can be applied
  - Example of pointcut expression
    - execution
    - within
    - @within
    - @annotation
    - bean
    - args
    - @args
    - this
    - target
    - @target
- [Demo](src/main/java/com/wmware/certification/practice/revision/module2/AOP_demo/Main.java)

### 2.5 Weaving
- Weaving is a process of applying Aspect, which modifies code behavior at join point that have matched pointcut
- type of weaving:-
  - CompileTime -> bytecode is modified at compilation
  - Load time Weaving -> bytecode is modified when class is loaded by class loader
  - Runtime Weaving -> Used by Spring AOP for each bean subject to aspects

### 2.6 Advice
- Advice is a behavior that will be inserted into the code at each join point matched by pointcut
- Type of Advices
  - Before -> executes before join point matched against pointcut is executed 
    - Usage: 
      - Authentication Check
      - Validation
  - After -> executes after join point matched against  pointcut is executed
    - Usage:
      - cleanup
  - AfterReturning -> executes when method ran successfully
    - Logging Response
    - Modifying response
    - Metric Collection
  - AfterThrowing -> executes when method throws exception
    - Error logging
    - Alerting
    - Fallback handling
  - Around -> Wraps around a method controls Before, After and execution
  - [Demo](src/main/java/com/wmware/certification/practice/revision/module2/AOP_demo/Main.java)

## 3. Spring Security
### 3.1 Authorization, Authentication, Principal, Granted Authority and Role
- Authorization
  - It's a process of identifying user, device or external system which it claims to be. It involves validation that submitted identity is true.
- Authentication
  - It's a process of determining whether an authenticated user can access a resource or perform an action.
- Principal
  - It represents currently logged-in user identity
- Granted Authority
  - Fine-grained permissions, represents Permission and Privileges
- Roles
  - High Level Grouping of Authority


### 3.2 Web-Level Security and Method-Level Security
- Web-Level Security
  - Web-Level Security uses servlet filter to analyze each request made to the system, and based on the rule specified through SecurityFilterChain and HttpSecurity Object, 
  - request -> delegatingFilterProxy -> springSecurityFilterChain(FilterChainProxy bean) -> securityFilterChains (List of SecurityFilterChain beans) -> Authentication & Authorization
- Method-Level Security
  - Method Level uses Spring AOP to proxy invocation to Object, applied advices ensures that during invocation, security rules are met to allow invocation

### 3.3 SecurityContext
- SecurityContext is an interface that allow you to access security information associated with currently executing thread
- It provides two methods
  - getAuthentication() -> provide currently authenticated principal, or authentication request token
  - setAuthentication(Authentication auth) -> set currently authenticated principal or removes the authentication
  - It can be accessed via SecurityContextHolder.getContext()
- SecurityContext allow us to access or set current Authentication object Authenticated Object has the following methods:- 
  - getPrincipal()
  - getAuthorities()
  - getDetails()
  - getCredentials()
  - isAuthenticated()
  - setAuthenticated()

### 3.4 Method Level Security Annotations
- Spring Security support following Annotations:-
  - PreAuthorized -> Role based Access, Permission Check and Conditions using parameters
  - PostAuthorized -> Return only Allowed Item
  - PreFilter -> filter input from collection before method execution
  - PostFilter -> filter collection output after method run
  - Secured -> Simple Role check only
  - RolesAllowed -> Part of Java JSR-250 checks role, allow Portability

## 4 Spring Test
### 4.1 Unit Test
- Testing Functionality in Isolation.
- Functionality is defined as single method, class, module and component
- In Spring Framework unit of functionality is usually defined as single class
- Spring Framework is not being used in Unit Testing
- [Demo](src/main/java/com/wmware/certification/practice/revision/module4/unitTest/Main.java)

### 4.2 Web MVC Test
- Need to Test Spring Controller(Web Layer) in isolation,
- Required to test Http request Mapping, Serialization/De-Serialization, Input Field and Error Handling,
- 