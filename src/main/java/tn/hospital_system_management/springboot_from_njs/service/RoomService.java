package tn.hospital_system_management.springboot_from_njs.service;

import tn.hospital_system_management.springboot_from_njs.model.Room;

import java.util.List;

public interface RoomService {
    public Room create(Room room);
    public List<Room> getAll();
    public int count();
}
