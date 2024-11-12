package com.mappings.service;
import com.mappings.entity.Bus;
import com.mappings.repository.BusRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BusService {

    private BusRepository busRepository;

    public BusService(BusRepository busRepository) {
        this.busRepository = busRepository;
    }


    public List<Bus> getAllBus() {
        List<Bus> allBus = busRepository.findAll();
        return allBus;
    }

    public Bus createBus(Bus bus) {
        Bus savedBus = busRepository.save(bus);
        return savedBus;
    }

    public void deleteBus(Long id) {
        busRepository.deleteById(id);
    }

    public Bus getBusById(Long id) {
        Bus byId = busRepository.findById(id).get();
        return byId;
    }
}
