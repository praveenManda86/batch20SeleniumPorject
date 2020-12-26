package SeleniumPrograms;

import org.testng.annotations.*;

public class DependsExamples_TestNG {
	
	
@BeforeTest
public void browserSetup() {
	
}

@Test
public void Login() {
	System.out.println("This is Login");
}

@Test(dependsOnMethods= {"Login"})
public void SearchProduct(){
	System.out.println("This is Login");
}

@Test(dependsOnMethods= {"Login"})
public void AddToCart() {
	System.out.println("This is Login");
}

@Test(dependsOnMethods= {"Login"})
public void Payment() {
	System.out.println("This is Login");
}

@Test
public void ForgotPassword() {
	System.out.println("This is Login");
}


@Test
public void CreateAccount() {
	System.out.println("This is Login");
}

@AfterTest
public void closeBrowsers() {
	System.out.println("This is Login");
}
	
	

}
