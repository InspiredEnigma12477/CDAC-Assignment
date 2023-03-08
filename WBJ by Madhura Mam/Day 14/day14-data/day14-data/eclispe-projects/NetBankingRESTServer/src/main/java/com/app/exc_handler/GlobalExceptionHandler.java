package com.app.exc_handler;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.app.custom_exception.ResourceNotFoundException;
import com.app.custom_exception.UserHandlingException;
import com.app.dto.ErrorResponse;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
	// how to handle validation failures ? : can override existing method.
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		StringBuilder sb = new StringBuilder("Validation err messages :");
		ex.getBindingResult().getFieldErrors().forEach(err -> sb.append(err.getDefaultMessage() + " "));
		return ResponseEntity.status(HttpStatus.BAD_REQUEST)
				.body(new ErrorResponse("Validations Failed ", sb.toString()));

	}

	// how to handle custom exception : eg : UserHandlingException : by adding our
	// own method , annotated with @ExcHandler
	@ExceptionHandler(UserHandlingException.class)
	public ResponseEntity<?> handleUserHandlingException(UserHandlingException e) {
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
				.body(new ErrorResponse("User Handling Error ", e.getMessage()));
	}
	
	//handle res not found exc
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<?> handleResourceNotFoundException(ResourceNotFoundException e) {
		return ResponseEntity.status(HttpStatus.NOT_FOUND)
				.body(new ErrorResponse("Invalid a/c no ", e.getMessage()));
	}
	//catch all 
	@ExceptionHandler(RuntimeException.class)
	public ResponseEntity<?> handleRuntimeException(RuntimeException e) {
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
				.body(new ErrorResponse("Server side Error ", e.getMessage()));
	}

}
