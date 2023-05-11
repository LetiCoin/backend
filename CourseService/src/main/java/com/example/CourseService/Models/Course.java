package com.example.CourseService.Models;

import com.example.CourseService.Dto.CourseDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "preview")
    private String preview;

    public Course(CourseDto courseDto){
        this.name = courseDto.getName();
        this.preview = courseDto.getPreview();
    }
}
