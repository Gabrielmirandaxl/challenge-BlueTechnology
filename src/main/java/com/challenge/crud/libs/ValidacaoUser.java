package com.challenge.crud.libs;

import com.challenge.crud.exceptions.ExceptionBadRequest;
import com.challenge.crud.model.UserModel;

public class ValidacaoUser {

    static public void  validation(UserModel userModel){
      if(userModel.getName().isEmpty()) throw new ExceptionBadRequest("Preencha o campo nome");

      if(userModel.getName() == null) throw new ExceptionBadRequest("O nome não pode ser nulo");

      if(userModel.getName().length() < 4) throw new ExceptionBadRequest("O nome não pode ter menos  que 4 caracteres");

      if(!ValidationEmail.validationEmail(userModel.getEmail())) throw new ExceptionBadRequest("Email inválido");

      if(userModel.getPhone() == null) throw new ExceptionBadRequest("O telefone não pode ser nulo");

      if(userModel.getPhone().length() < 14) throw new ExceptionBadRequest("Preencha o campo telefone corretamente");

      if(userModel.getCpf().length() < 14) throw  new ExceptionBadRequest("Preencha o campo cpf corretamente");

      if(userModel.getCpf() == null) throw new ExceptionBadRequest("O cpf não pode ser nulo");

    }

}
