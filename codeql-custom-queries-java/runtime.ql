import java

private class RuntimeExec extends Method {
  RuntimeExec() { hasQualifiedName("java.lang", "Runtime", "exec") }
}

from MethodAccess ma
where ma.getMethod() instanceof RuntimeExec
select ma,
  "The method call invokes Runtime.exec(), which may be a security risk. Check for command injection vulnerabilities.",
  ma.getLocation()
