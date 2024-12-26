def list = [1, 2, 3, 4, 5]

println list.sum()

list = ["a", "b", "c"]

try {
    println list.sum()
} catch (Exception e) {
    println "Error: Cannot calculate sum of non-numeric list.  Exception: ${e.message}"
}

//Alternative solution using collect to filter for numbers only
list = [1, 2, "a", 4, "b", 6]
println list.findAll { it instanceof Integer }.sum() // This will sum only the Integers