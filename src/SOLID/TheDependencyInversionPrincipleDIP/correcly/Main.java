package SOLID.TheDependencyInversionPrincipleDIP.correcly;

import SOLID.TheDependencyInversionPrincipleDIP.correcly.notification.Notification;
import SOLID.TheDependencyInversionPrincipleDIP.correcly.type.Email;
import SOLID.TheDependencyInversionPrincipleDIP.correcly.type.SMS;

public class Main {

    public static void main(String[] args) {
        new Notification(new Email()).distribution();
        new Notification(new SMS()).distribution();

    }

}
