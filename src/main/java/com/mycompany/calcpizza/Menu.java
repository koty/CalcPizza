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
public abstract class Menu {

    abstract MenuKind getMenu();

    abstract BigDecimal getPrice();
    
}
