package org.onlinelibrary.repository;

import org.onlinelibrary.model.AuthGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AuthGroupRepository extends JpaRepository<AuthGroup, Integer> {

  public AuthGroup getByName(String name);

}
