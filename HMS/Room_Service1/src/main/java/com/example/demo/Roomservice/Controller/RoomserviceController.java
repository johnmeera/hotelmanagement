package com.example.demo.Roomservice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Roomservice.Entity.RoomserviceEntity;
import com.example.demo.Roomservice.Service.RoomserviceService;

import java.util.List;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/roomservices")
public class RoomserviceController {

    @Autowired
    private RoomserviceService roomserviceService;

    @PostMapping("/create")
    public ResponseEntity<RoomserviceEntity> addRoomService(@RequestBody RoomserviceEntity roomserviceEntity) {
        RoomserviceEntity savedRoomService = roomserviceService.addRoomService(roomserviceEntity);
        return new ResponseEntity<>(savedRoomService, HttpStatus.CREATED);
    }
    
    
    @GetMapping("/{id}")
    public ResponseEntity<RoomserviceEntity> getRoomServiceById(@PathVariable long id) {
        RoomserviceEntity roomserviceEntity = roomserviceService.getRoomServiceById(id);
        if (roomserviceEntity != null) {
            return new ResponseEntity<>(roomserviceEntity, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/ALL")
    public ResponseEntity<List<RoomserviceEntity>> getAllRoomServices() {
        List<RoomserviceEntity> roomServices = roomserviceService.getAllRoomServices();
        return new ResponseEntity<>(roomServices, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<RoomserviceEntity> updateRoomService(@PathVariable long id,
                                                               @RequestBody RoomserviceEntity roomserviceEntity) {
        RoomserviceEntity updatedRoomService = roomserviceService.updateRoomService(id, roomserviceEntity);
        return new ResponseEntity<>(updatedRoomService, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRoomService(@PathVariable long id) {
        roomserviceService.deleteRoomService(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
