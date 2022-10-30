package RMI_Practice;

import java.sql.SQLException;

public class StorageService {
    public String output() throws ClassNotFoundException {
        DBReader DBReader = new DBReader();
		String result = DBReader.getItems();
		return result;
    }
}
