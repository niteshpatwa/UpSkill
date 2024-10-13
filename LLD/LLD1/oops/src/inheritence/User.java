package inheritence;

public class User {
    protected String name;
    protected String email;
    protected String password;

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public void login(){
        System.out.println(name + " is logged in!");
    }
}
