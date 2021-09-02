package serwisZamowien;

public class SmsInformService implements InformationService {

    @Override
    public void inform(User user) {
        System.out.println("Sms is sending.");
    }
}
