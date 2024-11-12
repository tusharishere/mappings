package com.mappings.controller;

import com.mappings.entity.Bus;
import com.mappings.entity.BusStop;
import com.mappings.entity.Stop;

import com.mappings.service.RootService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/rootController")
public class RootController {

    private RootService rootService;

    public RootController(RootService rootService) {
        this.rootService = rootService;
    }

    @PostMapping
    public ResponseEntity<String> addRoute(@RequestParam long busId,
                                           @RequestParam long stopId,
                                           @RequestParam long orderId){

        rootService.addRoute(busId,stopId,orderId);
        return new ResponseEntity<>("Route added successfully.", HttpStatus.CREATED);

    }

}
