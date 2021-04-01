package tn.hospital_system_management.springboot_from_njs.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tn.hospital_system_management.springboot_from_njs.Repository.RoomRepository;
import tn.hospital_system_management.springboot_from_njs.model.Room;

import java.util.List;

@Component
public class RoomServiceImpl implements RoomService{
    @Autowired
    RoomRepository roomRepository;

    @Override
    public Room create(Room room) {
        return roomRepository.save(room);
    }

    @Override
    public List<Room> getAll() {
        return roomRepository.findAll();
    }

    @Override
    public int count() {
        return roomRepository.findAll().size();
    }
}
