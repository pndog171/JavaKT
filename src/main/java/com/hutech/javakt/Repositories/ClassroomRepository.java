package com.hutech.javakt.Repositories;

import com.hutech.javakt.Entities.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassroomRepository extends JpaRepository<Classroom, String> {
}
