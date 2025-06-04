package HashMapManualNullValue;

import java.util.HashMap;

public class registerSightingCounter {
    private HashMap<String, Integer> allSightings;

    public registerSightingCounter() {
        this.allSightings = new HashMap<>();
    }

    public void addSighting(String sighted) {
        int timesSighted = this.allSightings.getOrDefault(sighted, 0);
        timesSighted++;
        this.allSightings.put(sighted, timesSighted);
    }

    // 'getOrDefault' searches for the first parameter. If the value is not found (null), returns the second parmeter as the value
    public int timesSighted(String sighted) {
        return this.allSightings.getOrDefault(sighted, 0);
    }

    // The 'getOrDafault' one liner above is equivalent to this
    // public int timesSighted(String sighted) {
    //     if (this.allSightings.containsKey(sighted)) {
    //         return this.allSightings.get(sighted);
    //     }

    //     return 0;
    // }
}
