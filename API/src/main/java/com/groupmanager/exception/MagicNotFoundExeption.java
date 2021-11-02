package com.groupmanager.exception;

public class MagicNotFoundExeption extends Exception{
    public MagicNotFoundExeption(Long id){
        super("Couldn't find magic with id " + id + "!");
    }
}
