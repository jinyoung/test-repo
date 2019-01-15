package com.example.course;

import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by uengine on 2019. 1. 15..
 */
public interface CourseRepository extends PagingAndSortingRepository<Course, Long> {
}
