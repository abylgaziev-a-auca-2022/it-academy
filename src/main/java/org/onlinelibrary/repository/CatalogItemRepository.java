package org.onlinelibrary.repository;

import org.onlinelibrary.model.CatalogItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CatalogItemRepository extends JpaRepository<CatalogItem, Integer> {

}
