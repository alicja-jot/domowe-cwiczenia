package trzynasty.goodPaterns;

public class SmsInformationService implements InformationService {

    @Override
    public void inform(User user) {
        System.out.println("Sms is sending.");
    }
}
