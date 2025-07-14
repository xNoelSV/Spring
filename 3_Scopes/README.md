## Contents of this section
<br>

### Scopes
- Eager/Singleton (default): @Scope(BeanDefinition.SCOPE_SINGLETON)
- @Lazy. Initialization on first use

- Prototype: @Scope(BeanDefinition.SCOPE_PROTOTYPE). Annotations:
    - When we inject a Prototype bean into a Singleton bean, the prototype bean is transformed into a Singleton.
    - Prototype beans are created once per request, not per application initialization.