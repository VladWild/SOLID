package SOLID.TheDependencyInversionPrincipleDIP.correcly.notification;

import SOLID.TheDependencyInversionPrincipleDIP.correcly.type.IMessenger;

public class Notification {
    private IMessenger _messenger;

    public Notification(IMessenger mess) {
        _messenger = mess;
    }

    public void distribution(){
        _messenger.send();
    }

}
