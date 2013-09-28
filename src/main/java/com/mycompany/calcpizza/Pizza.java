/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.calcpizza;

import java.math.BigDecimal;

/**
 *
 * @author koty
 */
class Pizza {

    public Pizza(PizzaSize size, PizzaKind kind, BigDecimal price) {
        this.size = size;
        this.kind = kind;
        this.price = price;
    }
    private final PizzaSize size;
    private final PizzaKind kind;
    private final BigDecimal price;
    
    BigDecimal getPrice() {
        return price;
    }

    PizzaSize getSize() {
        return size;
    }

    PizzaKind getKind() {
        return kind;
    }
}
