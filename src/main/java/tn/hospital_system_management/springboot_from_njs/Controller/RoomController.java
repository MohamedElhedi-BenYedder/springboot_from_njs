package tn.hospital_system_management.springboot_from_njs.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.hospital_system_management.springboot_from_njs.model.Room;
import tn.hospital_system_management.springboot_from_njs.service.RoomServiceImpl;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/room")
public class RoomController {
    @Autowired
    private RoomServiceImpl roomService;
    @PostMapping()
    public Room create(@RequestBody @Valid Room room)
    {
        return roomService.create(room);
    }
    @GetMapping("/count")
    public int count()
    {
        return roomService.count();
    }
    @GetMapping("/getAll")
    public List<Room> getAll(){
        return roomService.getAll();
    }

}
