## Contents of this section
<br>

### Logging

- Logging is a crucial aspect of any application, as it helps in monitoring, debugging, and maintaining the system. In Spring Boot, logging is handled using the SLF4J (Simple Logging Facade for Java) API, which provides a simple and consistent way to log messages across different logging frameworks.
- Spring Boot uses Logback as the default logging framework, but it also supports other frameworks like Log4j2 and Java Util Logging.


We can log messages at different levels, such as:
- TRACE: The most detailed level, used for debugging and tracing the flow of execution.
- DEBUG: Used for debugging purposes, providing more information than INFO.
- INFO: Used for informational messages that highlight the progress of the application.
- WARN: Used for potentially harmful situations that may require attention.
- ERROR: Used for error events that may still allow the application to continue running.
- FATAL: The highest level, used for severe error events that will lead the application to
- abort.


We use the `@Slf4j` annotation from Lombok to automatically generate a logger instance in our classes. This allows us to log messages easily without manually creating a logger.
