package api.controller;

class SolicitudNotFoundException extends RuntimeException {

	SolicitudNotFoundException(Long id) {
		super("Could not find solicitud " + id);
	}
}
