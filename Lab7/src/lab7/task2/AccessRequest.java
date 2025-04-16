package lab7.task2;

public class AccessRequest {
    private String username;
    private String password;
    private String role;
    private String permission;
    private boolean authenticated;
    private String message;

    public AccessRequest(String username, String password, String role, String permission) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.permission = permission;
    }

    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getRole() { return role; }
    public String getPermission() { return permission; }
    public boolean isAuthenticated() { return authenticated; }
    public void setAuthenticated(boolean authenticated) { this.authenticated = authenticated; }
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
}