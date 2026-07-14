package com.ashutosh.airBnbApp.strategy;

import com.ashutosh.airBnbApp.entity.Inventory;

import java.math.BigDecimal;
public interface PricingStrategy {

    BigDecimal calculatePrice(Inventory inventory);
}
