package com.cydeo.aspect;

import com.cydeo.dto.CourseDTO;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
public class LoggingAspectMine {


    Logger logger = LoggerFactory.getLogger(LoggingAspectMine.class);

//    @Pointcut("execution(* com.cydeo.controller.CourseController.*(..))")
//    public void myPointCut(){}
//
//
//    @Before("myPointCut()")
//    public void log(){
//        logger.info("Info log .............");
//    }
//---------------------------------------------------------------------------------------------------------------------------
//
//    @Pointcut("execution(* com.cydeo.repository.CourseRepository.findById(*))")
//    public void courseRepositoryFindByIdPC(){}
//
//    @Before("courseRepositoryFindByIdPC()")
//    public void beforeCourseRepositoryFindById(JoinPoint joinPoint){
//        logger.info("Before --> Method : {}, Arguments : {}, Target: {}",joinPoint.getSignature(),joinPoint.getArgs(),joinPoint.getTarget());
//        // in method {} --> curly bracketler sirasiyla parametlerle yer degistirecek otomatikmen. Guzel ozellik.
//
//        //joinPoint.getSignature() --> hangi method calisiyor onu gosterir
//        // joinPoint.getArgs()  -- > hangi argumanlar gecildi onu gosterir
//
//
//    }
//---------------------------------------------------------------------------------------------------------------------------

//    @Pointcut("within(com.cydeo.controller..*)")
//    public void anyControllerOperation(){}
//
//    @Pointcut("@within(org.springframework.stereotype.Service)")
//    public void anyServiceOperation(){}
//
//    @Before("anyControllerOperation() || anyServiceOperation()")
//    public void beforeAnyControllerOrServiceAdvice(JoinPoint joinPoint){
//        logger.info("Before --> Method : {}, Arguments : {}, Target: {}",joinPoint.getSignature(),joinPoint.getArgs(),joinPoint.getTarget());
//
//    }

//---------------------------------------------------------------------------------------------------------------------------


    //"within"

    // we will check delete mapping.
//    @Pointcut("@annotation(org.springframework.web.bind.annotation.DeleteMapping)")
//    public void anyDeleteControllerOperation(){}
//
//    @Before("anyDeleteControllerOperation()")
//    public void beforeDeleteMappingAnnotation(JoinPoint joinPoint){
//        logger.info("Before --> Method : {}, Arguments : {}, Target: {}",joinPoint.getSignature(),joinPoint.getArgs(),joinPoint.getTarget());
//
//    }


    //---------------------------------------------------------------------------------------------------------------------------

    // "annotation"
//    @Pointcut("@annotation(com.cydeo.annotation.LoggingAnnotation)")
//    public void LoggingAnnotationPointcut() {
//    }
//
//    @Before("LoggingAnnotationPointcut()")
//    public void beforeDeleteMappingAnnotation(JoinPoint joinPoint) {
//        logger.info("Before --> Method : {}, Arguments : {}, Target: {}", joinPoint.getSignature(), joinPoint.getArgs(), joinPoint.getTarget());
//    }




    //       @AFTERRETURNING
//    @Pointcut("@annotation(org.springframework.web.bind.annotation.GetMapping)")
//    public void afterReturningGetMappingAnnotation(){}



    // bu tum get methodlari icin gecerlidir
//    @AfterReturning(pointcut = "afterReturningGetMappingAnnotation()",returning = "result")
//    public void afterReturningGetMappingAnnotation(JoinPoint joinPoint,Object result){
//        logger.info("After Returning  --> Method : {}, Result: {}", joinPoint.getSignature(),result.toString());
//    }



    // simdi courseContoller'daki getUser() methodu icin gevcerli olan bir pointcut yazacagiz. getAllCourses() methodu icin
//    @AfterReturning(pointcut = "afterReturningGetMappingAnnotation()",returning = "results")
//    public void afterReturningGetMappingAnnotation(JoinPoint joinPoint, List<CourseDTO> results){
//        logger.info("After Returning  --> Method : {}, Result: {}", joinPoint.getSignature(),results.toString());
//    }




    // @AfterThrowing

//    @AfterThrowing(pointcut ="afterReturningGetMappingAnnotation()", throwing = "exception" )
//    public void afterThrowingGetMappingOperation(JoinPoint joinPoint, Exception exception){
//        logger.error("After Throwing  --> Method : {}, Exception: {}", joinPoint.getSignature().toShortString(),exception.getMessage());
//
//    }




    //   @AROUND
    // ornek icin kendi annotationumuzu kullanacagiz
    @Pointcut("@annotation(com.cydeo.annotation.LoggingAnnotation)")
    public void LoggingAnnotationPointcut() {
    }


    @Around("LoggingAnnotationPointcut()")
    public Object anyLoggingAnnotationOperation(ProceedingJoinPoint proceedingJoinPoint){

        logger.info("Before --> Method : {} - Parameter : {} ", proceedingJoinPoint.getSignature(),proceedingJoinPoint.getArgs());

        Object result = null;

        try { // this the place real method run
           result= proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }


        logger.info("After --> Method : {} - Result : {}", proceedingJoinPoint.getSignature().toShortString(),result.toString());

        return result;

    }






}
