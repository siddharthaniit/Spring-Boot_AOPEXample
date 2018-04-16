package com.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeAspect {
	
	@Before(value = "execution(* com.example.service.UserService.*(..)) and args(id,name)")
	public void beforeAdvice(JoinPoint joinPoint,int id,String name)
	{
		System.out.println("Before method:" + joinPoint.getSignature());
		System.out.println("Creating Employee with name - " + name + " and id - " + id);

	}
	

	@Before(value = "execution(* com.example.service.UserService.*(..)) and args(id,email,name)")
	public void beforeAdvice1(JoinPoint joinPoint,int id,String email,String name)
	{
		System.out.println("Before method:" + joinPoint.getSignature());
		System.out.println("Creating Employee with name - " + email + " and id - " + id +name);

	}
	
	/*@Before(value = "execution(* com.example.service.UserService.*(..)) and args(user)")
	public void beforeAdvice2(JoinPoint joinPoint,User user)
	{
		System.out.println("Before method:" + joinPoint.getSignature());
		System.out.println("Creating Employee with name - " + user.getId());

	}
	
	@Around(value = "execution(* com.example.service.UserService.*(..)) and args(user)")
	public User beforeAdvice3(JoinPoint joinPoint,User user)
	{
		System.out.println("Before method:" + joinPoint.getSignature());
		System.out.println("Creating Employee with name - " + user.getEmail());
	    return user;

	}*/
	
	@AfterThrowing(value = "execution(* com.example.service.UserService.*(..))",throwing =" excep")
	public void beforeAdvice4(JoinPoint joinPoint,Throwable excep) throws Throwable
	{
		System.out.println("Before method:" + joinPoint.getSignature());
		System.out.println("Creating Employee with name - " +excep);
		System.out.println("exception ");
	    
	}
	@After(value = "execution(* com.example.service.UserService.*(..)) and args(id,name)")
	public void afterAdvice(JoinPoint joinPoint, int id , String name) {
		System.out.println("After method:" + joinPoint.getSignature());

		System.out.println("Successfully created Employee with name - " + name + " and id - " + id);
	}

}
