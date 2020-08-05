package day4;
//lexical structure

//whitespace. Tab, space, carriage and return are counted under whitespace and is ignored by java
//comment.// this is single line comment. /**/ is multi line comment. Java compiler ignores comments
//keywords -Keywords are specific and reserved words and are used for specific purposes. 50 keywords. keywords are is small letters.
//identifier. Name given to someone or something. Class, variables,methods and constant are identifiers. Rules and convention(java convention)
/*identifiers have same rules.
 * digits can not be used in front of identifiers but we can use at any other places
 * we can not white space
 * we can not used any keywords
 * we can not use any special symbols at any place of an identifier but we can uses _  and $ at any place of an identifier. 
 * but use of $ sign is discouraged. library classes uses $ to generate internally many things.
 */
//Conventions is to come under  sun micro system
/*
 * Class should have first letter capital
 * Variable first word is small letter and remaining words first letter is capital i.e firstWord
 * method has similar convention like of a variable. The first world is all small letters and remaining words starts with Capital letters.
 * CONSTANT each word is capital and is joined by _ */

//data types
//literals
//operators and expression
//class
public class IdentifierDemo {

	public static void main(String[] args) {

		// variable
		int anyVariable;
		// constant is double at any time.
		double VALUE_OF_PI = 3.14;
		// method. method name should explain or hint the action of the method/function

	}

	public void sayHello() {
		System.out.println("hello!");
	}

}
