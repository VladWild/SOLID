package SOLID._5_TheDependencyInversionPrincipleDIP.correcly;

import SOLID._5_TheDependencyInversionPrincipleDIP.correcly.notification.Notification;
import SOLID._5_TheDependencyInversionPrincipleDIP.correcly.type.Email;
import SOLID._5_TheDependencyInversionPrincipleDIP.correcly.type.SMS;

public class Main {

    public static void main(String[] args) {
        new Notification(new Email()).distribution();
        new Notification(new SMS()).distribution();
    }
}
