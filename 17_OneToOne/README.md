## Contents of this section
<br>

### OneToOne Relationship
- A one-to-one relationship is a type of association between two entities where each entity has a unique instance of the other entity.
- Annotations:
  - @OneToOne: specifies a one-to-one relationship between two entities
  - @JoinColumn: specifies the foreign key column in the owning entity that references the primary key of the other entity
  - @PrimaryKeyJoinColumn: specifies that the primary key of the owning entity is also a foreign key that references the primary key of the other entity
- Annotation parameters:
  - mappedBy: specifies the field in the other entity that owns the relationship
  - cascade: specifies the cascade operations to be applied to the related entity (e.g., PERSIST, MERGE, REMOVE, ALL)
  - fetch: specifies the fetch type (EAGER or LAZY)
  - optional: specifies whether the relationship is optional (true) or mandatory (false)
- Deep dive into fetch types:
  - EAGER: the related entity is loaded immediately with the owning entity
  - LAZY: the related entity is loaded on demand when accessed
- Deep dive into cascade types:
  - PERSIST: when the owning entity is persisted, the related entity is also persisted
  - MERGE: when the owning entity is merged, the related entity is also merged
  - REMOVE: when the owning entity is removed, the related entity is also removed
  - REFRESH: when the owning entity is refreshed, the related entity is also refreshed
  - DETACH: when the owning entity is detached, the related entity is also detached
  - ALL: all cascade operations are applied to the related entity

