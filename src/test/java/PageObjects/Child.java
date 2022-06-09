package PageObjects;

public class Child extends parent{
	
	
	
	@Override
	public int add() {
		int x=6;
		int y=6;
//		System.out.println(n);
		return (x+y);
		
	}
	
	public void parentAdd() {
		System.out.println(super.add());
	}

}