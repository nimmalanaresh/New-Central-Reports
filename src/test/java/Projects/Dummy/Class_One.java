package Projects.Dummy;

import org.testng.annotations.Test;

public class Class_One {
	
	@Test(groups = "regression")
	public void a() {
		
		System.out.println("first method in class one");
	}
    @Test
     public void b() {
		
		System.out.println("Second method in class one");
	}
    @Test(groups = "regression")
     public void c() {
	
	    System.out.println("third method in class one");
}


}
