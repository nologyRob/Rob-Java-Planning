### Casting or Typecasting

    public int castThisOne = (int) 1.5;

Typecasting lets you take a number of one type and turn it into another type

      
    int castPlease = 1.5;

What do you think this would show in if we printed this to the console?

Java doesn't know how to deal with rounding in casting so it essentially just chops it off!

Java will automatically cast up BUT it will not automatically cast down.
  
    byte a;
    short b;
    int c;
    long d;
    float e;
    double f;


What do you think would happen if we tried to do this?

    int d = c;

create int type variable

    int num = 10;

converts int to string type

    String data = String.valueOf(num);

convert string variable to int

    int numAsStringConverted = Integer.parseInt(data);

create string type variable

    String numAsString = "10";