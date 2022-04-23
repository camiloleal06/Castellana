package org.castellana.errore;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException {

    /**
     * 
     */
    private static final long serialVersionUID = 43876691117560211L;

    public NotFoundException(String mensaje) {
        super(mensaje);
    }
}