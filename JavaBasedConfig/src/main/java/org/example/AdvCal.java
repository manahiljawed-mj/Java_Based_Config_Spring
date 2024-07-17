package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Scope("prototype")
public class AdvCal implements TypeCalc{
    public void data()
    {
        System.out.println("hello from AdvCal");
    }
}
