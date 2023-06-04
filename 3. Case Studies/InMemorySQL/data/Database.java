package InMemorySQL.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Database {
    private final Map<String, Table> tables;
    private static Database INSTANCE;

    private Database() {
        this.tables = new HashMap<>();
    }

    public static Database getInstance() {
        if (INSTANCE == null)
            INSTANCE = new Database();
        return INSTANCE;
    }

    public Map<String, Table> getTables() {
        return this.tables;
    }

    public Table getTable(String tableName) {
        if (!tables.containsKey(tableName))
            throw new RuntimeException();
        return tables.get(tableName);
    }

    public Table putTable(String tableName, Table table) {
        if (tables.containsKey(tableName))
            throw new RuntimeException();
        return tables.put(tableName, table);
    }

    public Table deleteTable(String tableName) {
        if (tables.containsKey(tableName))
            throw new RuntimeException();
        return tables.remove(tableName);
    }

    public List<Table> getAllTables() {
        List<Table> tables = new ArrayList<>();
        for (Map.Entry<String, Table> entry : this.tables.entrySet()) {
            tables.add(entry.getValue());
        }
        return tables;
    }
}
