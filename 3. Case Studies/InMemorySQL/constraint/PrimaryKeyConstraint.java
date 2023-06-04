package InMemorySQL.constraint;

import java.util.Set;

import InMemorySQL.data.Column;
import InMemorySQL.data.Row;
import InMemorySQL.data.Table;

public class PrimaryKeyConstraint implements Constraint {
    private final Table table;
    private final Set<Column> primary;

    @Override
    public void applyOnInsertRow(Row rowToBeInserted) {
        for (Row row : table.getRows()) {
            boolean allMatch = true;
            for (Column column : primary) {
                if (row.get(column).equals(rowToBeInserted.get(column)))
                    allMatch = true;
            }
            if (allMatch)
                throw new RuntimeException();
        }
    }

    public PrimaryKeyConstraint(Table table, Set<Column> primary) {
        this.table = table;
        this.primary = primary;
    }

    @Override
    public void applyOnUpdateRow(Row rowToBeUpdated) {
        // need action
    }

    @Override
    public void applyOnDeleteRow(Row rowToBeDeleted) {
        // no action
    }

}
