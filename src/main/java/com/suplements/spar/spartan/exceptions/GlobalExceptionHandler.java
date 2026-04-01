package com.suplements.spar.spartan.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> handleValidation(MethodArgumentNotValidException ex){
        Map<String, String> erros = new HashMap<>();
        ex.getBindingResult().getFieldErrors().forEach(error ->
                erros.put(error.getField(), error.getDefaultMessage()));
        return ResponseEntity.badRequest().body(erros);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleGeneralException(Exception ex){
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("internal server error: " + ex.getMessage());
    }

    @ExceptionHandler(ProdutoNotFoundException.class)
    public ResponseEntity<String> productNotFound(ProdutoNotFoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body("There was an error because there is no product with this ID");
    }

    @ExceptionHandler(CupomNotFoundException.class)
    public ResponseEntity<String> couponNotFound(CupomNotFoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body("There was an error because there is no coupon with this ID");
    }

    @ExceptionHandler(UsuarioNotFoundException.class)
    public ResponseEntity<String> userNotFound(UsuarioNotFoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body("There was an error because there is no user with this ID");
    }

    @ExceptionHandler(CarrinhoNotFound.class)
    public ResponseEntity<String> cartNotFound(CarrinhoNotFound ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body("There was an error because there is no cart with this ID");
    }

}