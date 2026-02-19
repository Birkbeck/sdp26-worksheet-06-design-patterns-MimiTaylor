package prototype;

import java.util.HashMap;
import java.util.Map;

public class AccessControlProvider {

    private static Map<String, AccessControl> prototypes = new HashMap<>();

    static {
        prototypes.put("USER", new AccessControl("USER", "READ REPORTS"));
        prototypes.put("MANAGER", new AccessControl("MANAGER", "READ AND WRITE REPORTS"));
    }



    public static AccessControl getAccessControlObject(String controlLevel) {
if (controlLevel.equals("USER")) {
    return prototypes.get("USER").clone();
} else if (controlLevel.equals("MANAGER")) {
    return prototypes.get("MANAGER").clone();
} else throw new IllegalArgumentException("Invalid control level");
    }




}
