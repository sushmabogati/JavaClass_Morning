package day23;

public class InvalidAgeException extends RuntimeException{//use RuntimeException for checked exception
 public InvalidAgeException(String msg){
	 super(msg);
	 
 }
}
