package vehicle_management;

public class DateInvalidException extends Exception {
	public DateInvalidException(String message) {
		super(message);
	}
}

class DuplicateEntry extends Exception {
	public DuplicateEntry(String message) {
		super(message);
	}
}