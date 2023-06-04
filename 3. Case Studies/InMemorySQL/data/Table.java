package InMemorySQL.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import InMemorySQL.constraint.Constraint;

public class Table {
    private final Set<Column> columns;
    private final String name;
    private final List<Row> rows;
    private final List<Constraint> constraints;

    public Table(Set<Column> columns, String name) {
        this.columns = columns;
        this.name = name;
        this.rows = new ArrayList<>();
        this.constraints = new ArrayList<>();
    }

    public Set<Column> getColumns() {
        return columns;
    }

    public String getName() {
        return name;
    }

    public List<Row> getRows() {
        return rows;
    }

    public void addCoulum(String columnName, String colDescription) {
    }

    public void deleteColumn(String colName) {
    }

    public void addRow(Row row) {
        for (Constraint constraint : constraints) {
            constraint.applyOnInsertRow(row);
        }
        this.rows.add(row);
    }

    public void deleteRow(Row row) {
        if (!this.rows.contains(row))
            throw new RuntimeException("Row does not exist.");
        for (Constraint constraint : constraints) {
            constraint.applyOnDeleteRow(row);
        }
        this.rows.remove(row);
    }
}
