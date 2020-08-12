package api.controller;

class ReservaNotFoundException extends RuntimeException {

	ReservaNotFoundException(Long id) {
		super("Could not find reserva " + id);
	}
}
