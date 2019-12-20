## What is Spring Boot?
> Spring Boot makes it easy to create stand-alone, production-grade Spring based Applications that you can "just run".
#### Features
- Create stand-alone Spring applications
- Embed Tomcat, Jetty or Undertow directly (no need to deploy WAR files)
- Provide opinionated 'starter' dependencies to simplify your build configuration
- Automatically configure Spring and 3rd party libraries whenever possible
- Provide production-ready features such as metrics, health checks and externalized configuration
- Absolutely no code generation and no requirement for XML configuration

#### Spring Boot Popular Annotations
**@SpringBootApplication** - use this annotation to mark the main class of a Spring Boot application  
**@Controller** - a class level annotation which tells the Spring Framework that this class serves as a controller 
in Spring MVC  
**@RequestMapping** - is used to map web requests onto specific handler classes and/or handler methods  
**@RequestParam** - used for accessing HTTP request parameters   
**@PathVariable** - This annotation indicates that a method argument is bound to a URI template variable.   
**@RequestBody** - maps the body of the HTTP request to an object  
**@ResponseBody** - Spring treats the result of the method as the response itself     
**@Autowired** - used to mark a dependency which Spring is going to resolve and inject.  
