package entities;
import java.time.LocalDateTime;
import java.util.Map;

public class PersonalUserFactory implements UserFactory{
    /**
     * Requires: password is valid.
     * @param name
     * @param password
     * @return
     */
    @Override
    public User create(String name, String password, Map<String, Pet> pets, String bio, LocalDateTime ltd) {
        return new PersonalUser(name, password, pets, bio, ltd);
    }

}
