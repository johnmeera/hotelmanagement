package com.example.demo.controller;

import com.example.demo.entity.roomsEntity;
import com.example.demo.service.roomsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api-v1")
@CrossOrigin(origins = "http://localhost:3000/")
public class roomsController {

    @Autowired
    private roomsService roomsService;

    @GetMapping
    public List<roomsEntity> getAllRooms() {
        return roomsService.getAllRooms();
    }

    @GetMapping("/{roomId}")
    public roomsEntity getRoomById(@PathVariable long roomId) {
        return roomsService.getRoomById(roomId);
    }

    @PostMapping("/create")
    public roomsEntity saveRoom(@RequestBody roomsEntity room) {
        return roomsService.saveRoom(room);
    }

    @DeleteMapping("/{roomId}")
    public void deleteRoom(@PathVariable long roomId) {
        roomsService.deleteRoom(roomId);
    }
//    @PutMapping("/update/{roomId}")
//    public roomsEntity updateRoom(@PathVariable long roomId, @RequestBody roomsEntity updatedRoom) {
//        // Retrieve the existing room
//        roomsEntity existingRoom = roomsService.getRoomById(roomId);
//
//        if (existingRoom != null) {
//            // Update the existing room with the new data
//            existingRoom.setPropertyName(updatedRoom.getPropertyName());
//            existingRoom.setRoom_type(updatedRoom.getRoom_type());
//            // Update other fields as needed
//
//            // Save the updated room
//            return roomsService.saveRoom(existingRoom);
//        } else {
//            // Handle the case where the room with the given ID is not found
//            // You might want to throw an exception or return an appropriate response
//            return null; // or throw new RoomNotFoundException("Room with ID " + roomId + " not found");
//        }
//    }
//    @PutMapping("/put")
//	public ResponseEntity <roomsEntity> updateEmp(@RequestBody roomsEntity employee) {
//		return new ResponseEntity<roomsEntity> (roomsService.update(employee), HttpStatus.OK);
//		
//	}
    @PutMapping("/update/{roomId}")
    public roomsEntity updateRoom(@PathVariable long roomId, @RequestBody roomsEntity updatedRoom) {
        // Retrieve the existing room
        roomsEntity existingRoom = roomsService.getRoomById(roomId);

        if (existingRoom != null) {
            // Update the existing room with the new data
            existingRoom.setRoom_type(updatedRoom.getRoom_type());
            existingRoom.setRoom_features(updatedRoom.getRoom_features());
            existingRoom.setCtc_price(updatedRoom.getCtc_price());
            existingRoom.setGst(updatedRoom.getGst());
            existingRoom.setDiscount(updatedRoom.getDiscount());
            existingRoom.setNet_total(updatedRoom.getNet_total());
            existingRoom.setAddons(updatedRoom.getAddons());
            // Update other fields as needed

            // Save the updated room
            return roomsService.saveRoom(existingRoom);
        } else {
            // Handle the case where the room with the given ID is not found
            // You might want to throw an exception or return an appropriate response
            return null; // or throw new RoomNotFoundException("Room with ID " + roomId + " not found");
        }
    }


}
