package com.hunganh.cellphones_clientweb.service;

import com.hunganh.cellphones_clientweb.dto.ProductBox;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Component
public class ProductService {

    private final String myHost = "http://localhost:8081/api/v1/products";
    private final String CATEGORY_LIMIT = myHost + "?category=%s&limit=%d";

    public List<ProductBox> getAllProduct(String category, int limit) {
        final String url = String.format(CATEGORY_LIMIT, category, limit);
        System.out.println(url);
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<ProductBox[]> response = restTemplate
                .exchange(url, HttpMethod.GET, null, ProductBox[].class);
        if (response.getStatusCode().is2xxSuccessful()) {
            ProductBox[] objects = response.getBody();
            return Arrays.asList(objects);
        } else {
            return Collections.emptyList();
        }
    }
}
