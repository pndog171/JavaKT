package com.hutech.javakt.Repositories;

import com.hutech.javakt.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {

}
