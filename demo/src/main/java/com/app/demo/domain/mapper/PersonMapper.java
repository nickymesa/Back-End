package com.app.demo.domain.mapper;

import com.app.demo.domain.dto.PersonDTO;
import com.app.demo.persistence.entity.Person;

import java.util.Random;

public class PersonMapper {

   public static Person toEntinty(PersonDTO personDTO){
        Person person = new Person();
        person.setDni(personDTO.getDni());
        person.setName(personDTO.getName());
        person.setId(new Random().nextLong());
        return person;
    }

    public static PersonDTO toDto(Person person){
        PersonDTO personDTO = new PersonDTO();
        personDTO.setDni(person.getDni());
        personDTO.setName(person.getName());
        return personDTO;
    }
}
