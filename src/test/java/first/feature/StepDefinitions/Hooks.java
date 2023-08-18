package first.feature.StepDefinitions;

import first.feature.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks extends BaseClass {


    @Before
    public void setUp(){
        initializerDriver();

    }

    @After
    public void tearDown(){
        closeDriver();
    }

}
