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
class Pizza extends Menu{

    public Pizza(MenuSize size, PizzaKind kind, BigDecimal price) {
        this.size = size;
        this.kind = kind;
        this.price = price;
        this.menu = MenuKind.ピザ;
    }
    
    private final MenuKind menu;
    private final MenuSize size;
    private final PizzaKind kind;
    private final BigDecimal price;

    public MenuKind getMenu() {
        return menu;
    }
    
    public BigDecimal getPrice() {
        return price;
    }

    MenuSize getSize() {
        return size;
    }

    PizzaKind getKind() {
        return kind;
    }
}
