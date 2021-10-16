package com.examly.springapp.model;

import java.io.Serializable;

public class OrderDetailsCompositeKey implements Serializable{
    private Long orderId;
    private Long productId;
}
