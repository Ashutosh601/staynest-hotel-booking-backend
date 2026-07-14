package com.ashutosh.airBnbApp.service;

import com.ashutosh.airBnbApp.entity.Booking;

public interface CheckoutService {

    String getCheckoutSession(Booking booking, String successUrl, String failureUrl);

}
