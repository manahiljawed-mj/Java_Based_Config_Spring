package org.example;

import org.springframework.stereotype.Component;

@Component("extreme")
public class ExtremeAdvCal implements TypeCalc {
    public void data()
    {
        System.out.println("hello from Extreme AdvCal");
    }
}
