import python

/**
 * @name Detect potentially unsafe deserialization
 * @description Find instances of potentially unsafe deserialization using `pickle` in Python applications.
 * @kind problem
 * @problem.severity warning
 * @tags security
 */

from ImportCall ic, string module, string member
where
  ic.getModule().toString() = "pickle" and
  ic.getMember().toString() in ["load", "loads", "Unpickler"]
select ic, "Potential unsafe deserialization using " + member + " from " + module