package ThreeAspect;

import org.aspectj.lang.annotation.*;

@Aspect
public class Log {

    @Pointcut("execution (* ThreeAspect.StudentThree.*(..))")
    public void selectAll(){

    }

    @Before("selectAll()")
    public void beforeExcute(){
        System.out.println("before");
    }

    @After("selectAll()")
    public void afterExecution(){
        System.out.println("after");
    }

    @AfterReturning(pointcut = "selectAll()", returning = "val")
    public void returningAfter(String val){
        System.out.println("Returning "+val);
    }

    @AfterThrowing(pointcut = "selectAll()", throwing = "ex")
    public void afterThrowing(Exception ex){
        System.out.println("throwing error "+ ex.getMessage());


    }




}
