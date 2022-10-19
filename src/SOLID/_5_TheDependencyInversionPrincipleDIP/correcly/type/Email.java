package SOLID._5_TheDependencyInversionPrincipleDIP.correcly.type;

public class Email implements IMessenger{

    @Override
    public void send() {
        System.out.println("Отправка сообщения по Email");
    }
}

