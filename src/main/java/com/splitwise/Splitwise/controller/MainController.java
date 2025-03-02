package com.splitwise.Splitwise.controller;

import com.splitwise.Splitwise.common.enums.ResponseEnums;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/splitwise")
public class MainController {

    public ResponseEntity<?> welcomeScreen(){
        return ResponseEntity.ok(ResponseEnums.CREATED);
    }
}
