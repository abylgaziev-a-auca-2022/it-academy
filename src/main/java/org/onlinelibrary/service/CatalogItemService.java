package org.onlinelibrary.service;

import lombok.extern.slf4j.Slf4j;
import org.onlinelibrary.model.CatalogItem;
import org.onlinelibrary.repository.CatalogItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class CatalogItemService {

  private final CatalogItemRepository catalogItemRepository;

  @Autowired
  public CatalogItemService(CatalogItemRepository catalogItemRepository) {
    this.catalogItemRepository = catalogItemRepository;
  }


  public CatalogItem saveAndFlush(CatalogItem catalogItem) {
    return catalogItemRepository.saveAndFlush(catalogItem);
  }


  public CatalogItem getById(Integer id) {
    return catalogItemRepository.getById(id);
  }


  public void deleteById(Integer id) {
    catalogItemRepository.deleteById(id);
  }

}
