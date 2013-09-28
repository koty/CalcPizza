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
import com.mycompany.calcpizza.PizzaSize;
import com.mycompany.calcpizza.PizzaSize;
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
    @Test
    public void Lサイズのピザを注文する() {
        CalcPizza sut = new CalcPizza();
        sut.orderピザ(PizzaSize.L, PizzaKind.ミックスピザ);
        BigDecimal result = sut.get合計金額();
        
        assertThat(result, is(new BigDecimal("800")));
    }
    
    @Test
    public void LサイズとMサイズのピザを注文する() {
        CalcPizza sut = new CalcPizza();
        sut.orderピザ(PizzaSize.L, PizzaKind.ミックスピザ);
        sut.orderピザ(PizzaSize.M, PizzaKind.ミックスピザ);
        BigDecimal result = sut.get合計金額();
        
        assertThat(result, is(new BigDecimal("1500")));
    }
}
