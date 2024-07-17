package config;

import org.example.AdvCal;
import org.example.Calculator;
import org.example.ExtremeAdvCal;
import org.example.TypeCalc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.example")
public class AppConfig {


//    @Bean(name = {"calc","calc1"})
//    @Scope("prototype")
//    public Calculator getCalculator(@Qualifier("extreme") TypeCalc calc)
//    {
//        Calculator calculator = new Calculator();
//        calculator.setTypecalc(calc);
//        return calculator;
//    }
//
//    @Bean()
//    @Primary
//    public AdvCal getAdvCal()
//    {
//        AdvCal advCal = new AdvCal();
//        return advCal;
//    }
//
//    @Bean(name = "extreme")
//    public ExtremeAdvCal getExtremeAdvCal()
//    {
//        ExtremeAdvCal extremeCal = new ExtremeAdvCal();
//        return extremeCal;
//    }

}
