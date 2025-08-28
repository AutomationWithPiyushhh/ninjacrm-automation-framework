package generic_utility;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo {
	public static void main(String[] args) throws SQLException {
		DataBaseUtility dbUtil = new DataBaseUtility();

		dbUtil.getDbConnection();
		ResultSet data = dbUtil.executeSelectQuery("select * from project where team_size = 8;");

		data.next();
		System.out.println(data.getString(2));
	}

}
