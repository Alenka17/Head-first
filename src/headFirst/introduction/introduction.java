package headFirst.introduction;

public class introduction {
    public static void main(String[] args) {
        System.out.println("Hi");
    }
}
// int size = 27                     declaire the integer name 'size' and give it the value 27
// string name "Fido"                declaire of string variables named "name" and give it the value "Fido"
// Dog myDog = new Dog (name, size)  declaire a new Dog variable "myDog" and make the new Dog using 'name' and 'size'
// x = size -5                       subtract 5 from 27 (value of 'size') and assigne it to variable named 'x'
// if (x < 15) my dog.bark(8)        if x (value of 22) less then 15, tell the dog bark 8 times

//* while (x > 3) {                  keep looping as long as x is greater then 3
// my dog play ();                   tell the dog to play (whatever  THAT means to a dog)
// }                                 this looks like the end of the loop everything is in the {} is done for the loop
// *

//int [] numList = {2, 4, 6, 8};     declaire a list of integer variables "numList" and put 2,4,6,8 into the list
//System.out.print "Hello";          print "Hello" - probably at the command line
//System.out.print "Dog: +" name ;   print out "Hello Fido"  (the value of name is "Fido") at the command line
//String num = "8";                  declaire a character string variable  'num' and give it the value of "8"
//int z = integer.parseInt(num)      convert the string of characters "8" into actual numeric value '8'

//*try {                              try to do something, maybe the thing we are trying isnt garanteed to work
// readTheFile ("myFile.txt")         read a text file "myFile.txt" (or atleast TRY to read the file)
// }                                  must be the end of the "things to try", so, I guess you could try many things
//catch (FileNotFoundException ex {   this must be whetre you find oot if the things you tried did not work
//System.out.print "File not found.") if the thing we tried faile print "File not found" out at the command line
// }                                  looks like everything in the {} is what to do if the "try" did not work
// *

//   public class Dog  {              c what goes in sourse file?  The source code file (with the java. extension) holds one class definition.
//   }   Class                        The class presents a piece of your programm. The class must go within the pair of curly braces {}
//

//   public class Dog {               What goes in a class? A class has one or more methods.
//   void bark (){                    In the Dog class the bark method will  hold  instructions  for how the Dog should bark
//   }                                Your methods should be declaired inside a class  (anothe words within the {} curly braces of the class)
//   }  Method

// public class Dog {                 What goes in a method? Within the curly braces of a method, write the instructions for how this method
// void bark ()                       should be performed. Method code is basically set of statements, and for now you can think of a method
// statement 1;                       kind of like of a function of procedure
// statement 2;
// }
// }

//  Put a class in source file -> put a method in a class -> put statements in a method

// public class MyFirstApp {                                     1. Save MyfirstApp.java
// public static void main (String args []){                     2. Compile javac MyfirstApp.java
// System.out.println ("I Rule!");                               3. Run
// System.out.println ("The World");
// }
// }
// Your code can tell JVM:  1. Do something (statements, declarations, assignments, method calls etc)
// int x = 3;
// String name = "Dirk";
// x = x * 17;
//System out print ("x is" + x);
// double d = Math.random();
//
//    2. Do something again and again
// Loops: for and while
// while (x > 12) {
// x = x - 1;
// for (int x = 0 ; x < 10; x = x + 1 {
// System.out.print ("x is now" + x);
// }
// }
// 3. Do something under this condition
//Branching; if//else tests
// if x == 10 {
// System.out.print ("x must be 10");
// else {
// System.out.print ("x isn`t 10");
// if (( x < 3) & name.equals ("Dirk")){
// System.out.println ("Gently");
// System.out.print ("this line prints no matter what");
// }
// }

//int x = 4;                           assign 4 to x
//while (x < 3){                       loop code will run because x greater then 3
//x = x - 1;                           or will loop forever
//}
//int z = 27;                          loop code will not run because z is not equal  to 17
//while  z == 17 {
// }

// Examples of a while loop:                                            THIS IS OUTPUT:
//public class Loopy {                                              java Loopy
// public static void main (String[] args{                          Before the loop
// int x = 1;                                                       In the loop
// System.out.println ("Before the loop");                          value of x is 1
// while (x < 4) {                                                  in the loop
// System.out.println ("In the loop");                              value of x is 2
// System.out.println ("Value of x is " + x);                       in the loop
// x = x + 1;                                                       value of x is 3
// }
//System.out.println ("This is after the loop");                     this is after the loop
//}
//}
// BULLET POINTS:
//. Statement ends in semicolon;
//. Code blocks are defined by a pair of curly brackets {};
//. Declaire an int variable with a name and a type int x;
//. The assignment operator is one equals sign =;
//. The equals operator uses two equals signes ==;
//. A While loop runs everything within its block (defined by curly braces) as long a s a conditional teast is true;
//. If the conditional test is false,the while loop code is block wont run, and execution willmove down to the code
// immediately after the loop block
//. Put a boolean test inside inside parenthesis: while (x == 4)  ()

//OOP
//When you designe a class think about the objects that will be created from that class type.
//THINK ABOUT: 1) things Object knows    2) things Object does
//Shopping cart-> cart contents{knows}:: addToCart(), removeFromCart(), checkOut() {does}
//Button ->  label, color {knows} :: setColor(), setLabel(), dePress(), unDepress() {does}
//Alarm -> alarmTime, alarmMode {knows}:: setAlarmTime(), getAlarmTime(), isAlarmSet(), snooze () {does}
//Things and objects knows about itself are called  INSTANT VARIABLES
//Instant variables (state) -> Song -> title, artist {knows}
//Things the object can do are called METHODS (behavior)-> Song setTitle (), setArtist(), play()  {does}
//A CLASS is not an object. IT IS a BLUEPRINT FOR AN OBJECT. An object is like one entry in your address book
//Write your class:
//class Dog {
// int size;
// String breed;      instant variables
// String name;       instant variables
// void bark() {      method
// System.out.println ("Ruff, ruff");
// }
// }                Dog -> size, breed, name  -> bark();

// Write a tester (TestDrive) class
//classDogTestDrive{
// public static void main (String[] args){
//dog test code goes here
// }
//}

