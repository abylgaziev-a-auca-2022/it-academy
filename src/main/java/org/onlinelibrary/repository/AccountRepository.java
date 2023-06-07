package org.onlinelibrary.repository;

import org.onlinelibrary.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

  public Account getByEmail(String email);

}
