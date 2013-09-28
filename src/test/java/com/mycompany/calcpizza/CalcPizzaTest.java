/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.calcpizza;

import com.mycompany.calcpizza.CalcPizza;
import com.mycompany.calcpizza.CalcPizza;
import com.mycompany.calcpizza.PizzaKind;
import com.mycompany.calcpizza.PizzaKind;
import com.mycompany.calcpizza.MenuSize;
import com.mycompany.calcpizza.MenuSize;
import java.math.BigDecimal;
import java.util.List;
import static org.hamcrest.CoreMatchers.*;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author koty
 */
public class CalcPizzaTest {
//    @Test
//    public void Lサイズのピザを注文する() {
//        CalcPizza sut = new CalcPizza();
//        sut.orderピザ(MenuSize.L, PizzaKind.ミックスピザ);
//        BigDecimal result = sut.get合計金額();
//        
//        assertThat(result, is(new BigDecimal("800")));
//    }
//    
//    @Test
//    public void LサイズとMサイズのピザを注文する() {
//        CalcPizza sut = new CalcPizza();
//        sut.orderピザ(MenuSize.L, PizzaKind.ミックスピザ);
//        sut.orderピザ(MenuSize.M, PizzaKind.ミックスピザ);
//        BigDecimal result = sut.get合計金額();
//        
//        assertThat(result, is(new BigDecimal("1500")));
//    }

    @Test
    public void Lサイズのピザを注文する2() {
        CalcPizza sut = new CalcPizza();
        PizzaMaster sut2 = new PizzaMaster();
        sut.order(sut2.getPizza(MenuSize.L, PizzaKind.ミックスピザ));
        BigDecimal result = sut.get合計金額();
        
        assertThat(result, is(new BigDecimal("800")));
    }
    
    @Test
    public void LサイズとMサイズのピザを注文する2() {
        CalcPizza sut = new CalcPizza();
        PizzaMaster sut2 = new PizzaMaster();
        sut.order(sut2.getPizza(MenuSize.L, PizzaKind.ミックスピザ));
        sut.order(sut2.getPizza(MenuSize.M, PizzaKind.ミックスピザ));
        BigDecimal result = sut.get合計金額();
        
        assertThat(result, is(new BigDecimal("1500")));
    }

    @Test
    public void ナゲットを注文する() {
        CalcPizza sut = new CalcPizza();
        SideMenuMaster sut2 = new SideMenuMaster();
        sut.order(sut2.getSideMenu(MenuSize.S, SideMenuKind.ナゲット));
        BigDecimal result = sut.get合計金額();
        
        assertThat(result, is(new BigDecimal("300")));
    }

    @Test
    public void ピザとナゲットを注文する() {
        CalcPizza sut = new CalcPizza();
        SideMenuMaster sut2 = new SideMenuMaster();
        PizzaMaster sut3 = new PizzaMaster();
        sut.order(sut2.getSideMenu(MenuSize.S, SideMenuKind.ナゲット));
        sut.order(sut3.getPizza(MenuSize.L, PizzaKind.ミックスピザ));
        BigDecimal result = sut.get合計金額();
        
        assertThat(result, is(new BigDecimal("1100")));
    }

    @Test
    public void ピザMサイズ以上が２枚以上でナゲットを１つ無料にする() {
        CalcPizza sut = new CalcPizza();
        SideMenuMaster sut2 = new SideMenuMaster();
        PizzaMaster sut3 = new PizzaMaster();
        sut.order(sut2.getSideMenu(MenuSize.S, SideMenuKind.ナゲット));
        sut.order(sut3.getPizza(MenuSize.L, PizzaKind.ミックスピザ));
        sut.order(sut3.getPizza(MenuSize.L, PizzaKind.ミックスピザ));
        BigDecimal result = sut.get合計金額();
        
        assertThat(result, is(new BigDecimal("1600")));
    }

}
