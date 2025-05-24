package com.docker.dockerlearning.repository;

import com.docker.dockerlearning.entity.DemoEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemoRepository extends JpaRepository<DemoEntity , Integer> {
}
