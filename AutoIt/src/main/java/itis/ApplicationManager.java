package itis;

import autoitx4java.AutoItX;
import itis.helpers.LogMeInHamachiHelper;


public class ApplicationManager {
    private static AutoItX autoItX;
    private LogMeInHamachiHelper hamachi;

    private ApplicationManager(){
        autoItX = new AutoItX();
        autoItX.run("C:\\Program Files (x86)\\LogMeIn Hamachi\\hamachi-2-ui.exe");
        autoItX.winWaitActive("LogMeIn Hamachi");
        hamachi = new LogMeInHamachiHelper(this);
    }

    public LogMeInHamachiHelper getHamachi() {
        return hamachi;
    }

    public static AutoItX getX() {
        return autoItX;
    }

    public static ApplicationManager getInstance() {
        ApplicationManager newInstance = new ApplicationManager();
        return newInstance;
    }

}