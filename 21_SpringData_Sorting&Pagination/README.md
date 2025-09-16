## Contents of this section
<br>

### Sorting & Pagination with Spring Data JPA

- Sorting: Spring Data JPA provides built-in support for sorting query results. You can specify sorting criteria when retrieving data from the database.
- Two types of sorting:
  - Static Sorting: Defined at the repository method level using OrderBy keyword in method names.
  - Dynamic Sorting: Achieved by using `Sort` object post repository method call. Example: `findAll(Sort.by([criteria]).[descending/ascending])`.

- Pagination: Implemented using `Pageable` interface. It allows fetching a subset of data (a page) from a larger dataset.
- Applied by passing a `Pageable` object to repository methods. Example: `Page<?> findAll(Pageable pageable)`.
