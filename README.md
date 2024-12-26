# Groovy List sum() Method: Unexpected Runtime Exception with Mixed Data Types

This example demonstrates an uncommon error in Groovy related to the `sum()` method when applied to lists containing mixed data types (numbers and strings). The `sum()` method is designed to work on numeric lists; however, if it encounters a non-numeric value, it results in a runtime exception instead of providing a more user-friendly error or handling the mixed type situation.

The included files, `bug.groovy` and `bugSolution.groovy`, showcase the problem and a potential solution.

## How to reproduce
1.  Copy the code in `bug.groovy`.
2.  Run the script using Groovy.
3. Observe the runtime exception.