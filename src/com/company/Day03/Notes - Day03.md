# Java 02

## Coach Notes
- Students provided template for lesson via repository.  All files/folders ready to use.
- Students still haven't learnt about methods so a method is provided in each class for students to complete work
- All methods are called back in Main Method.
---

## Slides
- See curriculum documentation repository
---

## Classes - Do we need to teach constructors at the same time? Surely

    public class Car {

    }

- Discuss naming convention for classes
- Discuss public/private/protected
- Reinforce that classes are BLUEPRINTS for creating Objects.
- Create some fields/member variables
- Discuss modifiers/access.


    public class Car {
      public int doors;
      public int wheels;
      public String model;
      public String color;

    }

- Discuss/show how to create an OBJECT using this class/blueprint in the Main Method.

    
      Car honda = new Car();
      Car kia = new Car();

- We have just created two new objects.  Accord and Sportage. 


      honda.doors = 4;
      honda.wheels = 2;
      honda.model = "Accord";
      honda.model = "White";

- NOTE discuss how this is not a great way to do it (should use Encapsulation but will learn about this later in the lesson)


     

#### Discuss constructors here?


    public Car(int doors, int wheels, String model, String color) {
      this.doors = doors;
      this.wheels = wheels;
      this.model = model;
      this.color = color;
    }

    Car kia = new Car(4,4,"Sportage","White");

---

## Four Pillars
Discuss/share the four pillars

- Abstraction
- Encapsulation
- Inheritance
- Polymorphism

### Abstraction:

- Discuss how we will be achieving this down the line through the use of abstract classes and interfaces.

### Encapsulation:

- Show has we can use private variables in our classes to bundle data and methods that work on that data within one unit, the class.
- If we do this, we have to bring in the use of getters/setters (show the fast way of doing this via right-click etc)
- Using encapsulation we can allow the programmer to decide on the access to data and methods operating on that data

        
    private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }



###Inheritance:


    class Animal {

        // field and method of the parent class
        String name;

        public void eat() {
            System.out.println("I can eat");
        }
    }

Now create a class that INHERITS from the Animal class using the "extends" keyword.

        class Dog extends Animal {
        
            // new method in subclass

            public void display() {
                System.out.println("My name is " + name);
            }
        }
In the 'Main' class, create an object of the subclass 'Dog'.

        class Main {

            public static void main(String[] args) {

            Dog labrador = new Dog();

            // access field of superclass
            labrador.name = "Sandy";
            labrador.display();
        
            // call method of superclass
            // using object of subclass
            labrador.eat();

            }
        }
#### Why use inheritance? 

- Short answer - Because developers are lazy! 
- The idea behind inheritance in Java is that you can create new classes that are built upon existing classes. 
- When you inherit from an existing class, you can reuse methods and fields of the parent class. 
- Moreover, you can add new methods and fields in your current class also.
  (https://www.programiz.com/java-programming/inheritance)



### Polymorphism

    public class Animal{
    
        public void sound(){
            System.out.println("Animal is making a sound");   
        }
    }

    public class Horse extends Animal{
    
        @Override
        public void sound(){
            System.out.println("Neigh");
        }
    }

    public class Cat extends Animal{
    
        @Override
        public void sound(){
            System.out.println("Meow");
        }
    }

- As you can see that although we had the common action for all subclasses sound() but there were different ways to do the same action.
- This is a perfect example of polymorphism (feature that allows us to perform a single action in different ways).
- It would not make any sense to just call the generic sound() method as each Animal has a different sound.
- Thus we can say that the action this method performs is based on the type of object.

  (https://beginnersbook.com/2013/03/polymorphism-in-java/)

#### Why use polymorphism?

- Short answer, it allows us to pick have the benefits of inheritance but with more flexibility.
- Java Inheritance lets one class acquire the properties and attributes of another class.
- Polymorphism in Java allows us to use these inherited properties to perform different tasks. 
- Thus, allowing us to achieve the same action in many different ways.

---


## Modifiers

---

## Code-along


---
## Challenge
- Thinking something along the lines of some sort of 'Animal Crew Creator' game.
- Students must create Dog, Cat, Rabbit, Gold Fish classes that extend Animal.
- Use the command line to get user to choose how many animals they want in their animal crew.
- If the user were to select 5.  5 random animals would be instantiated and their type of animal and a message would be shown in the command line.
- Encapsulation must be used (private fields and getters/setters)
- Inheritance must be used (Extending animal)
- Constructors must be used for sub-classes.
- Polymorphism might be used via method overriding.
---