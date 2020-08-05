package day18;

public abstract class Shape {
	public abstract void draw(); 
	public void paint() {
		System.out.println("it is painted");
	}
	public Shape() {
		System.out.println("Shape i.e parent's constructor is called");
	}
	
}

//The method in parent is general. Methods are not implemented in abstract class.
// it is overridden in child classes. 
//Parent class gives contracts of method but not details in the method.


//word abstract is added before the class name.
//word abstract is added after access modifier and  return type in the unimplemented method.
//It's a good practice to annote @override before overiding the abstract method.While overriding the constracts of the method are same like in parents class 
//but the method is implemented differently

//How is a class made abstract class?
//A class is made abstract class by adding the keyword abstract before the keyword class and by not implementing the abstract method.
//If a class extends a abstract class then it must override the abstract method of the abstract parent class.


//rules of Abstract Class
//Contract should be maintain.
//child must override abstract method.
//Abstract class can not be instantiate meaning it can not make object. but we can make any number of reference variable.
//meaning Shape shape = new Shape(); can not be made but Shape shape which is reference variable can be made.

//note in Parents reference variable child's object can be made.

//An abstract class necessarily don't have to have abstract method. It can have one, one or more or non abstract method in it with full implemented method
//But if at least one abstract method is in the class. It has to be abstract class.
//Abstract keyword used in a class or in a method. It can not be used in a variable.
//if a child class don't want to override the method of the parent class then it must write abstract in its own class.
//We can chose to or not to override non abstract method in abstract parent class.
//abstract method can not be private. It can be public, default and protected.
//abstract method can not have static in front of it.
//we can not override static method and private method and final method
//final can not be used before abstract class . Final class can not be extended. for example String is final class. No one can extend String class. 
//Abstract class can not be final class because if we do so, the class can not have child class.
//private static final are not allowed to be used.
//Abstract means without full details or implementation
//Abstract class gives partial abstraction not full abstraction.

/*Inheritance is very strong relationship therefore java have another concept of interface. which gives loose coupling and fully abstraction*/
