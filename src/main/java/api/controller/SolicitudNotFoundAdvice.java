package api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
class SolicitudNotFoundAdvice {

	@ResponseBody
	@ExceptionHandler(SolicitudNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String solicitudNotFoundHandler(SolicitudNotFoundException ex) {
		return ex.getMessage();
	}
}
