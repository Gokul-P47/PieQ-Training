# Day1:OOP Concept
## Object oriented programming:
  It is a programming paradigm where dealing everything in terms of classes and objects. It helps to organize the code better and
  allow us to reuse the code. 
### 1.Class
  Class is a blueprint or template used to create an object. It contains properties and methods.
      <pre>Eg: class Shape{
              int hight;
              int width;
              Shape(int h,int w){
                this.hight=h;
                this.width=w;
              }
              void display(){...}
          }</pre>
    
### 2.Object 
  Object is an instance of a class. It is a real world entity. Whenever an object is created, memory space is allocated for that object.
      <pre>Eg: Shape obj=new Shape(4,5);</pre>

### 3.Polymorphism
  Polymorphism means having many form. In OOP, object can act differently on different context. There are two types of Polymorphism.<br>
        1. Compile time/Static Polymorphism - resolved at compile time. Eg:Function overloading.<br>
        2. Run time/Dynamic Polymorphism -resolved at run time. Eg:Function overriding.

### 4.Abstraction:
  Showing only essential details to the user and hiding the implementation complexity from the user. It cen be done with abstract class or interface. Design level issue.

### 5.Encapsulation:
  Wrapping up the data and methods under a single unit called class and providing security through Access modifiers. Implementation level issue.

### 6.Inheritance:
  Creating a new class from an existing class so that it inherits the features of the parent class. It allows the programmers to reuse the code. There are different  types of Inheritance. <br>
    1.Single Inheritance<br>
    2.Multiple Inheritance<br>
    3.Multilevel Inheritance<br>
    4.Hierarchical Inheritance<br>
    5.Hybrid Inheritance<br>
