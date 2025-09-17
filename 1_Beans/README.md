## Contents of this section
<br>

### Basic configuration:
- @Bean
- @Configuration
- @Component

### Bean research:
- @ComponentScan
- AnnotationConfigApplicationContext
- ClassPathXmlApplicationContext

### Hierarchical configuration:
- @Primary
- @PostConstruct
- @PreDestroy

### Other:
- Supplier
- .registerBean

### Annotations:
- Normal Java Classes are called POJOs (Plain Old Java Objects). We need annotations on top of them to indicate that the object performs a specific role in some framework.

Differences between beans and components:
- Beans are objects that are managed by the Spring IoC container. They are typically defined using the `@Bean` annotation within a `@Configuration` class. Beans can be of any type, including third-party classes that you do not have control over.
- Components, on the other hand, are a specific type of bean that is annotated with `@Component` or one of its specialized stereotypes like `@Service`, `@Repository`, or `@Controller`. Components are typically used for application-specific classes that you create and manage.
- In summary, all components are beans, but not all beans are components. Components are a subset of beans that are specifically annotated to indicate their role in the application.