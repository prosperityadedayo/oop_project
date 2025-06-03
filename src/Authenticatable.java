public interface Authenticatable {
    boolean authenticate(/* you can pass String email, String password as parameters*/);
    String otp();
    String password();
    String passkey();
}
