package Projects.Dummy;

import org.testng.annotations.Test;

public class Class_Two {

	@Test
	public void e() {
		
		System.out.println("first method in class two");
	}
    @Test(groups = "regression")
     public void f() {
		
		System.out.println("Second method in class two");
	}
    @Test
     public void g() {
	
	    System.out.println("third method in class two");
}
}
