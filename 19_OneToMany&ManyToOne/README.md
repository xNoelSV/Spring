## Contents of this section
<br>

### OneToMany & ManyToOne Relationships

- OneToMany: This annotation is used to define a one-to-many relationship between two entities. It indicates that one entity can be associated with multiple instances of another entity.
  - Example: A `Customer` can have multiple `Orders`. In this case, the `Customer` entity will have a collection of `Order` entities.
  - Usage: The `@OneToMany` annotation is placed on the collection attribute in the parent entity (e.g., `Customer`).
  - Cascade Types: You can specify cascade types to define how operations on the parent entity affect the child entities (e.g., `CascadeType.ALL`).
  - Fetch Types: You can specify fetch types to define how the related entities are loaded (e.g., `FetchType.LAZY` or `FetchType.EAGER`).
- ManyToOne: This annotation is used to define a many-to-one relationship between two entities. It indicates that multiple instances of one entity can be associated with a single instance of another entity.
  - Example: An `Order` belongs to a single `Customer`. In this case, the `Order` entity will have a reference to the `Customer` entity.
  - Usage: The `@ManyToOne` annotation is placed on the reference attribute in the child entity (e.g., `Order`).
  - Join Column: You can use the `@JoinColumn` annotation to specify the foreign key column in the child entity that references the parent entity.
  - Fetch Types: Similar to `OneToMany`, you can specify fetch types for `ManyToOne` relationships.
  - Bidirectional Relationships: You can create bidirectional relationships by having both entities reference each other. In this case, the `OneToMany` side is the parent, and the `ManyToOne` side is the child.


- Annotation parameters: Both annotations can take various parameters to customize the relationship, such as:
  - mappedBy: Used in the `OneToMany` annotation to specify the field that owns the relationship in the child entity.
  - orphanRemoval: Used to specify whether to automatically remove child entities when they are no longer referenced by the parent entity.
  - cascade: Used to define the cascade operations (e.g., persist, merge, remove) that should be applied to the related entities.
  - fetch: Used to define the fetch strategy (e.g., lazy or eager loading) for the related entities.
  - optional: Used in the `ManyToOne` annotation to specify whether the relationship is optional (i.e., can be null).
  - targetEntity: Used to specify the target entity class in case of generic collections.
