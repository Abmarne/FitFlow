package com.example.demo.repository;

import com.example.demo.entity.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExerciseRepository extends JpaRepository<Exercise,Long> {
    List<Exercise> findByWorkoutId(Long id);
}
