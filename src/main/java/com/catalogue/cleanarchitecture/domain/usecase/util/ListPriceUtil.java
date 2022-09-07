package com.catalogue.cleanarchitecture.domain.usecase.util;

import com.catalogue.cleanarchitecture.domain.model.Price;

import java.util.List;
import java.util.stream.Collectors;


public class ListPriceUtil {

    private ListPriceUtil() {
    }

    /**
     * Filtra la lista de prices a partir de la 'priority' mas alta si es el mismo numero quedara
     * la lista con todos los elementos de mayor 'priority'
     *
     * @param prices Recibe la lista de Price ordenada por prority descenedente
     */
    public static List<Price> filterSimilarElementsByPrority(List<Price> prices) {
        //Se recupera valor mas alto del campo
        Integer maxPriority = prices
                .stream()
                .mapToInt(Price::getPriority)
                .max().orElse(0);
        //Se devuelve lista con filtro aplicado
        return prices.stream()
                .filter(price -> price.getPriority() >= maxPriority)
                .collect(Collectors.toList());
    }

    /**
     * Filtra la lista de prices a partir del 'priceList' mas alto si son el mismo numero quedara
     * la lista con todos los elementos de mayor 'priceList'
     *
     * @param prices Recibe la lista de Price ordenada por 'priceList' descenedente
     */
    public static List<Price> filterSimilarElementsByPriceList(List<Price> prices) {
        //Se recupera valor mas alto del campo
        Long maxPriceList = prices
                .stream()
                .mapToLong(Price::getPriceList)
                .max().orElse(0);
        //Se devuelve lista con filtro aplicado
        return prices.stream()
                .filter(price -> price.getPriceList() >= maxPriceList)
                .collect(Collectors.toList());
    }

}
