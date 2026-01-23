package com.example.demo.controller;

import com.example.demo.dto.ExerciseRequestDto;
import com.example.demo.dto.ExerciseResponseDto;
import com.example.demo.service.ExerciseService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class ExerciseController {
    private final ExerciseService exerciseService;

    public ExerciseController(ExerciseService exerciseService) {
        this.exerciseService = exerciseService;
    }

    @PostMapping("/workouts/{workoutId}/exercises")
    public ResponseEntity<ExerciseResponseDto> addExercise(
            @PathVariable Long workoutId,
            @Valid @RequestBody ExerciseRequestDto dto
            ){
        return ResponseEntity.ok(exerciseService.addExerciseToWorkout(workoutId,dto));
    }

    @GetMapping("/workouts/{workoutId}/exercises")
    public ResponseEntity<List<ExerciseResponseDto>> getExercises(
            @PathVariable Long workoutId
    ){
       return ResponseEntity.ok(exerciseService.getExercisesByWorkoutId(workoutId));
    }
}
