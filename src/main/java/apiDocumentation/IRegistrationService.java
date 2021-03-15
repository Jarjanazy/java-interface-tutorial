package apiDocumentation;

public interface IRegistrationService {
    void registerNewUser(String userName);
    boolean userIsRegistered(String userName);
    void cancelRegistration(int registrationId);
    void cancelRegistration(String userName);
}
