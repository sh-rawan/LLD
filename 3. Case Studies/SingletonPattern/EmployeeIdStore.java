package SingletonPattern;

import java.util.HashMap;
import java.util.Map;

public class EmployeeIdStore {
    public final Map<String, String> employees;
    private static EmployeeIdStore INSTANCE;

    private EmployeeIdStore() {
        this.employees = new HashMap<>();
        this.employees.put("101", "Shrawan");
        this.employees.put("138", "Raju");
        this.employees.put("112", "Radha");
        this.employees.put("176", "Jyoti");
    }

    public static synchronized EmployeeIdStore getInstance() {
        if (INSTANCE == null)
            INSTANCE = new EmployeeIdStore();
        return INSTANCE;
    }

    public String getName(String id) {
        if (!this.employees.containsKey(id))
            throw new IllegalArgumentException("Invalid Id");
        return this.employees.get(id);
    }
}
