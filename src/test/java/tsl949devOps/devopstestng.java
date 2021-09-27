package tsl949devOps;

import org.testng.Assert;
import org.testng.annotations.Test;

public class devopstestng {
  @Test
  public void f() {
	  test tt = new test();
	 boolean check= tt.userDetails("userdemo", "password");
	  Assert.assertTrue(check,"valid details entered");
  }
  public void f1() {
	  test tt = new test();
	 boolean check= tt.userDetails("userdem0", "password123");
	  Assert.assertTrue(check,"invalidvalid details entered");
  }
}
