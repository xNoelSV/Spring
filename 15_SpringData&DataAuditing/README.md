## Contents of this section
<br>

### Spring Data

- Multiple modules for different databases (JPA, MongoDB, Redis, etc.)
- Different Repository interfaces:
  - CrudRepository          | PagingAndSortingRepository
  - ListCrudRepository      | ListPagingAndSortingRepository
- We can create derived query methods by following a naming convention
- Auditing support:
  - @CreatedBy: We need auditingAware bean
  - @CreatedDate: Database creation timestamp
  - @LastModifiedBy: We need auditingAware bean
  - @LastModifiedDate: Database last modification timestamp

### Annotations
- @EnableJpaRepositories: to enable JPA repositories
- @EntityScan: to scan for JPA entities
- @Enumerated: to specify how to persist enum values (ORDINAL or STRING)
- @Transient: skip that attribute

