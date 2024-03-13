package com.example.demo.service;

import com.example.demo.entity.roomsEntity;
import com.example.demo.repo.roomsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class roomsServiceImplementation implements roomsService {

    @Autowired
    private roomsRepo roomsRepository;

    @Override
    public List<roomsEntity> getAllRooms() {
        return roomsRepository.findAll();
    }

    @Override
    public roomsEntity getRoomById(long roomId) {
        Optional<roomsEntity> optionalRoom = roomsRepository.findById(roomId);
        return optionalRoom.orElse(null);
    }

    @Override
    public roomsEntity saveRoom(roomsEntity room) {
        return roomsRepository.save(room);
    }

    @Override
    public void deleteRoom(long roomId) {
        roomsRepository.deleteById(roomId);
    }

	@Override
	public roomsEntity update(roomsEntity employee) {
		// TODO Auto-generated method stub
		return null;
	}
}
