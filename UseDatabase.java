//class UseDatabase

public class UseDatabase {
    public static void main(String[] args) {
		Database database = new Database();
		database.initialize("thisfile");
		database.save();
	}	
}
