package SOLID._5_TheDependencyInversionPrincipleDIP.wrong;

import SOLID._5_TheDependencyInversionPrincipleDIP.wrong.notification.Notification;

public class Main {

    public static void main(String[] args) {
        Notification notif = new Notification();
        notif.emailDistribution();
    }
}
