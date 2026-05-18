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
- [Demo Link](src/main/java/com/vmware/certification/practice/revision/module1/dependencyInjection/Main.java)

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
    - Bridge,
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
  - Inefficient and counter-productive solution to often occurring problems
    - God Object,
    - Circular Dependency,
    - Sequential Coupling,
    - Hard Code,
    - Soft Code, etc

### 1.3 Interface vs Abstract Class
- **Interface**
  - It's a description of actions that Object can perform. It's a way to impose action on the Objects that implements them
  - [Demo Link](src/main/java/com/vmware/certification/practice/revision/module1/interfaceDemo/Main.java)
-  **AbstractClass**
   - It's a class which can't be instantiated, It is used as a base class to describe common behavior for it's subclasses
   - [Demo Link](src/main/java/com/vmware/certification/practice/revision/module1/abstractClassDemo/Main.java)

### 1.4 Application Context
- It's a central Interface of Spring Container, which is response for Initializing, Configuring and Managing beans, and provide additional features like event handling, Internationalization, Resource loading.
- **Concreate Implementation of Application Context Interface**
  - [AnnotationConfigApplicationContext](src/main/java/com/vmware/certification/practice/revision/module1/applicationContext/annotationConfigApplicationContext/AnnotationConfigApplicationContextDemo.java)
  - [ClassPathXmlApplicationContext](src/main/java/com/vmware/certification/practice/revision/module1/applicationContext/annotationConfigApplicationContext/ClassPathXmlApplicationContextDemo.java)
  - [FileSystemXmlApplicationContext](src/main/java/com/vmware/certification/practice/revision/module1/applicationContext/annotationConfigApplicationContext/FileSystemXmlApplicationContextDemo.java)
  - [AnnotationConfigWebApplicationContext](src/main/java/com/vmware/certification/practice/revision/module1/applicationContext/annotationConfigApplicationContext/AnnotationConfigWebApplicationContextDemo.java)
  - [XmlWebApplicationContext](src/main/java/com/vmware/certification/practice/revision/module1/applicationContext/annotationConfigApplicationContext/XmlWebApplicationContextDemo.java)
  - [GenericApplicationContext](src/main/java/com/vmware/certification/practice/revision/module1/applicationContext/annotationConfigApplicationContext/GenericApplicationContextDemo.java)
  - [GenericWebApplicationContext](src/main/java/com/vmware/certification/practice/revision/module1/applicationContext/annotationConfigApplicationContext/GenericWebApplicationContextDemo.java)

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
    - using @Component annotation and it's Stereotypes(@Service, @Repository, @Configuration )
    - using @Bean annotation inside configuration Annotation
 - [Demo Link](src/main/java/com/vmware/certification/practice/revision/module1/beanDemo/BeanDemo.java)

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
- [Demo Link](src/main/java/com/vmware/certification/practice/revision/module1/configurationDemo/Main.java)

### 1.9 Bean Scopes
- [**Non-Web Application**](src/main/java/com/vmware/certification/practice/revision/module1/beanScopeDemo/nonWeb/Main.java)
  - Singleton (Default)
  - Prototype
- [**Web Application**](src/main/java/com/vmware/certification/practice/revision/module1/beanScopeDemo/web/Main.java)
  - Request
  - Session
  - Application
  - WebSocket
- [**Prototype Beans injected inside Singleton Bean**](src/main/java/com/vmware/certification/practice/revision/module1/beanScopeDemo/prototypeInjectedInSingletonBean/beans/Main.java)
  - If It's injected using Autowired or Inject Annotation then It will behave like a singleton bean
  - The above problem can be solved in two ways
    - Method Injection using Lookup annotation
    - using ObjectProvider<PrototypedBean> or Provider<PrototypedBean> (JSR 330)
- **[lazy vs eagerly](src/main/java/com/vmware/certification/practice/revision/module1/beanScopeDemo/prototypeInjectedInSingletonBean/beans/Main.java)**
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
- [Demo Link](src/main/java/com/vmware/certification/practice/revision/module1/propertySourceDemo/Main.java)

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
- [Demo Link](src/main/java/com/vmware/certification/practice/revision/module1/beanPostProcssorDemo/Main.java)

### 1.13 Post-initializing and pre-Destroy Beans
- Initialization
  - using @PostConstruct annotation (method must have no parameter and return void)
  - InitializingBean#afterPropertiesSet() 
  - Bean(init = "methodName")
- Destruction 
  - using @PreDestory annotation (method must have no parameter and return void)
  - DisposibleBean#destroy()
  - Bean(destroy="methodName")
- [Demo](src/main/java/com/vmware/certification/practice/revision/module1/initBean/Main.java)
### 1.14 Profiles
- @Profile allows us to conditionally enable and disable Bean registration in Spring Framework
- It checks for spring.profiles.active value from Environment
- [Demo Link](src/main/java/com/vmware/certification/practice/revision/module1/profileDemo/Main.java)

### 1.15 Spring Expression Language SpEL
- Spring Expression Language is an expression language in Spring framework that supports querying and manipulating objects at the runtime.
- SpEL supports following operations:-
  - Literals
  - Bean Property Access
  - Arithmetic Operations
  - Relational Operations
  - Logical Operations
  - Ternary Operations
- [Demo Link](src/main/java/com/vmware/certification/practice/revision/module1/springExpressionLanguage/Main.java)

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
- [Demo](src/main/java/com/vmware/certification/practice/revision/module2/AOP_demo/Main.java)

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
  - After -> executes after join point matched against  pointcut is executed (no access to return type, or Exception)
    - Usage:
      - cleanup
  - AfterReturning -> executes when method ran successfully (access to return method)
    - Logging Response
    - Modifying response
    - Metric Collection
  - AfterThrowing -> executes when method throws exception (access to excpetio)
    - Error logging
    - Alerting
    - Fallback handling
  - Around -> Wraps around a method controls Before, After and execution
  - [Demo](src/main/java/com/vmware/certification/practice/revision/module2/AOP_demo/Main.java)

## 3. Spring Data
### 3.1 Checked vs Unchecked Exception:-
  - **Checked Exception**: Exceptions which are checked at the compile time. i.e. SqlException, IOException, ClassNotFoundException
  - **Unchecked Exception**: Exceptions which are not checked at the compile time but occur at runtime. i.e. NullPointerException, ArithmeticException, ArrayIndexOutOfBoundException

  - **Pros of Checked Exception**
    - Forced to handle important failures
    - Good for recoverable situation i.e. Network issue, file not found
    - provides Compile Time Feedback
  - **Cons of Checked Exception**
    - Create Coupling between caller and callee
    - Verbose, Boilerplate heavy and more clutter code
  
  - **Pros of Unchecked Exception**
    - reduce coupling between caller and callee
    - less clutter code
    - better for programming error
    - No Exception Propagation Pollution
  - **Cons of Unchecked Exception**
    - no compile-time feedback
    - May result in missing situations in which error handling should be implemented
  ```
     Serializable (Marker Interface) -> It enables object transfer/storage
      |
      |-- Throwable
          |
          |
          |-- Error  
          |
          |-- Exception
              |        
              |-- IOException (checked)
              |
              |-- SqlException (checked)
              |
              |-- RunTimeException (unchecked)
                  |
                  |-- NullPointerException
- **DataSource Interface**
  - It is an interface of javax.sql which represents source of database connections.
  - Some Implementations of DataSource are:- DriverManagerDataSource, BasicDataSource, ComboPoolingDataSource, TransationAwareDataSource 
```
### 3.2 **JdbcTemplate**    
  - *Template*: It's a behavioral design pattern that defines structure of algorithm in the base-class, and sub-class can override some steps without changing the overall algorithm
  - JdbcTemplate is a class located in org.springframework.spring-jdbc
  - different methods available in JdbcTemplate
    - query
    - queryForObject 
    - queryForMap 
    - queryForList 
    - queryForRowSet
    - execute
    - update
    - batchUpdate
  - *Callback*: It's a code or reference to a code which is being passed as an argument and it gets executed at the time of method execution.
    - In java Callback can be
      - class that implements interface,  
      - Anonymous class,
      - Lambda Expression, and
      - Reference (this::method)
    - JdbcTemplate has following callbacks
      - RowMapper
      - ResultSetExtractor
      - RowCallbackHandler
      - PreparedStatementCreator
      - PreparedStatementSetter
      - ConnectionCallback<T>
      - StatementCallback<T> 
  - [Demo](src/main/java/com/vmware/certification/practice/revision/module3/Datasource/Main.java)

### 3.2 **Transaction**
- *Definition*: It's a set of operations where either all the operations are performed or non are performed
  - It follows ACID -> atomicity, consistency, isolation and durability
  - Transaction is a cross-cutting concerns and can be implemented using Transactional Annotation
  - *Global Transaction vs Local Transaction*
    - Global Transaction is a kind of transaction which spans multiple Resource, can we anything usually databases
    - Local Transaction uses specific resource, they don't span multiple transaction
- *PlatformTransactionManager* : PlatformTransactionManager is an interface and abstraction over transaction
  - Some of it's implementations are:
    - DataSourceTransactionManager
    - JtaTransactionManager (Global Transaction)
    - JpaTransactionManager (use for Jpa/Hibernate)
  - jdbcTemplate able to participate in transaction using DataSourceUtils.
  - TransactionSynchronizationManager is tread local storage manager for transaction resource.
  - TransactionInterceptor kicks in AOP (It's an advice)
- EnableTransactionManagement annotation, sets up core components like, 
  - TransactionInterceptor
  - PlatformTransactionManager
  - Decides AOP
  - It has following Parameters
    - mode: Proxy or AspectJ
    - proxyTargetClass: false or true -> if set true allow CGLIB proxy
    - rollbackOn -> RunTimeException or Exception
- *Transaction Propagation* It defines how transaction going to be re-used when calling other transactional method
  - REQUIRED -> Joins existing transaction if already exists, Creates new Transaction if not exists
  - SUPPORTS -> Joins existing transaction if already exists, run non-transactionally if it doesn't exist
  - MANDATORY -> Joins existing transaction if already exists, throw exception
  - REQUIRES_NEW -> Create new Transaction, suspend transaction if already exists
  - NOT_SUPPORTED -> Suspend existing transaction, run non-transactionally
  - NEVER -> executes non-transactionally throw exception if transaction exists
  - NESTED -> executes within nested transaction if current transaction exists
- *Transaction Isolation*  It determines how changes made to one transaction visible to other transaction
  - SERIALIZABLE -> avoids phantom read
  - REPEATABLE_READ -> avoids non-repeatable read
  - READ_COMMIT -> avoids dirty read
  - READ_UNCOMMIT -> allow dirty read
- Declarative transaction means that instead of handling transaction manually use Transaction Annotation

### 3.3 JPA
- Unit of Work (UoW) -> Single business operation that should be treated as one atomic task
  - For Relational Database one Unit of Work is one database transaction
  - For JPA/Hibernate UoW is Data Object representing entries in the database, and once done ORM figures out all changes that need to be applied to database.
- What are the dependencies we need for JPA
  - spring-orm, spring-tx, jakarta-persistence-api, hibernate-orm, datasource, driver, spring-data-jpa
- Repository Interface
  - It's Java interface where we declare databaseOperations, and Spring automatically provides implementation at the runtime
  - Different types of repository which extends RepositoryInterface are
    - Repository<E,P> -> basic Marker Interface 
    - CurdRepository<E,P> -> AddGenericMethods
    - JpaRepository<E,P> -> Jpa Specific Extension of Repository
    - PagingAndSortingRepository<E,P> -> add findAll method for paging/sorting
  - In Spring Jpa method name follows specific pattern:
    - Action + By + Field(s) + Condition(s)

## 4. SpringBoot
- *definition* : It helps us to create stand-alone, production-grade, spring-based application that we can run.
- It supports various embedded servlet container
  - Apache Tomcat (default)
  - Eclipse Jetty -> highly customisable lightweight alternate often used for efficiency
  - Undertow -> high-performance flexible web server
  - Netty -> Used by default when building reactive application with WebFlux
- SpringBoot also provide features that can be used to fulfill non-functional requirement like 
  - Security
  - Metrics
  - HealthCheck
- SpringBoot provides many modules like
  - Spring boot dev-tools
  - Spring boot Actuator 
  - Spring boot Starter
  - Spring boot auto-configuration
- On top of that I can use all Spring framework technology
  - Spring Web
  - Template Engine
  - Spring Security
  - Spring Data
- Advantages of SpringBoot
  - Provide Auto-configuration
  - Integrate with systemd and init.d which allow to easily run application in linux server
  - Use DI and IoC from SpringFramework
  - The main advantage is It's opinionated style
- SpringBootApplication annotation has annotations:-
  - SpringBootConfiguration (Which is a meta-annotation of Configuration)
  - EnableAutoConfiguration -> to detect dependency on classpath based on detected dependency
  - ComponentScan
- SpringBoot provides following conditionals
  - ConditionalOnClass(DataClass.class)
  - ConditionalOnMissingClass(DataClass.class)
  - ConditionalOnBean(DataSource.class)
  - ConditionalOnMissingBean(DataSource.class)
  - ConditionalOnProperties(name="feature.name", havingValue="property")
  - ConditionalOnResources(resource="classpath:config.yml")
  - ConditionalOnWebApplication(type = SERVLET)
  - ConditionalOnNonWebApplication
  - ConditionalOnExpression(expression)
  - ConditionalOnSingleCandidate(DataSource.class)
  - ConditionalOnJava(JavaVersion.TWENTY_ONE)
  - ConditionalOnCloudPlatform(AWS)
- 
## 5. Spring Security
### 5.1 Authorization, Authentication, Principal, Granted Authority and Role
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

### 5.2 Web-Level Security and Method-Level Security
- Web-Level Security
  - Web-Level Security uses servlet filter to analyze each request made to the system, and based on the rule specified through SecurityFilterChain and HttpSecurity Object, 
  - request -> delegatingFilterProxy -> springSecurityFilterChain(FilterChainProxy bean) -> securityFilterChains (List of SecurityFilterChain beans) -> Authentication & Authorization
- Method-Level Security
  - Method Level uses Spring AOP to proxy invocation to Object, applied advices ensures that during invocation, security rules are met to allow invocation

### 5.3 SecurityContext
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

### 5.4 Method Level Security Annotations
- Spring Security support following Annotations:-
  - PreAuthorized -> Role based Access, Permission Check and Conditions using parameters
  - PostAuthorized -> Return only Allowed Item
  - PreFilter -> filter input from collection before method execution
  - PostFilter -> filter collection output after method run
  - Secured -> Simple Role check only
  - RolesAllowed -> Part of Java JSR-250 checks role, allow Portability

## 6 Spring TestContext Framework
### 6.1 Unit Test
- Testing Functionality in Isolation.
- Functionality is defined as single method, class, module and component
- In Spring Framework unit of functionality is usually defined as single class
- Spring Framework is not being used in Unit Testing
- [Demo](src/main/java/com/vmware/certification/practice/revision/module6/unitTest/Main.java)

### 5.2 Web MVC Test
- Need to Test Spring Controller(Web Layer),
- Required to test Http request Mapping, Serialization/De-Serialization, Input Field and Error Handling
- [Demo](src/main/java/com/vmware/certification/practice/revision/module6/unitTest/Main.java)

### 5.3 Data Jpa Test
- Need to Test Persistence Layer
- Persistence Layer consists of Schema, Entities, Constraints and Repository
- It's not a Unit test because database is involved (Unit Test in Persistence Layer doesn't make sense)
- Using real database is preferable rather than H2(in memory database)

### 5.5 Json Test
- We can test Serialization/De-Serialization

### 5.6 WebClient
- Responsibility :-
  - Making Requests,
  - Argument mapping and Serialization,
  - Deserialization and result mapping,
  - Error Handling