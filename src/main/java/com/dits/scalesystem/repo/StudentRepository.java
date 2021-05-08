package com.dits.scalesystem.repo;

import com.dits.scalesystem.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created By vaibh on 3/7/2021
 */
@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {
}
