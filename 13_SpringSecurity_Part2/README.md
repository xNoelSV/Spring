## Contents of this section
<br>

Discussing about how to control CSRF in Spring with Spring Security. CSRF generated and maintained by backend application, only one per session. 

### Annotations
- \<input type="hidden" th:name="\${_csrf.parameterName}" th:value="${_csrf.token}" /> // GENERATES CSRF RANDOM CODE FOR THE SESSION
- .csrf((requests) -> requests.ignoringRequestMatchers("/saveMsg")) // IGNORE REQUEST FROM /saveMsg
                
