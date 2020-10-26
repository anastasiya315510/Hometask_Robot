package epam;

import epam.Announcer;

import java.rmi.dgc.DGC;

public class IRobot {

    private Announcer announcer = new AnnouncerImpl();
    private Clean clean = new CleanImpl();

    public void cleanRoom(){
        announcer.announce("I'm cleanimg");
        clean.clean();
        announcer.announce("The room is clean!");
    }
}
