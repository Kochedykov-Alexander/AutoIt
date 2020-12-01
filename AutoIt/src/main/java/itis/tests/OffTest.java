package itis.tests;

import org.junit.Assert;
import org.junit.Test;

public class OffTest extends TestBase {

    @Test
    public void offTest() {
        app.getHamachi().pressButton();
        String text = app.getHamachi().getText();
        Assert.assertEquals("не в сети", text);
    }
}
