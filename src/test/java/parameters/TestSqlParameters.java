package parameters;

import org.testng.annotations.Test;
import utlities.SqlConnector;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TestSqlParameters {
    @Test
    public void testDatabaseValues() throws SQLException {
        ResultSet resultSet = SqlConnector.readData("select * from monthly_mortgage");
    }
}
