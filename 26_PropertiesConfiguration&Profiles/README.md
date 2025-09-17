## Contents of this section
<br>

### Properties Configuration 

We can create and use custom properties files in Spring Boot applications. These files can be used to configure various aspects of the application, such as database connections, server settings, and other application-specific properties.
To read those properties, we can use:
- `@Value` annotation to inject property values into fields.
- `@ConfigurationProperties` annotation to bind a group of properties to a Java class.
  - `@Validated` can be used along with `@ConfigurationProperties` to ensure that the properties meet certain validation criteria.
- `Environment` object to access properties programmatically.

### Profiles

Spring Boot supports the concept of profiles, which allows us to define different configurations for different environments (e.g., development, testing, production). We can create separate properties files for each profile, such as `application-dev.properties`, `application-test.properties`, and `application-prod.properties`. The active profile can be set using the `spring.profiles.active` property in the main `application.properties` file or through environment variables.
We can also use the `@Profile` annotation to conditionally load beans based on the active profile. This allows us to define different beans for different environments, ensuring that the application behaves appropriately in each context.


Different approaches to create and use Profiles:
- Using `application-{profile}.properties` files.
- Using `@Profile` annotation on beans.
- Setting active profiles via `application.properties` or environment variables.