public interface ILogin {
    void log(User user);
}


public class LogIn implements ILogin{
    public void log (User user) {
        System.out.println("Has access to the website");
        insertUserInDatabase(user);
        // Logic
    }
    public void insertUserInDatabase(User user){
        // Insert user in database
    }
}

