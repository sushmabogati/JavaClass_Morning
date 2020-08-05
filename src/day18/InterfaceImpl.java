package day18;

public class InterfaceImpl implements InterfaceDemo1, InterfaceDemo2 {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int m5() {
		// TODO Auto-generated method stub
		return 0;
	}

}
//if we want to implement 2 methods but not other 2 methods then we have to make it abstract class. 
//If we don't want to write abstract class then all the methods ha to be implemented
//java don't do multiple inheritance but in case multiple inheritance to be done then it should be done through interface
//a class can be extended but it should be done before implements because inheritance is not done more then once.
