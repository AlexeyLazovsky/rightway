package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before ("@addition_test")
    public void beforeHook(){
        System.out.println("This hook will run before the scenario");
    }

    @After("@addition_test")
    public void afterHook(){
        System.out.println("This hook will run after the scenario");

    }


}
