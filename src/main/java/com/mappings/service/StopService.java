package com.mappings.service;

import com.mappings.entity.Stop;
import com.mappings.repository.StopRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StopService {

    private StopRepository stopRepository;

    public StopService(StopRepository stopRepository) {
        this.stopRepository = stopRepository;
    }

    public Stop creatStop(Stop stop) {
        Stop saved = stopRepository.save(stop);
        return saved;
    }

    public List<Stop> getAllStops(){
        List<Stop> all = stopRepository.findAll();
        return all;
    }

    public void deleteStop(Long id) {
    stopRepository.deleteById(id);
    }

    public Stop getStopById(Long id) {
        Stop stop = stopRepository.findById(id).get();
        return stop;
    }
}
