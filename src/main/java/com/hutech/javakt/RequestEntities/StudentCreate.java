package com.hutech.javakt.RequestEntities;

import com.hutech.javakt.Entities.Classroom;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentCreate {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String dateOfBirth;
    private Classroom classroom;
}
