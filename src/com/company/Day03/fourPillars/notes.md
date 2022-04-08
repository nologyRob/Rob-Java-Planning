### The four pillars of object-oriented programming are:

- Abstraction
- Encapsulation
- Inheritance
- Polymorphism

--- 

## Abstraction
- In inheritance, you can create a new class that is inherited by another class.
- The new class we can refer to as a child class or subclass and the class which already exists refer to a parent or superclass. 
- One object acquires all the behaviors and properties of a parent object, and when you inherit a child class from a parent class you can reuse fields and methods of that class.


        Parent Class {

            //methods and fields

            }
        
        class Child extends Parent {

            //methods and fields
    
            }
- In the example above, 'Child' class would inherit all methods and fields from the 'Parent' class
- Note: Multiple inheritances are not allowed by Java.
---

## Encapsulation


---

## Inheritance


---

## Polymorphism
- Simply we can define this concept as this, “having many forms”. 
- We can simply explain this concept using a person because a person can be many things at the same time. 
- He can be a father, an employer, a husband, etc.

### Method Overriding - Example of Polymorphism

        class Overriding {
            void eat() {System.out.println (“She is eating”);}
        }
        
        class Overriding1 extends Overriding {
            
            void eat(){System.out.println("He is eating");
            }

            public static void main (String args[]) {

                Overriding1 obj = new Overriding1();
                obj.eat();
        }
            }

- In the example above, a method has been declared in the parent class then again in the child class, the implementation of the method is different in the child class but the method has the same name, this is called method overriding.

### Method Overloading - Example of Polymorphism

---