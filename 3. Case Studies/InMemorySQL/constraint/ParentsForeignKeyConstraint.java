package InMemorySQL.constraint;

import java.util.List;

import InMemorySQL.data.Row;
import InMemorySQL.data.Table;

public class ParentsForeignKeyConstraint implements Constraint {
    private final Table parentTable;
    private final List<ColumnMapping> columnMapping;

    public ParentsForeignKeyConstraint(Table parentTable, List<ColumnMapping> columnMapping) {
        this.parentTable = parentTable;
        this.columnMapping = columnMapping;
    }

    @Override
    public void applyOnDeleteRow(Row rowToBeDeleted) {
    }

    @Override
    public void applyOnInsertRow(Row rowToBeInserted) {
        for (Row row : parentTable.getRows()) {
            boolean allMatch = true;
            for (ColumnMapping columnMapping2 : columnMapping) {
                // if(row.get(columnMapping2.getForeignTableColumn()) != rowToBeInserted.)
                /// some logic to cross check
            }
        }
    }

    @Override
    public void applyOnUpdateRow(Row rowToBeUpdated) {
    }

}
