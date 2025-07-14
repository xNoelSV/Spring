## Contents of this section
<br>
ControllerAdvice takes all the exceptions thrown everywhere. ExceptionHandler treats specific exceptions. You can also treat internal controller exceptions if you put the @ExceptionHandler annotation on top of the method that will handle it, but doing it on a general handler class could be of much interest. 

### Annotations
- @ControllerAdvice: Handle exceptions that are thrown across the whole application 
- @ExceptionHandler(): Defines the logic of each exception into a function. There are different ways to handle one or many exceptions
  - @...(Exception.class)
  - @...({RuntimeException.class, NullPointerException.class,...]})