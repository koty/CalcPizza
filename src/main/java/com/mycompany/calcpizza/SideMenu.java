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
public class SideMenu extends Menu {
    private final MenuKind menu;
    private final MenuSize size;
    private final SideMenuKind kind;
    private final BigDecimal price;

    public SideMenu( MenuSize size, SideMenuKind kind, BigDecimal price) {
        this.menu = MenuKind.サイドメニュー;
        this.size = size;
        this.kind = kind;
        this.price = price;
    }


    public MenuKind getMenu() {
        return menu;
    }

    public MenuSize getSize() {
        return size;
    }

    public SideMenuKind getKind() {
        return kind;
    }

   
    public BigDecimal getPrice() {
        return price;
    }
    
    
    
}
