## Contents of this section
<br>

### Annotations

These annotations need to be implemented on the application.properties
- spring.datasource.url=jdbc:h2:mem:testdb 
- spring.datasource.driver-class-name=org.h2.Driver 
- spring.datasource.username=sa 
- spring.datasource.password= 
- spring.jpa.database-platform=org.hibernate.dialect.H2Dialect 
- spring.h2.console.enabled=true 
- spring.jpa.hibernate.ddl-auto=update 
- spring.jpa.show-sql=true

Inside SecurityConfig:
- .ignoringRequestMatchers(PathRequest.toH2Console())
- .requestMatchers(PathRequest.toH2Console()).permitAll()
- http.headers().frameOptions().disable()
- http.headers(headers -> headers.frameOptions(HeadersConfigurer.FrameOptionsConfig::disable));

pom dependencies:
- \<dependency>
  \<groupId>com.h2database\</groupId><br>
  \<artifactId>h2\</artifactId><br>
  \<scope>runtime\</scope><br>
  \</dependency>
- \<dependency><br>
  \<groupId>org.springframework.boot\</groupId><br>
  \<artifactId>spring-boot-starter-jdbc\</artifactId><br>
  \</dependency>