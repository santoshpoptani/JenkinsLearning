package com.docker.dockerlearning;

import com.docker.dockerlearning.entity.DemoEntity;
import com.docker.dockerlearning.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/docker")
public class DockerControler {

    private DemoService service;

    @Autowired
    public DockerControler(DemoService service) {
        this.service = service;
    }

    @PostMapping("/add")
    public ResponseEntity<DemoEntity> postData(@RequestBody DemoEntity demo){
        DemoEntity result  = service.save(demo);
        return new ResponseEntity<>(result , HttpStatus.OK);
    }

    @GetMapping("/get/{Id}")
    public ResponseEntity<DemoEntity> testMethod(@PathVariable int Id){
        Optional<DemoEntity> data = service.getData(Id);
        return new ResponseEntity<>(data.get() , HttpStatus.OK);

    }
}
