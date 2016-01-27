package it.register.email.integration.test.runner;


import it.register.email.integration.test.linear.TestLinearFlow;
import org.junit.runner.JUnitCore;

public class MainLauncher {
    public static void main (String[] args){
        JUnitCore.runClasses(TestLinearFlow.class);
    }
}
