## Contents of this section
<br>

### ManyToMany Relationships

- ManyToMany: This annotation is used to define a many-to-many relationship between two entities. It indicates that multiple instances of one entity can be associated with multiple instances of another entity.
  - Example: A `Student` can enroll in multiple `Courses`, and a `Course` can have multiple `Students`. In this case, both the `Student` and `Course` entities will have collections referencing each other.
  - Usage: The `@ManyToMany` annotation is placed on the collection attributes in both entities (e.g., `Student` and `Course`).
  - Join Table: You can use the `@JoinTable` annotation to specify the join table that holds the foreign keys for both entities. This annotation allows you to define the name of the join table and the join columns for each entity.
  - Cascade Types: You can specify cascade types to define how operations on one entity affect the related entities (e.g., `CascadeType.ALL`).
  - Fetch Types: You can specify fetch types to define how the related entities are loaded (e.g., `FetchType.LAZY` or `FetchType.EAGER`).
  - Bidirectional Relationships: Many-to-many relationships are often bidirectional, meaning both entities reference each other. You can choose one side as the owning side by using the `mappedBy` attribute on the non-owning side.

- Annotation parameters: The `@ManyToMany` annotation can take various parameters to customize the relationship, such as:
  - mappedBy: Used in one of the entities to specify the field that owns the relationship
  - cascade: Used to define the cascade operations (e.g., persist, merge, remove) that should be applied to the related entities.
  - fetch: Used to define the fetch strategy (e.g., lazy or eager loading)
  - targetEntity: Used to specify the target entity class in case of generic collections.
  - orphanRemoval: Used to specify whether to automatically remove child entities when they are no longer
  - optional: Used in the `ManyToOne` annotation to specify whether the relationship is optional (i.e., can be null).
  - joinColumns: Used in the `@JoinTable` annotation to specify the foreign key columns for the owning entity.
  - inverseJoinColumns: Used in the `@JoinTable` annotation to specify the foreign
  - name: Used in the `@JoinTable` annotation to specify the name of the join table.
  - schema: Used in the `@JoinTable` annotation to specify the schema of the join table. key columns for the inverse entity.
  - catalog: Used in the `@JoinTable` annotation to specify the catalog of the join table.
  - uniqueConstraints: Used in the `@JoinTable` annotation to specify unique constraints on the join table.
  - indexes: Used in the `@JoinTable` annotation to specify indexes on the join table.
  - foreignKey: Used in the `@JoinTable` annotation to specify the foreign key
  - inverseForeignKey: Used in the `@JoinTable` annotation to specify the inverse foreign key
  - joinFetch: Used to specify the join fetch strategy for the relationship.
  - orderBy: Used to specify the ordering of the related entities in the collection.
  - orderColumn: Used to specify a column to maintain the order of the related entities in the collection.
  - mapKey: Used to specify a map key for the collection when using a `Map` collection.
    - mapKeyColumn: Used to specify the column for the map key when using a `Map` collection.
    - mapKeyJoinColumns: Used to specify join columns for the map key when using a `Map` collection.
    - mapKeyEnumerated: Used to specify that the map key is an enumerated type
    - mapKeyTemporal: Used to specify that the map key is a temporal type.
    - mapKeyClass: Used to specify the class of the map key when using a `
    - mapKeyAttributeOverride: Used to override the mapping of the map key attribute when using a `Map` collection.