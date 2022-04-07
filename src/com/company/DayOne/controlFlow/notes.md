# Control Flow

### if Else
Use the if statement to specify a block of Java code to be executed if a condition is true

if statement

    if (20 > 18) {
        System.out.println("20 is greater than 18");
    }
if Else statement

    if (condition) {
        block of code to be executed if the condition is true
    } else {
        block of code to be executed if the condition is false
    }

else if statement

    int time = 22;

    if (time < 10) {
        System.out.println("Good morning.");
    } else if (time < 20) {
        System.out.println("Good day.");
    } else {
        System.out.println("Good evening.");
    }

    Outputs "Good evening."

### Switch
Use the switch statement to select one of many code blocks to be executed.

    int day = 4;

    switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    case 4:
        System.out.println("Thursday");
        break;
    case 5:
        System.out.println("Friday");
        break;
    case 6:
        System.out.println("Saturday");
        break;
    case 7:
        System.out.println("Sunday");
        break;
    }
    Outputs "Thursday" (day 4)

### Break
When Java reaches a break keyword, it breaks out of the switch block.

This will stop the execution of more code and case testing inside the block.

When a match is found, and the job is done, it's time for a break. There is no need for more testing.

### While
The while loop loops through a block of code as long as a specified condition is true:

    int i = 0;

    while (i < 5) {
        System.out.println(i);
        i++;
    }

In the example above, the code in the loop will run, over and over again, as long as a variable (i) is less than 5: