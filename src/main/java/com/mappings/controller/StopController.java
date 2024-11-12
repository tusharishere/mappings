package com.mappings.controller;

import com.mappings.entity.Stop;
import com.mappings.service.StopService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/stop")
public class StopController {

    private StopService stopService;


    public StopController(StopService stopService) {
        this.stopService = stopService;
    }

    @PostMapping
    public ResponseEntity<Stop> createStop(@RequestBody Stop stop) {
        Stop saved = stopService.creatStop(stop);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Stop>> getAllStops() {
        List<Stop> allStops = stopService.getAllStops();
        return new ResponseEntity<>(allStops,HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Stop> getStopById(@PathVariable Long id) {
        Stop stopById = stopService.getStopById(id);
        return new ResponseEntity<>(stopById,HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStop(@PathVariable Long id) {
        stopService.deleteStop(id);
        return new ResponseEntity<>("Deleted Stop",HttpStatus.OK);
    }
}
