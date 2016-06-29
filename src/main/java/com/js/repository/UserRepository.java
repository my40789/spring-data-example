package com.js.repository;

import com.js.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by JunSheng on 6/30/2016.
 */

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
