package com.nivel1.nivel1.exceptions;

public class FileNotFoundException extends RuntimeException {
	public FileNotFoundException(String message) {
        super(message);
    }

    public FileNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
