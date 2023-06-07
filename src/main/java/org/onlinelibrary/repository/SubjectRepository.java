package org.onlinelibrary.repository;

import org.onlinelibrary.model.Subject;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface SubjectRepository extends JpaRepository<Subject, Integer> {

  public Subject getByName(String name);
  public List<Subject> getSubjectsByNameIsContainingIgnoreCase(String name, Sort sort);
  public boolean existsByName(String name);

}
