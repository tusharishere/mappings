package com.mappings.service;

import com.mappings.entity.Bus;
import com.mappings.entity.BusStop;
import com.mappings.entity.Stop;
import com.mappings.repository.BusRepository;
import com.mappings.repository.BusStopRepository;
import com.mappings.repository.StopRepository;
import org.springframework.stereotype.Service;

@Service
public class RootService {

    private BusRepository busRepository;
    private StopRepository stopRepository;
    private BusStopRepository busStopRepository;

    public RootService(BusRepository busRepository, StopRepository stopRepository, BusStopRepository busStopRepository) {
        this.busRepository = busRepository;
        this.stopRepository = stopRepository;
        this.busStopRepository = busStopRepository;
    }


    public String addRoute(long busId, long stopId, long orderId) {
        Bus bus = busRepository.findById(busId).get();
        Stop stop = stopRepository.findById(stopId).get();
        BusStop busStop = new BusStop();
        busStop.setBus(bus);
        busStop.setStop(stop);
        busStop.setOrderId(orderId);
        busStopRepository.save(busStop);
        return "added";
    }
}
