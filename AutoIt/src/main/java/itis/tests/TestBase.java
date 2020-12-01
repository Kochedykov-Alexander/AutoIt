package itis.tests;


import itis.ApplicationManager;
import org.junit.Before;

public class TestBase {

    static ApplicationManager app;

    @Before
    public void setUp()  {
        app = ApplicationManager.getInstance();
    }
}
