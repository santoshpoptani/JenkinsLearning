package com.docker.dockerlearning.service;

import com.docker.dockerlearning.entity.DemoEntity;
import com.docker.dockerlearning.repository.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DemoService {
    private DemoRepository demoRepository;

    @Autowired
    public DemoService(DemoRepository demoRepository) {
        this.demoRepository = demoRepository;
    }

    public DemoEntity save(DemoEntity demo){
        demoRepository.save(demo);
        return demo;
    }

    public Optional<DemoEntity> getData(int id){
        Optional<DemoEntity> demo = demoRepository.findById(id);
        return demo;
    }
}
