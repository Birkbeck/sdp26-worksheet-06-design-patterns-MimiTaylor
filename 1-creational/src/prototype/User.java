package prototype;

public class User {

    private String userName;
    private String userLevel;
    private AccessControl accessControl;

    public User(String user, String level, AccessControl userAccessControl) {
        this.userName = user;
        this.userLevel = level;
        this.accessControl = userAccessControl;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getLevel() {
        return this.userLevel;
    }

    public AccessControl getAccessControl() {
        return this.accessControl;
    }

    public void setAccessControl(AccessControl accessControl) {
this.accessControl = accessControl;
    }

    @Override
    public String toString() {
        return ("User: " + userName) ;
    }

}