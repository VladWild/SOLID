package SOLID.TheDependencyInversionPrincipleDIP.wrong;

import SOLID.TheDependencyInversionPrincipleDIP.wrong.notification.Notification;

public class Main {

    public static void main(String[] args) {
        Notification notif = new Notification();
        notif.emailDistribution();

    }

}
