package com.splitwise.Splitwise.groups.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/group")
public class GroupsController {
    public ResponseEntity<?> createGroup(){
        return ResponseEntity.ok().build();
    }

    @PatchMapping("/{id}")
    public ResponseEntity<?> updateGroup(@PathVariable int id){
     return ResponseEntity.status(301).build();
    }

}
