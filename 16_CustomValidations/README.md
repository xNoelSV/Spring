## Contents of this section
<br>

### Annotations
- 2 main libraries:
  - Jakarta Bean Validation
  - Hibernate Validator
- To create custom annotations we must use @interface in a Java file, followed by:
  - @Target: to specify where the annotation can be applied (FIELD, METHOD, PARAMETER, etc.)
  - @Retention: to specify how long the annotation is retained (SOURCE, CLASS, RUNTIME)
  - @Constraint: to specify the validator class that implements the validation logic
  - message(): to specify the default error message
  - groups(): to specify validation groups
  - payload(): to specify custom payload objects
- We need to create a validator class that implements ConstraintValidator<A, T>, where A is the annotation type and T is the type of the field being validated. The validator class must implement
  - initialize(A annotation): to initialize the validator with the annotation parameters
  - isValid(T value, ConstraintValidatorContext context): to implement the validation logic
- To use the custom annotation, we simply apply it to a field, method, or parameter
