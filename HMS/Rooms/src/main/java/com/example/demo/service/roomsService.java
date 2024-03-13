package com.example.demo.service;

import com.example.demo.entity.roomsEntity;

import java.util.List;

public interface roomsService {
    List<roomsEntity> getAllRooms();

    roomsEntity getRoomById(long roomId);

    roomsEntity saveRoom(roomsEntity room);

    void deleteRoom(long roomId);

	roomsEntity update(roomsEntity employee);
}
