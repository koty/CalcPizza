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
class CalcPizza {
    private final List<Pizza> orderedPizza = new ArrayList<>();
    private final PizzaMaster pizzaMaster = new PizzaMaster();

    void orderピザ(PizzaSize pizzaSize, PizzaKind pizzaKind) {
        orderedPizza.add(pizzaMaster.getPizza(pizzaSize, pizzaKind));
    }

    BigDecimal get合計金額() {
        BigDecimal result = new BigDecimal("0");
        for(Pizza pizza: orderedPizza) {
            result = result.add(pizza.getPrice());
        }
        
        return result;
    }
    
}
