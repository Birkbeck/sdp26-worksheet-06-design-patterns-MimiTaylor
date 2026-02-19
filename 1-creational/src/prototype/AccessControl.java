package prototype;

public class AccessControl implements AccessControlPrototype {
    @Override
    public AccessControl clone() {
        return null; //AccessControl x = (AccessControl) super.clone();
    }

    public void setAccess(String access) {
    }
}
