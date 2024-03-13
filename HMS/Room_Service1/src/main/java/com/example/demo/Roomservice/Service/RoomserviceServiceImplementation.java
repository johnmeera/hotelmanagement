package com.example.demo.Roomservice.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Roomservice.Entity.RoomserviceEntity;
import com.example.demo.Roomservice.Repository.RoomserviceRepository;

import java.util.List;

@Service
public class RoomserviceServiceImplementation implements RoomserviceService {

    @Autowired
    private RoomserviceRepository roomserviceRepository;

    @Override
    public RoomserviceEntity addRoomService(RoomserviceEntity roomserviceEntity) {
        return roomserviceRepository.save(roomserviceEntity);
    }

    @Override
    public RoomserviceEntity getRoomServiceById(long id) {
        return roomserviceRepository.findById(id).orElse(null);
    }

    @Override
    public List<RoomserviceEntity> getAllRoomServices() {
        return roomserviceRepository.findAll();
    }

    @Override
    public RoomserviceEntity updateRoomService(long id, RoomserviceEntity roomserviceEntity) {
        roomserviceEntity.setId(id);
        return roomserviceRepository.save(roomserviceEntity);
    }

    @Override
    public void deleteRoomService(long id) {
        roomserviceRepository.deleteById(id);
    }

	@Override
	public RoomserviceEntity saveRoomservice(RoomserviceEntity roomserviceEntity) {
		return roomserviceRepository.save(roomserviceEntity);
		
	}
}
