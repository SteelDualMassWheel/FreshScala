Create program which will count number of points, which are inside rectangle created by two different points.

Requirements:

Create two values, each being a (Int, Int) tuple, which will have X and Y coordinates of points, which will be left bottom and right top corners of rectangle. You can pick (0, 0) and (10, 10) for example.
Create list of points (type: List[(Int, Int)]), which will contain points. Make sure that you add some points, which are inside and outside rectangle created by points from bullet number one to check, whether program works correctly.
Create tail recursive function (normal recursion = half of points), which will count how many points from List from bullet point 2 are inside rectangle from bullet point 1. 
Function, which checks, whether point is inside rectangle:

def isInside(leftBottomCorner: (Int, Int), rightTopCorner: (Int, Int), point: (Int, Int)): Boolean = point._1 >= leftBottomCorner._1 && point._2 >= leftBottomCorner._2 && point._1 <= rightTopCorner._1 && point._2 <= rightTopCorner._2


Hints:
Remember about Boolean -> Int conversion.
Check what methods List has - they are two, which are very helpful here.
Use "@scala.annotation.tailrec" annotation in front of function declaration to make sure it is tail recursive.

Example:
LeftUpCornerOfRectangle is (0, 0)
RightBottomCornerOfRectangle is (10, 10)

List of points: (0, 0), (1, 1), (10, 10), (11, 0), (0, 11)

Result: Number of points inside rectangle is 3