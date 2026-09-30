package ads.seg;

public class UserService {
    private String hashAlg;
    private UserRepository repository = new InMemory();
    public UserService (UserRepository db, String hashAlg){

    }
    public boolean register (String login, String password){

        return true
    }

    public boolean updatePassword(String login, String current, String newp){
        return true
    }
    public boolean authenticate(String login, String password){
        return true
    }
} 
