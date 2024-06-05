import java
import semmle.code.java.security.UnsafeDeserializationQuery
import UnsafeDeserializationFlow::PathGraph

from UnsafeDeserializationFlow::PathNode source, UnsafeDeserializationFlow::PathNode sink
where UnsafeDeserializationFlow::flowPath(source, sink)
select sink.getNode().(UnsafeDeserializationSink).getMethodCall(), source, sink,
  "Unsafe deserialization depends on a $@.", source.getNode(), "user-provided value"
