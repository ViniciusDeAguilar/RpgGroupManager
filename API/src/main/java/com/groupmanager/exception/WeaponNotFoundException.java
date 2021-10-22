package com.groupmanager.exception;

public class WeaponNotFoundException extends Exception{
    public WeaponNotFoundException(Long id){
        super("Couldn't find weapon with id " + id + "!");
    }
}
