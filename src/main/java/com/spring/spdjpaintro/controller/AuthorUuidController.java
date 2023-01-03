package com.spring.spdjpaintro.controller;


import com.spring.spdjpaintro.domain.AuthorUuid;
import com.spring.spdjpaintro.repositories.AuthorUuidRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorUuidController {

    private AuthorUuidRepository authorUuidRepository;
    public AuthorUuidController( AuthorUuidRepository authorUuidRepository){
        this.authorUuidRepository=authorUuidRepository;
    }


    @GetMapping("/getUUID")
    public String GetTest(){
        AuthorUuid auth = new AuthorUuid("sedat","bilece");
        authorUuidRepository.save(auth);
        return auth.getId().toString();
    }
}
