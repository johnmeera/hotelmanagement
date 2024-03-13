package com.hms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hms.entity.Roomservice;
import com.hms.service.RoomserviceService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/room")
public class RoomserviceController {
	
	@Autowired
	private RoomserviceService roomserviceService;
	
	@PostMapping("/save")
    public ResponseEntity<Roomservice> saveRoomservice(@RequestBody Roomservice roomservice) {
        Roomservice savedRoomservice = roomserviceService.save(roomservice);
               
                  
        return new ResponseEntity<>(savedRoomservice, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Roomservice>> getAllRooms() {
        List<Roomservice> roomserviceList = roomserviceService.getAll();
        return new ResponseEntity<>(roomserviceList, HttpStatus.OK);
    }
//    @GetMapping("/name")
//    public ResponseEntity<Roomservice> getbyname(@PathVariable String customername){
//    	Roomservice getbyname = roomserviceService.getbyname(customername);
//    	return new ResponseEntity<>(getbyname,HttpStatus.OK);
//    }
//    @GetMapping("/{customername}") // Adjust the path here
//    public ResponseEntity<Roomservice> getByName(@PathVariable String customername) {
//        Roomservice getByName = roomserviceService.getByName(customername); // Adjust method name here
//        return new ResponseEntity<>(getByName, HttpStatus.OK);
//    }
}
