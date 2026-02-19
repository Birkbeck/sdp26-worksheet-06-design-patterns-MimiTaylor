package prototype;

import java.util.HashMap;
import java.util.Map;

public class AccessControl implements AccessControlPrototype {

    private String access;
    private String controlLevel;


    AccessControl(String access, String controlLevel) {
        this.access = access;
        this.controlLevel = controlLevel;
    }

    @Override
    public AccessControl clone() {
        AccessControl accessControl = null;
        try {
            accessControl = (AccessControl) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return accessControl; //AccessControl x = (AccessControl) super.clone();
    }

    public void setAccess(String access) {
        this.access = access;
    }

    public String getAccess() {
        return access;
    }

    public void setControlLevel(String controlLevel) {
        this.controlLevel = controlLevel;
    }
    public String getControlLevel() {
        return controlLevel;
    }
}
