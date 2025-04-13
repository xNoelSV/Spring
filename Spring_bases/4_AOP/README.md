## Contents of this section
<br>

### AOP
- @Aspect
- @Pointcut
- Advice annotations:
  - @Before
  - @AfterReturning
  - @AfterThrowing
  - @After
  - @Around
- Advices approach:
  - @<i>advice</i>(execution(modifiers-pattern? return-type-pattern type-pattern? name-pattern(param-pattern) throws-pattern?))<br>
  Jumps when the pointcut matches.
  - @<i>advice</i>(@annotation(annotation-pattern)).<br>
  Jumps when the explicitly annotated pointcut matches. We need to create annotations via: <br>
    @Retention(RetentionPolicy.RUNTIME)<br>
    @Target(ElementType.METHOD)<br>
    public interface MyAnnotation {}
  
- @Order. Determines the order in which the advice is executed.

### Personal explanations
- Difference between "ProceedingJoinPoint" and "JoinPoint".<br>
JumpPoint takes the information about the execution of the method, while ProceedingJoinPoint allows you to continue the execution of the method. <br>
JumpPoint can be only executed in @Before, @AfterReturning, @AfterThrowing, @After advices, while ProceedingJoinPoint can be executed in @Around advice.