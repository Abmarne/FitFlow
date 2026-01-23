package com.example.demo.service;

import com.example.demo.dto.ExerciseRequestDto;
import com.example.demo.dto.ExerciseResponseDto;

import java.util.List;

public interface ExerciseService {
    ExerciseResponseDto addExerciseToWorkout(Long workoutId, ExerciseRequestDto dto);

    ExerciseResponseDto updateExercise(Long exerciseId, ExerciseRequestDto dto);

    void deleteExercise(Long exerciseId);

    List<ExerciseResponseDto> getExercisesByWorkoutId(Long workoutId);
}
