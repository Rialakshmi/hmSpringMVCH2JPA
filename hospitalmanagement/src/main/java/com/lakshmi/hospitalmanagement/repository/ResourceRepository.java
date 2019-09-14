package com.lakshmi.hospitalmanagement.repository;
import com.lakshmi.hospitalmanagement.entities.Resource;
import org.springframework.data.repository.CrudRepository;
public interface ResourceRepository extends CrudRepository<Resource, Long> {
}
