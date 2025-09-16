## Contents of this section
<br>

### Spring Security - Part 3

- AuthenticationProvider: We need to create a custom implementation of the AuthenticationProvider interface to handle authentication logic.
  - Authenticate method: This method takes an Authentication object as input and returns an authenticated Authentication object if the authentication is successful. If the authentication fails, it throws an AuthenticationException.
  - Supports method: This method checks if the AuthenticationProvider can handle the type of authentication provided.

