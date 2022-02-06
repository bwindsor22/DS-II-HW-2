# Getting started.
To begin this homework, clone the repo to your local computer and run the tests. Edit the code (and this Readme, for 
problem 1), then submit a zipfile of the result on Canvas. 

# Problem 1
The runtimes of run0 and run1 are given. What are the runtimes of:
* run2? 
* run3?
* run4?

Please ignore any constants; e.g. write O(N) instead of O(2N).

# Problem 2: Improving Runtime
Solve each of the below problems in O(N) time using a HashSet. Refer to the class worksheet for an example. 
See also tests in Problem 2 tests.java

* 2.1 Determine if a string has unique characters
* 2.2 Determine if a linked list contains any duplicate values, i.e. if two of the nodes contain the same value.
* 2.3 Determine if a linked list intersects itself, i.e. node.next is a node earlier up the chain. Hint: `Set<Node>`.
* 2.4 Absolute difference: count the pairs of integers that are different by a value of K. Hint: look at
countAddsTo10. How can you imitate this code with two sets?

 
# Problem 3: Intersection and difference
Use the removeAll and retainAll functions of a set to return the items in `List<List<String>>` first that are not in 
`List<List<String>>` second. As an illustrative example, consider John, who has a list of cities he wants to go to
in Asia and Europe, and Jane, who wants to go also but has already been to some cities in both Europe and Asia.

 
# Problem 4: Hashing
* Take a look at HashingTest.java and Hashing.java. Observe how the following classes work:
    * PersonBuiltInHashCode
    * PersonBadHashCode
    * PersonGoodHashCode
* Fill in the class PersonSelectiveHashCode so that two people are counted as equal
 if they have the same last name regardless of first name. I.e. John Doe is the same as Jane Doe but different from John Smith.
* Run testPersonSelectiveHashCodeSameLastName and testPersonSelectiveHashCodeDifferentLastName to ensure your class works