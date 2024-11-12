package com.mappings.controller;

import com.mappings.entity.Bus;
import com.mappings.repository.BusRepository;
import com.mappings.service.BusService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/bus")
public class BusController {

    private BusService busService;
    private final BusRepository busRepository;


    public BusController(BusService busService,
                         BusRepository busRepository) {
        this.busService = busService;
        this.busRepository = busRepository;
    }

    @GetMapping
    public ResponseEntity<List<Bus>> getAllBus(){
        List<Bus> allBus = busService.getAllBus();
        return new ResponseEntity<>(allBus, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Bus> getBusById(@PathVariable Long id) {
        Bus busById = busService.getBusById(id);
        return new ResponseEntity<>(busById,HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Bus> createBus(@RequestBody Bus bus){
        Bus savedBus = busService.createBus(bus);
        return new ResponseEntity<>(savedBus,HttpStatus.CREATED);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteBus(@RequestParam Long id){
        busService.deleteBus(id);
        return new ResponseEntity<>("Deleted",HttpStatus.OK);
    }
}
