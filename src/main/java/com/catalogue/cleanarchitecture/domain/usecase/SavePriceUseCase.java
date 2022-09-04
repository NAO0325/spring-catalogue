package com.catalogue.cleanarchitecture.domain.usecase;

import com.catalogue.cleanarchitecture.domain.model.Price;
import com.catalogue.cleanarchitecture.domain.ports.PriceRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SavePriceUseCase {
    private final PriceRepository priceRepository;

    public Price savePrice(Price price) {
        return priceRepository.save(price);
    }

}
