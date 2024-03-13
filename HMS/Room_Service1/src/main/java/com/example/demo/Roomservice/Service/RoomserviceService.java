package com.example.demo.Roomservice.Service;

import java.util.List;

import com.example.demo.Roomservice.Entity.RoomserviceEntity;

public interface RoomserviceService {
	
    RoomserviceEntity addRoomService(RoomserviceEntity roomserviceEntity);
    
    RoomserviceEntity getRoomServiceById(long id);
    
    List<RoomserviceEntity> getAllRoomServices();
    
    RoomserviceEntity updateRoomService(long id, RoomserviceEntity roomserviceEntity);
    
    void deleteRoomService(long id);
	
    RoomserviceEntity saveRoomservice(RoomserviceEntity roomserviceEntity);
}
