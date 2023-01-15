package com.challenge.crud.libs;

import com.challenge.crud.exceptions.ExceptionBadRequest;

public class ValidationSearch {

    static public void search(String email){

        if(!ValidationEmail.validationEmail(email)) throw new ExceptionBadRequest("E-mail inválido");

    }

}
