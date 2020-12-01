package itis.helpers;

import autoitx4java.AutoItX;
import itis.ApplicationManager;

public class LogMeInHamachiHelper extends HelperBase {


    public LogMeInHamachiHelper(ApplicationManager app) {
        super(app);
    }

    public void pressButton() {
        AutoItX x = app.getX();
        x.controlClick("LogMeIn Hamachi","","Button1");
        x.sleep(5000);
    }

    public String getText(){
        AutoItX x = app.getX();
        String text = x.controlGetText ( "LogMeIn Hamachi", "", "Static2" );
        return text;
    }
}
