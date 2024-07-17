package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("calc1")
public class Calculator {

   @Value("21")
    int first;
    @Autowired
    @Qualifier("extreme")
    TypeCalc typecalc;

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public TypeCalc getTypecalc() {
        return typecalc;
    }

    public void setTypecalc(TypeCalc typecalc) {
        typecalc.data();
        this.typecalc = typecalc;
    }

    public Calculator()
    {
        System.out.println("Calculator class created");
    }
    void hello()
    {
        System.out.println("Hello World");
    }
}
