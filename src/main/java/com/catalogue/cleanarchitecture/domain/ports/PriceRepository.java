package com.catalogue.cleanarchitecture.domain.ports;

import com.catalogue.cleanarchitecture.domain.model.Price;

import java.util.Date;
import java.util.List;

public interface PriceRepository {

   Price findByPriceList(Long id);
   
   List<Price> findAllByBrandIdAndProductIdBetweenDates(Long brandId, Long productId, Date dateBetween);

}
