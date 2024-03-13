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

import com.hms.entity.Takeaway;
import com.hms.service.TakeawayService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/takeaway")
public class TakeawayController {
	@Autowired
	private TakeawayService takeawayService;
	@PostMapping("/save")
    public ResponseEntity<Takeaway> saveTakeaway(@RequestBody Takeaway takeaway) {
        Takeaway savedTakeaway = takeawayService.save(takeaway);
        return new ResponseEntity<>(savedTakeaway, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Takeaway>> getAllTakeaways() {
        List<Takeaway> takeawayList = takeawayService.getAll();
        return new ResponseEntity<>(takeawayList, HttpStatus.OK);
    }
}
