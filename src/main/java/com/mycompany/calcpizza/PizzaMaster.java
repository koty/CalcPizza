/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.calcpizza;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author koty
 */
public class PizzaMaster {
    private final List<Pizza> pizzaList = new ArrayList<Pizza>();

    public PizzaMaster() {
        pizzaList.add(new Pizza(MenuSize.S, PizzaKind.ミックスピザ, new BigDecimal("600")));
        pizzaList.add(new Pizza(MenuSize.M, PizzaKind.ミックスピザ, new BigDecimal("700")));
        pizzaList.add(new Pizza(MenuSize.L, PizzaKind.ミックスピザ, new BigDecimal("800")));
        pizzaList.add(new Pizza(MenuSize.S, PizzaKind.シーフードピザ, new BigDecimal("700")));
        pizzaList.add(new Pizza(MenuSize.M, PizzaKind.シーフードピザ, new BigDecimal("800")));
        pizzaList.add(new Pizza(MenuSize.L, PizzaKind.シーフードピザ, new BigDecimal("900")));
        pizzaList.add(new Pizza(MenuSize.S, PizzaKind.マルガリータ, new BigDecimal("800")));
        pizzaList.add(new Pizza(MenuSize.M, PizzaKind.マルガリータ, new BigDecimal("900")));
        pizzaList.add(new Pizza(MenuSize.L, PizzaKind.マルガリータ, new BigDecimal("1000")));
    }
    
    public Pizza getPizza(MenuSize size, PizzaKind kind) {
        return pizzaList.stream()
                .filter(pizza -> pizza.getKind().equals(kind) && pizza.getSize().equals(size))
                .findFirst()
                .get();
    }
}
