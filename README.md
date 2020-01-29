#                         Francesko Racaku
# Shapes
Finding Area of Different Shapes

For each additional class this code does the following:

1.Have a constructor that takes a name, which it turn invokes the constructor of its superclass.

2.Implements a setDimensions() method that will take the following parameters:

a)Square: length and height

b)Circle: radius

c)Triangle: 3 sides

d)EquilateralTriangle: 1 side

3.Overrides the printDimensions() method of the superclass to print the dimensions of the current shape.

4.Override the getArea() method of the superclass to calculate the correct area for each shape.For triangles, I used Heron's Formula:
area  =√ s (s-a) (s-b) (s-c)  wherea,b, andc are the lengths of the sides, ands = ½ the perimeter

5.The main class creates one instance of each class, and prompt the user to enter the dimensions for each object.

6.In the end it prints the name, dimensions, and area for each object to the screen.
