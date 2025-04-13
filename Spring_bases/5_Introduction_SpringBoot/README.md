## Contents of this section
<br>

### Project annotations:
- @SpringBootApplication. Enable three features:
  - @EnableAutoConfiguration: enable auto configuration of spring boot
  - @ComponentScan: enable component scanning on the same package
  - @SpringBootConfiguration: Enable registration of extra beans in the context or the import of additional configuration classes. Similar to @Configuration annotation inside Spring Core.
  - @SpringBootApplication(exclude = {xxxx.class}): exclude xxxx autoconfiguration class from being scanned by @ComponentScan
- @RequestMapping
- application.properties:
  - server-servlet.context-path=/myapp : Custom context path 
  - server.port=0 : default port is 8080. 0 means find a free port.
  - debug=true : run app in debug mode

### Annotations:
- MVC apps are likely for frontend and backend development. If there is no MVC framework, then app is entirely backend. 