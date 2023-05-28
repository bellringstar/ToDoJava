package com.todo.todoweb.login;


import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate(String username, String password){

        boolean validUserNmae = username.equalsIgnoreCase("hyun");
        boolean validPassword = password.equalsIgnoreCase("1234");
        if(validPassword && validUserNmae){
            return true;
        }
        return false;
    }
}
