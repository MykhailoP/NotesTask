package com.proxy.task.notes.mvc.controllers;

import com.proxy.task.notes.entities.Note;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

import static org.springframework.http.MediaType.*;

@RestController
@RequestMapping(path = "/proxy", produces = APPLICATION_JSON_VALUE)
public class NotesController {

    @PostMapping("/notes")
    public Note notes(@RequestBody Note newNote){
        return newNote; //todo:: repository.save(newNote);
    }

    @DeleteMapping("/notes/{id}")
    public void deleteNote(@PathVariable Integer id){
        //todo:: repository.deleteById();
    }

    @GetMapping("/notes/")
    public List<Note> all(){
        return Collections.emptyList();//todo:: repository.findAll();
    }

    @GetMapping("/notes/{id}")
    public Note one(@PathVariable Integer id){
        return null; //todo:: repository.findById
    }

    @PutMapping("/notes/")
    public Note replaceNote(@RequestBody Note note, @PathVariable Integer id){
        return note; //todo:: update logic

    }




}
