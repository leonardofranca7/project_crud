package com.project.exception;

public class ProdutoNaoEncontradoException extends RuntimeException{
    public ProdutoNaoEncontradoException(String mensagem){
        super(mensagem);
    }

}
