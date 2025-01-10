public class User {
    protected String userId;
    protected String password;
    protected String name;
    protected String email;

    public boolean authenticate(String username, String password) {
        return false;
    }
    public String register(String userId, String password, String name, String email) {
        return "good job";
    }
}
