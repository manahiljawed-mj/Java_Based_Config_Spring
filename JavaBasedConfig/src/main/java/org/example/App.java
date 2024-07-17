package org.example;

import config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        Calculator cal=(Calculator) context.getBean("calc1");
        cal.hello();
        Calculator calc1=(Calculator) context.getBean("calc1");
        calc1.hello();
        TypeCalc cc=calc1.getTypecalc();
        cc.data();

    }
}
