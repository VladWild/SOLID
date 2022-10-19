package SOLID._5_TheDependencyInversionPrincipleDIP.correcly.notification;

import SOLID._5_TheDependencyInversionPrincipleDIP.correcly.type.IMessenger;

public class Notification {
    private IMessenger _messenger;

    public Notification(IMessenger mess) {
        _messenger = mess;
    }

    public void distribution(){
        _messenger.send();
    }

}
