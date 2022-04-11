# Java 02

## Coach Notes
- Students provided template for lesson via repository.  All files/folders ready to use.
- Students still haven't learnt about methods so a method is provided in each class for students to complete work
- All methods are called back in Main Method.
---

## Slides
- See curriculum documentation repository
---

## Four Pillars
Discuss/share the four pillars

- Abstraction
- Encapsulation
- Inheritance
- Polymorphism

###Abstraction:

- Discuss how we will be acheiving this down the line through the use of abstract classes and interfaces.

###Encapsulation:

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
## Classes

---

## Modifiers

---

## Code-along


---
## Challenge

---