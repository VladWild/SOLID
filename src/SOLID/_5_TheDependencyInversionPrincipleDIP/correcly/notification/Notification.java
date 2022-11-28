package SOLID._5_TheDependencyInversionPrincipleDIP.correcly.notification;

import SOLID._5_TheDependencyInversionPrincipleDIP.correcly.type.IMessenger;

public class Notification {
    private IMessenger messenger;

    public Notification(IMessenger messenger) {
        this.messenger = messenger;
    }

    public void distribution() {
        messenger.send();
    }
}
