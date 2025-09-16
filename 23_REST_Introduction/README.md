## Contents of this section
<br>

### Introduction

- There are different approaches on web services, like:
    - SOAP (Simple Object Access Protocol): older, more rigid, and requires more overhead.
    - REST (Representational State Transfer): more popular, lightweight, and easier to use.

### RESTful Web Services with Spring Boot

We can create RESTful web services using Spring Boot by following these steps:
- Define a model class to represent the data.
- Create a repository interface to handle data access.
- Implement a service layer to encapsulate business logic.
- Create a controller to handle HTTP requests and responses.<br>
HTTP Request → Controller → Service → Repository → Database

Into controller we can use different annotations to map HTTP methods to Java methods:
- @GetMapping: Maps HTTP GET requests to a specific method.
- @PostMapping: Maps HTTP POST requests to a specific method.
- @PutMapping: Maps HTTP PUT requests to a specific method.
- @DeleteMapping: Maps HTTP DELETE requests to a specific method.

The parameters of these methods can be annotated with:
- @PathVariable: Binds a method parameter to a URI template variable.
- @RequestParam: Binds a method parameter to a query parameter in the URL.
- @RequestBody: Binds a method parameter to the body of the HTTP request.
- @RequestHeader: Binds a method parameter to a specific HTTP header.
- @RequestAttribute: Binds a method parameter to a request attribute.
- @RequestEntity: Binds a method parameter to the entire HTTP request entity.

Proxies:
- Spring Boot uses proxies to handle RESTful web services, allowing for features like transaction management, security, and caching.
- Proxies intercept method calls and add additional behavior before or after the method execution.
- Proxies can be configured using annotations like @Transactional, @Cacheable, and @Secured.
- Proxies are an important aspect of Spring Boot's architecture and enable many of its powerful features.
- Proxies can be used to implement cross-cutting concerns like logging, auditing, and performance monitoring.

### Annotations

- @RestController: Indicates that the class is a RESTful controller and combines @Controller and @ResponseBody.
- @CrossOrigin: Enables Cross-Origin Resource Sharing (CORS) for the controller or specific methods.
- Parameter "produces" into RequestMapping and its shortcut annotations (GetMapping, PostMapping, etc.) specify the media types that the method can produce as a response, such as "application/json" or "application/xml".
- @JsonIgnore: Prevents a field from being serialized or deserialized when converting to/from JSON.
- @JsonProperty: Specifies the JSON property name to use when serializing or deserializing a field.