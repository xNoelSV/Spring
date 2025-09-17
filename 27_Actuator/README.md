## Contents of this section
<br>

### Spring Boot Actuator

Spring Boot Actuator is a powerful feature that provides production-ready features to help monitor and manage your application. It exposes various endpoints that allow you to gather metrics, health information, and other useful data about your application.
To include Actuator in your Spring Boot application, you need to add the following dependency to your `pom.xml` file:

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>
```

Once you have added the dependency, you can access various Actuator endpoints. Some of the commonly used endpoints include:
- `/actuator/health`: Provides information about the health of the application.
- `/actuator/info`: Displays arbitrary application information.
- `/actuator/metrics`: Exposes various metrics about the application.
- `/actuator/env`: Shows the current environment properties.
- `/actuator/loggers`: Allows you to view and change the logging levels of your application.
- `/actuator/beans`: Lists all the Spring beans in the application context.
- `/actuator/threaddump`: Provides a thread dump of the application.
- `/actuator/httptrace`: Displays HTTP trace information.
- `/actuator/auditevents`: Shows audit events for the application.
- `/actuator/mappings`: Displays the request mappings for the application.
- `/actuator/prometheus`: Exposes metrics in a format suitable for Prometheus.
- `/actuator/caches`: Provides information about the caches in the application.
- `/actuator/scheduledtasks`: Lists all scheduled tasks in the application.
- `/actuator/conditions`: Displays the conditions that were evaluated to determine which auto-configurations were applied.
- `/actuator/configprops`: Lists all `@ConfigurationProperties` beans and their properties.
- `/actuator/heapdump`: Provides a heap dump of the application.
- ...and many more.

We can use Spring Boot Admin UI to visualize and interact with these Actuator endpoints. Spring Boot Admin is a community project that provides a web-based interface for managing and monitoring Spring Boot applications. It can be easily integrated with Actuator to provide a user-friendly way to view application metrics, health status, and other information.
To set up Spring Boot Admin, you need to add the following dependencies to your `pom.xml` file:

```xml
<dependency>
    <groupId>de.codecentric</groupId>
    <artifactId>spring-boot-admin-starter-server</artifactId>
    <version>2.5.1</version>
</dependency>
<dependency>
    <groupId>de.codecentric</groupId>
    <artifactId>spring-boot-admin-starter-client</artifactId>
    <version>2.5.1</version>
</dependency>
```