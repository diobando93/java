package com.nivel1.nivel1.exceptions;

public class FileSaveException extends RuntimeException{
	
	public FileSaveException(String message) {
        super(message);
    }

    public FileSaveException(String message, Throwable cause) {
        super(message, cause);
    }
}
