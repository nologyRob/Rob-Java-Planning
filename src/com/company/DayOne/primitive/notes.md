#Primitive Data Types


See list of Data Types and their Min/Max Ranges below

https://www.baeldung.com/java-primitives

In Java SE 7 and later, any number of underscore characters (_) can appear anywhere between digits in a numerical literal. This feature enables you, for example, to separate groups of digits in numeric literals, which can improve the readability of your code.

### int

- The default value of an int declared without an assignment is 0.
- If the variable is defined in a method, we must assign a value before we can use it.
- We can perform all standard arithmetic operations on ints. Just be aware that decimal values will be chopped off when performing these on integers.

e.g.

    int chopped = 5/2;

The variable 'chopped' would be equal to 2.  It would chop off anything past the decimal.

### byte

byte is a primitive data type similar to int, except it only takes up 8 bits of memory. 

The default value of byte is also 0.

    byte b = 100;

### short

- If we want to save memory and byte is too small, we can use the type halfway between byte and int: short. 
- Also similar to the other types, the default value is 0. We can use all standard arithmetic on it as well.
    
    short s = 20_020;   //Note the underscore


### long
- long is the big brother of int. It's stored in 64 bits of memory, so it can hold a significantly larger set of possible values.
- Also similar to the other types, the default value is 0. We can use all standard arithmetic on it as well.

  
    long l = 1_234_567_890;

