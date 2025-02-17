package dev.sweety.EcomProductServiceDec23.exception;

import dev.sweety.EcomProductServiceDec23.controller.CartController;
import dev.sweety.EcomProductServiceDec23.dto.ExceptionResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice(basePackageClasses = CartController.class)
public class CartControllerExceptionHandler {

    @ExceptionHandler(CartNotFoundException.class)
    public ResponseEntity handleCartNotFoundException(CartNotFoundException pe){
        ExceptionResponseDTO exceptionResponseDTO = new ExceptionResponseDTO(
                pe.getMessage(),
                404
        );
        return new ResponseEntity<>(exceptionResponseDTO, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(RandomException.class)
    public ResponseEntity handleCartRandomException(RandomException pe){
        ExceptionResponseDTO exceptionResponseDTO = new ExceptionResponseDTO(
                pe.getMessage(),
                404
        );
        return new ResponseEntity<>(exceptionResponseDTO, HttpStatus.NOT_FOUND);
    }
}

// 5 mins -> 10:27 PM