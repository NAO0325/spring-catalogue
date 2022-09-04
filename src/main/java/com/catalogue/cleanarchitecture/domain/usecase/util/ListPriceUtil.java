package com.catalogue.cleanarchitecture.domain.usecase.util;

import com.catalogue.cleanarchitecture.domain.model.Price;

import java.util.List;

public class ListPriceUtil {

    private ListPriceUtil() {
    }

    /**
     * Filtra la lista de prices a partir de la 'priority' mas alta si es el mismo numero quedara
     * la lista con todos los elementos de mayor 'priority'
     *
     * @param prices Recibe la lista de Price ordenada por prority descenedente
     */
    public static void filterSimilarElementsByPrority(List<Price> prices) {
        int i = 0;
        while (prices.size() > 1) {
            if (i >= prices.size() - 1) {
                break;
            }
            if (prices.get(i).getPriority() > prices.get(i + 1).getPriority()) {
                prices.remove(i + 1);
            } else {
                i++;
            }
        }
    }

    /**
     * Filtra la lista de prices a partir del 'priceList' mas alto si son el mismo numero quedara
     * la lista con todos los elementos de mayor 'priceList'
     *
     * @param prices Recibe la lista de Price ordenada por 'priceList' descenedente
     */
    public static void filterSimilarElementsByPriceList(List<Price> prices) {
        int i = 0;
        while (prices.size() > 1) {
            if (i >= prices.size() - 1) {
                break;
            }
            if (prices.get(i).getPriceList() > prices.get(i + 1).getPriceList()) {
                prices.remove(i + 1);
            } else {
                i++;
            }
        }
    }

}
