/* 
 * Copyright
 * 
 */
package io.mosip.preregistration.documents.exception;

import io.mosip.kernel.core.exception.BaseUncheckedException;
import io.mosip.preregistration.documents.errorcodes.ErrorCodes;

/**
 * This class defines the ConnectionUnavailableException that occurs when the
 * connection is unavailable.
 * 
 * @author Rajath KR
 * @since 1.0.0
 * 
 */
public class ConnectionUnavailableException extends BaseUncheckedException {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor
	 */
	public ConnectionUnavailableException() {
		super();
	}

	/**
	 * @param message
	 */
	public ConnectionUnavailableException(String message) {
		super(ErrorCodes.PRG_PAM_DOC_017.toString(), message);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public ConnectionUnavailableException(String message, Throwable cause) {
		super(ErrorCodes.PRG_PAM_DOC_017.toString(), message, cause);

	}

	/**
	 * @param errorCode
	 * @param message
	 * @param cause
	 */
	public ConnectionUnavailableException(String errorCode, String message, Throwable cause) {
		super(errorCode, message, cause);
	}

	/**
	 * @param errorCode
	 * @param message
	 */
	public ConnectionUnavailableException(String errorCode, String message) {
		super(errorCode, message);
	}
}
