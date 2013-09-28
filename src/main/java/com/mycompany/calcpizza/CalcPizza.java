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

//    private final List<Pizza> orderedPizza = new ArrayList<>();
//    private final PizzaMaster pizzaMaster = new PizzaMaster();
    private final List<Menu> orderedMenu = new ArrayList<>();

//    void orderピザ(MenuSize pizzaSize, PizzaKind pizzaKind) {
//        orderedPizza.add(pizzaMaster.getPizza(pizzaSize, pizzaKind));
//    }
    
    void order(Menu menu) {
        orderedMenu.add(menu);
    }

    BigDecimal get合計金額() {
        BigDecimal result = new BigDecimal("0");
        for (Menu menu : orderedMenu) {
            result = result.add(menu.getPrice());
        }
        
        return result;
    }
}
