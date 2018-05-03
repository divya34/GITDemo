package com.gitdemo.tests;

import org.testng.annotations.Test;

import com.gitdemo.pageobjects.LoginPage;

public class LoginTest {
  @Test
  public void test1() {
	  
	 LoginPage obj=new LoginPage();
	 System.out.println(obj.add(10, 20));
  }
}
