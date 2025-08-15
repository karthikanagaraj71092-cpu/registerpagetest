package TestNgpacks;

import org.testng.annotations.Test;

public class Groups {

	
	@Test(groups = {"Add Actor"})
	public void register() {
		System.out.println("Register");
	}
	@Test(groups = {"Add Actor"})
	public void Signup() {
		System.out.println("Signup");
	}
	@Test(groups = {"Add Actor"})
	public void Signin() {
		System.out.println("Signin");
	}
	
	@Test(dependsOnMethods = "Signin",groups = {"Reports"})
	public void Casting() {
		System.out.println("Casting");
	}
	
	@Test(dependsOnMethods = "Signin", groups = {"Reports"})
	public void Adpa() {
		System.out.println("Adpa");
	}
	
	@Test(dependsOnMethods = "Signin", groups = {"Reports"})
	public void production() {
		System.out.println("Production");
	}
	
	@Test(dependsOnMethods = "Signin", groups = {"Reports"})
	public void payroll() {
		System.out.println("Payroll");
	}
	
	@Test(dependsOnMethods = "register",groups = {"payment"})
	public void report() {
		System.out.println("Report");
	}
	
	
}
