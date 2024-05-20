package com.app.demo.api.controller;

import com.app.demo.domain.common.Route;
import com.app.demo.domain.dto.PersonDTO;
import com.app.demo.domain.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = Route.API)
public class PersonController {
    @Autowired
    private PersonService personService;

    @PostMapping(value = Route.SAVE_PERSON)
    public PersonDTO save(@RequestBody PersonDTO personDTO){
       return personService.save(personDTO);
    }

    @GetMapping(value = Route.SAVE_PERSON)
    public List<PersonDTO> get(){
        return personService.getAll();
    }
}
