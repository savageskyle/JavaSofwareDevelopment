## How to Use

- [Lab1](#lab-1)
- [Lab2](#lab-2)
- [Lab3](#lab-3)
- [Lab4](#lab-4)
- [Lab5](#lab-5)

## Lab1:
https://github.com/savageskyle/JavaSofwareDevelopment/tree/master/lab1

Set up your matrices:

Open the Main class.
Define your matrices A and B directly in the main method. Ensure they are compatible for multiplication (i.e., the number of columns in A equals the number of rows in B).
```java
double[][] A = {
    {1.0, 2.0, 3.0},
    {4.0, 5.0, 6.0},
    {7.0, 8.0, 9.0}
};

double[][] B = {
    {9.0, 8.0, 7.0},
    {6.0, 5.0, 4.0},
    {3.0, 2.0, 1.0}
};
```
Run the program



## Lab2:
https://github.com/savageskyle/JavaSofwareDevelopment/tree/master/lab2

Set up your input text:

Open the Main class.

In the main method, locate the StringBuffer text variable inside the try block.

Set the text variable to the input string you want to process.

```java
StringBuffer text = new StringBuffer("This is an example text to demonstrate processing");
```

Run the program



## Lab3:
https://github.com/savageskyle/JavaSofwareDevelopment/tree/master/lab3

In the Main class, locate the array submarines in the main method. Define all the submarines you want to process by specifying their properties:

Name

Displacement (in tons)

Speed (in knots)

Crew size

Build year
```java
Submarine[] submarines = {
    new Submarine("Titan", 5000, 30, 100, 2010),
    new Submarine("Nautilus", 3000, 25, 80, 2000),
    new Submarine("Poseidon", 4500, 28, 90, 2005),
    new Submarine("Leviathan", 6000, 35, 120, 2015),
    new Submarine("Kraken", 4000, 22, 70, 1995)
};
```

Then in the same method, define the submarine you want to search for in the array by specifying identical properties:

```java
Submarine target = new Submarine("Poseidon", 4500, 28, 90, 2005);
```

Run the program



## Lab4 
https://github.com/savageskyle/JavaSofwareDevelopment/tree/master/lab4

Set up your input text:

Open the Main class.

In the main method, locate the StringBuffer text variable inside the try block.

Set the text variable to the input string you want to process.


```java
StringBuffer inputText = new StringBuffer("Це    спосіб\tтестування   відпрацювання програми!");
```

Then run the program



## Lab5
https://github.com/savageskyle/JavaSofwareDevelopment/tree/master/lab5

Go to the Main class. In the main method, find the following block of code:

   ```java
   Gift gift = new Gift();

   // Add various sweets to the gift
   gift.addSweet(new Candy("Lollipop", 50, 30, "Cherry"));
   gift.addSweet(new Candy("Gummy Bear", 20, 15, "Orange"));
   gift.addSweet(new Chocolate("Milk Chocolate", 100, 50, 40));
   gift.addSweet(new Chocolate("Dark Chocolate", 150, 30, 70));
```
To filter sweets based on sugar content, find and modify the following variables:

```java
double minSugar = 20;
double maxSugar = 50;
```

Then run the program


