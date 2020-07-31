package com.capg.dmeo.springjpa.errors;

public class TraineeAlreadyExistsException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6270971342792467425L;
	
	
	public TraineeAlreadyExistsException(String message) {
		super(message);
	}

}
