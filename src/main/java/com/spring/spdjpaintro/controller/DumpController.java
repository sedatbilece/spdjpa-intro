package com.spring.spdjpaintro.controller;


import com.spring.spdjpaintro.domain.Dump;
import com.spring.spdjpaintro.repositories.DumpRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DumpController {

    private DumpRepository dumpRepository;

    public DumpController(DumpRepository dumpRepository) {
        this.dumpRepository = dumpRepository;
    }

    @GetMapping("/getDump")
    public String getDump(){

        Dump  dump=new Dump("deneme");
       Dump temp= dumpRepository.save(dump);

       return temp.getId().toString()+ temp.getName();
    }
}
