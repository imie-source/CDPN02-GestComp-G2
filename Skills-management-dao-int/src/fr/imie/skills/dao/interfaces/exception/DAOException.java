package fr.imie.skills.dao.interfaces.exception;

@SuppressWarnings("serial")
public class DAOException extends RuntimeException {
	
	public DAOException(String message) {
		super(message);
	}

	public DAOException(Throwable e) {
		super(e);
	}
	
}
