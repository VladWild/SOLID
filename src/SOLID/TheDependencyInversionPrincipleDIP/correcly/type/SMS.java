package SOLID.TheDependencyInversionPrincipleDIP.correcly.type;

public class SMS implements IMessenger{

    @Override
    public void send() {
        System.out.println("Отправка сообщения по SMS");
    }
}
