## Contents of this section
<br>

### Wiring
- By using Java default constructor
- @Autowired. Annotations:
    - Autowiring on field or setter method is not recommended in production. If Spring context doesn't find a correct bean to wire, program will fail.
    - The best way to wire beans is to use @Autowired annotation on top of the constructor.
    - We can wire beans and components.
- @Qualifier
- Circular reference