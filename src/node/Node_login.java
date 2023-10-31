package node;

public class Node_login {
    String Username;
    String Password;
    public Node_login(String username , String password){
        this.Username = username;
        this.Password = password;
    }

    public String getPassword() {
        return Password;
    }

    public String getUsername() {
        return Username;
    }
}
