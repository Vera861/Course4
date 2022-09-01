package ru.gb.lesson7spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.gb.lesson7spring.models.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}