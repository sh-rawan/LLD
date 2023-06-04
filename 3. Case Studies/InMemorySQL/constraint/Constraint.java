package InMemorySQL.constraint;

import InMemorySQL.data.Row;

public interface Constraint {
    void applyOnInsertRow(Row rowToBeInserted);

    void applyOnUpdateRow(Row rowToBeUpdated);

    void applyOnDeleteRow(Row rowToBeDeleted);
}
