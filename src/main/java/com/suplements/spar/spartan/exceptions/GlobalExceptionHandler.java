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


    @ExceptionHandler({ProdutoNotFoundException.class, CupomNotFoundException.class, UsuarioNotFoundException.class})
    public ResponseEntity<String> handleNotFound (RuntimeException ex){

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> handleValidation(MethodArgumentNotValidException ex){
        Map<String, String> erros = new HashMap<>();
        ex.getBindingResult().getFieldErrors().forEach(error ->
                erros.put(error.getField(), error.getDefaultMessage()));
        return ResponseEntity.badRequest().body(erros);
    }



    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleGeneralException(Exception ex){
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro interno no servidor: " + ex.getMessage());
    }

    @ExceptionHandler(ProdutoNotFoundException.class)
    public ResponseEntity<String> handleNotFound(ProdutoNotFoundException produtoNotFoundException){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Não existe um produto com este id");
    }



}
