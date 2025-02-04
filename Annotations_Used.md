# Annotations Used in This Spring Boot AOP Example

1. **@SpringBootApplication**
   - Indicates a Spring Boot application and enables component scanning, auto-configuration, and configuration properties.

2. **@RestController**
   - Used to define a REST API controller that automatically serializes return values into JSON or other formats.

3. **@RequestMapping**
   - Used to map HTTP requests to specific methods in the controller.

4. **@GetMapping**
   - A shorthand for `@RequestMapping(method = RequestMethod.GET)` to handle HTTP GET requests.

5. **@Service**
   - Indicates that a class is a service, typically used for business logic.

6. **@Value**
   - Injects a value into a field from external sources (like properties, configuration files, or environment variables).

7. **@Aspect**
   - Defines an aspect in AOP, allowing cross-cutting concerns (like logging or security) to be applied across methods.

8. **@Component**
   - Marks a class as a Spring component, allowing it to be detected and registered as a Spring bean.

9. **@Before**
   - Defines a method to run before a specific join point (method execution) is invoked.

10. **@After**
    - Defines a method to run after a specific join point (method execution) is invoked, regardless of the method's outcome.

11. **@Around**
    - Defines a method that surrounds the execution of the method being advised, enabling control over the method execution.

12. **@EnableAspectJAutoProxy**
    - Enables support for AspectJ-based aspect-oriented programming (AOP) in a Spring application.

13. **@Configuration**
    - Marks a class as a configuration class in Spring, allowing you to define beans and configuration settings.

14. **@Bean**
    - Declares a bean in the Spring context, typically used in a configuration class.
