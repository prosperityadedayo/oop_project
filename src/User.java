public abstract class User implements Authenticatable{
    private String email;
    private String password;

    @Override
    public boolean authenticate(/* you can pass String email, String password as parameters if you want */) {
        return false;

    }
    @Override
    public String otp() {
        return "";
    }

    @Override
    public String password() {
        return "";
    }

    @Override
    public String passkey() {
        return "";
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    abstract String getPermissions();
}
