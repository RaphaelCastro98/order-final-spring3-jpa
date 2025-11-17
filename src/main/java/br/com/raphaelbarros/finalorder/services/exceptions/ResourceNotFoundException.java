package br.com.raphaelbarros.finalorder.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(Object id) {
		super("Resorce not found. Id" + id);
	}

}
