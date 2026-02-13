
public class Cliente {

    private String rs;
    private String RFC;
    private String email;

    public Cliente(String rs, String RFC, String email) {
        this.rs = rs;
        this.RFC = RFC;
        this.email = email;
    }

    @Override
    public String toString() {
        return "RS =  " + this.rs + "\n"
                + "RFC =  " + this.RFC + "\n"
                + "Email =  " + this.email + "\n";
    }
}
