import java

from Method m
where m.hasName("readObject")
select m.getLocation(),
  "Method 'readObject' may be a deserialization entry point. Check for unsafe deserialization.", m
