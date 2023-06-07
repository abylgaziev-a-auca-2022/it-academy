package org.onlinelibrary.service;

import lombok.extern.slf4j.Slf4j;
import org.onlinelibrary.model.AuthGroup;
import org.onlinelibrary.repository.AuthGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class AuthGroupService {

  private final AuthGroupRepository authGroupRepository;

  @Autowired
  public AuthGroupService(AuthGroupRepository authGroupRepository) {
    this.authGroupRepository = authGroupRepository;
  }


  public void save(AuthGroup authGroup) {
    authGroupRepository.save(authGroup);
  }

  public AuthGroup getByName(String name) {
    return authGroupRepository.getByName(name);
  }

}
