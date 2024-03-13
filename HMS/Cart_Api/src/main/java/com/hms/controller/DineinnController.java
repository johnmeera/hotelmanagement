package com.hms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hms.entity.Dineinn;
import com.hms.service.DineinnService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/dineinn")
public class DineinnController {
	@Autowired
    private DineinnService dineinnService;

    @PostMapping("/save")
    public ResponseEntity<Dineinn> saveDineinn(@RequestBody Dineinn dineinn) {
        Dineinn savedDineinn = dineinnService.save(dineinn);
        return new ResponseEntity<>(savedDineinn, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Dineinn>> getAllDineinn() {
        List<Dineinn> dineinnList = dineinnService.getAll();
        return new ResponseEntity<>(dineinnList, HttpStatus.OK);
    }
}
