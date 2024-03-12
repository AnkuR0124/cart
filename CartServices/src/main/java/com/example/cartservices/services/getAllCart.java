package com.example.cartservices.services;

import com.example.cartservices.dtos.FakeStoreProductDto;
import com.example.cartservices.models.product;

import java.util.List;

public interface getAllCart {
    List<FakeStoreProductDto> getAllCart();
    product getSingleCart(Long id);


}
