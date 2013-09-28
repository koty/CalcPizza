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
public class SideMenuMaster {
    private final List<SideMenu> sidemenuList = new ArrayList<SideMenu>();

    public SideMenuMaster() {
        sidemenuList.add(new SideMenu(MenuSize.S, SideMenuKind.ナゲット, new BigDecimal("300")));
    }
    
    public SideMenu getSideMenu(MenuSize size, SideMenuKind kind) {
        return sidemenuList.stream()
                .filter(sidemenu -> sidemenu.getKind().equals(kind) && sidemenu.getSize().equals(size))
                .findFirst()
                .get();
    }
    
}
