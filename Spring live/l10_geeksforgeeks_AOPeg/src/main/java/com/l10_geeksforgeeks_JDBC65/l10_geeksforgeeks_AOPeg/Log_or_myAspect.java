package com.l10_geeksforgeeks_JDBC65.l10_geeksforgeeks_AOPeg;

import org.aspectj.lang.annotation.*;

@Aspect
public class Log_or_myAspect {

    @Pointcut("execution (* com.l10_geeksforgeeks_JDBC65.l10_geeksforgeeks_AOPeg.Student.*(..))")
    private void selectAll(){

    }

   @Before("selectAll()")
   public void beforeAdvice(){
       System.out.println("Student profile it to accessed");
   }

   @After("selectAll()")
   public void afterAdvice(){
       System.out.println("Student profile is access");
   }

   @AfterReturning(pointcut= "selectAll()", returning = "val")
   public void afterReturning(Object val){
       System.out.println("Returning"+val);

   }


   @AfterThrowing(pointcut="selectAll()", throwing ="ex")
   public void afterThrowing(IllegalAccessException ex){
       System.out.println("Exception Raised "+ ex);
   }

}
