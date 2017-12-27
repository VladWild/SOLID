package SOLID.TheDependencyInversionPrincipleDIP.wrong.notification;

import SOLID.TheDependencyInversionPrincipleDIP.wrong.type.Email;

public class Notification {
    private Email email;

    public Notification() {
        this.email = new Email();
    }

    public void emailDistribution(){
        email.send();
    }


}
