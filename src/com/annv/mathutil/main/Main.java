/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.annv.mathutil.main;

import com.annv.mathutil.core.MathUtil;

/**
 *
 * @author PhongVu
 */
public class Main {
    
    public static void main(String[] args) {
        
        //ta se kiem thu bang cach goi ham voi data dua vao, chay, va nhin ket qua
        //cua ham tra ve (ACTUAL) so sanh voi cai ta hi vong no tra ve (EXPECTED)
        //vi du : 5! nhan expected = 123 thuc te ham getFI(5) tra ve actual =?
        // chay moi biet.
        //cuoi cung so sanh: EXPECTED vs ACTUAL
        
        //de dam bao ham dung, ta phai chia cac truong hop/nghi ra cac tinh huong ham
        //se dc xai, tuc la nghi ra bo data dua cho ham, ham chay, outout, ket luan
        
        //Test case #1: check getF() with invalid argument
        //n = 0, expected = 1; actual : doan xem!!!
        long expected = 1;
        long actual = MathUtil.getFactorial(0); //doan xem
        //compare
        System.out.println("0! -> expected: " + expected
                                    + "; actual: "+actual);
        
        //Test case #2: check getF() with invalid argument
        //n = 6, expected = 720; actual : doan xem!!!
        expected = 720;
        actual = MathUtil.getFactorial(6); //doan xem
        //compare
        System.out.println("6! -> expected: " + expected
                                    + "; actual: "+actual);
        
        //Test case #3: check getF() with invalid argument
        //n = -5, expected = Invalid - nem ra ngoai le; actual : doan xem!!!
        //expected - exception phai xuat hien, kh la long;
        System.out.println("Check if an exception is thrown by using invalid argument");
        //actual = MathUtil.getFactorial(-5); //doan xem
        //nhin bang mat de tim ngoai le
        //dung nhu ki vong/ thay ngoai le mung roi nuoc mat
    }
}
