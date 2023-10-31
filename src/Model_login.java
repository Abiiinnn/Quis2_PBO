import node.Node_login;

import java.util.ArrayList;

public class Model_login {
    ArrayList<Node_login> lojin;

    public Model_login(){
        this.lojin = new ArrayList<>();
    }
    public void Insertpassword(String usernme , String password){
        int index =lojin.size();
        this.lojin.add(new Node_login(usernme,password));
    }
    public Boolean cekLogin(String username , String password){
        for (Node_login acc : lojin ){
            if (acc.getUsername().equals(username) && acc.getPassword().equals(password)){
                return true;
            }

        }
        return false;
    }
}
