import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class EmployeeSearch {
    private EmployeeSearch() {
    }

    /**
     * Returns first and last names for matching employees. Empty selections
     * skip their filters. The caller manages the supplied connection.
     */
    public static List<String> search(
            Connection connection,
            List<Integer> departmentIds,
            List<Integer> projectIds,
            boolean notDepartment,
            boolean notProject) throws SQLException {
        StringBuilder sql = new StringBuilder(
                "SELECT e.Fname, e.Lname FROM EMPLOYEE e WHERE 1 = 1");

        if (!departmentIds.isEmpty()) {
            if (notDepartment) {
                sql.append(" AND (e.Dno IS NULL OR e.Dno NOT IN (");
            } else {
                sql.append(" AND e.Dno IN (");
            }
            sql.append(String.join(", ", Collections.nCopies(departmentIds.size(), "?")));
            sql.append(notDepartment ? "))" : ")");
        }

        if (!projectIds.isEmpty()) {
            sql.append(notProject ? " AND NOT EXISTS (" : " AND EXISTS (");
            sql.append("SELECT 1 FROM WORKS_ON w WHERE w.Essn = e.Ssn AND w.Pno IN (");
            sql.append(String.join(", ", Collections.nCopies(projectIds.size(), "?")));
            sql.append("))");
        }

        sql.append(" ORDER BY e.Lname, e.Fname, e.Ssn");

        List<String> names = new ArrayList<>();
        try (PreparedStatement statement = connection.prepareStatement(sql.toString())) {
            int parameter = 1;
            for (int id : departmentIds) {
                statement.setInt(parameter++, id);
            }
            for (int id : projectIds) {
                statement.setInt(parameter++, id);
            }

            try (ResultSet results = statement.executeQuery()) {
                while (results.next()) {
                    names.add(results.getString("Fname") + " " + results.getString("Lname"));
                }
            }
        }
        return names;
    }
}
