## Contents of this section
<br>

### Custom Queries with Spring Data JPA

- We use the `@Query` annotation to define custom queries directly on repository methods.
- Supports both JPQL (Java Persistence Query Language) and native SQL queries.
- Allows for more complex queries that may not be easily expressed using method naming conventions.
- Using `@Modifying` annotation for update and delete operations.
- Using `@Transactional` annotation to manage transactions for modifying queries.


- We use the `@NamedQuery` annotation to define named queries at the entity level.
- Named queries are static and can be reused across multiple repository methods.
- Named queries are defined using JPQL and are associated with a specific entity.


- We use the `@NamedNativeQuery` annotation to define named native SQL queries at the entity level.
- Named native queries are static and can be reused across multiple repository methods.
- Named native queries are defined using native SQL and are associated with a specific entity.

### Differences between Custom Queries and Named Queries:
- Custom Queries are defined directly on repository methods using the `@Query` annotation, while Named Queries are defined at the entity level using `@NamedQuery` or `@NamedNativeQuery` annotations.
- Custom Queries can be more flexible and dynamic, while Named Queries are static and predefined.
- Custom Queries can use both JPQL and native SQL, while Named Queries are typically defined using JPQL (for `@NamedQuery`) or native SQL (for `@NamedNativeQuery`).
- Custom Queries can be modified easily by changing the repository method, while Named Queries require changes to the entity class.
- Custom Queries can be used for complex queries that may not fit well with method naming conventions, while Named Queries are often used for common queries that are reused across multiple methods.
- Custom Queries can be combined with method naming conventions, while Named Queries are standalone and do not rely on method names.
- Custom Queries can be used with `@Modifying` and `@Transactional` annotations for update and delete operations, while Named Queries do not have this capability directly.
- Custom Queries can be more readable and easier to understand in the context of the repository method, while Named Queries may require looking at the entity class to understand their purpose.
- Custom Queries can be more suitable for dynamic query generation, while Named Queries are better suited for static, predefined queries.