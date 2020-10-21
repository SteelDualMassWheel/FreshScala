Create program, which will:

Take two arguments from command line, assuming they are small characters (make proper conversion & checks)
Check which of characters is alphabetically first
Create and print list of characters between alphabetically first and alphabetically second
Example: scala 2lab.scala d g

Output:

d

e

f

g



Example: scala 2lab m k

Output:

k

l

m




Example: scala 2lab.scala A c

Output:

a

b

c



Example: scala 2lab.scala

Output: "Please provide two arguments"



Example: scala 2lab.scala a

Output: "Please provide two arguments"



Example: scala 2lab.scala 1 h

Output: "Please provide only letters"



Hint: There's "isLetter" method in Scala for values/variables of type character.

Condition: With use of "for" you can get only half of points. 
