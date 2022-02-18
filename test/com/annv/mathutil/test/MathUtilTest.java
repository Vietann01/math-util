/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.annv.mathutil.test;

import com.annv.mathutil.core.MathUtil;
import static com.annv.mathutil.core.MathUtil.getFactorial;
import org.junit.Test;
import static org.junit.Assert.*;

//neu muon xai cac ham static, co 2 cach
//cach 1: goi ten class.ten ham static
//          import package...class co ham stastic
//cach 2: khong goi class., goi ten ham minh em, giong C
/**
 *
 * @author PhongVu
 */
public class MathUtilTest {

    //Test case #1: get F() with valid argument
    //n = 0, expected = 1; actual : doan xem!!!
    @Test //bien mot ham bat ki trong class thanh main
    public void testFactotialGinvenValidArgumentReturnWell() {
        long expected = 1; //hi vong tra ve 1 neu tinh 0!
        long actual = MathUtil.getFactorial(0);
        assertEquals(expected, actual);
        // ham main() kieu cu ta in ra ket qua pex va act
        //ben JUnit, tung ra 2 mau sac : Xanh - Khop | Do - Khong Khop

    }

    //Test case #2: get F() with valid argument
    //n = 6, expected = 720; actual : doan xem!!!
    @Test //bien mot ham bat ki trong class thanh main
    public void testFactotialGinvenN6ValidArgumentReturnWell() {
        long expected = 720; //hi vong tra ve 1 neu tinh 0!
        long actual = MathUtil.getFactorial(6);
        assertEquals(expected, actual);
        // ham main() kieu cu ta in ra ket qua pex va act
        //ben JUnit, tung ra 2 mau sac : Xanh - Khop | Do - Khong Khop

    }

    //Ngoai le thi lam sao de test
    //Nho la: Ngoai le khong phai la mot value
    // Ngoai le la mot tinh huong, thu gi do bat thuong
    //khong la value de so sanh kieu assertequals()
    //ngoai le khong dung ham assertequals()
    
    //Test case #3: GetF() with invalid argument
    //n = -5; expect = ngoai leas
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialGinvenInvalidArgumentThrowsExcepption() {
    
        getFactorial(-5);
}
    
    
    
    
    
    
    
    
}
