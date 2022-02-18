/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.annv.mathutil.core;

/**
 *
 * @author PhongVu
 */

//Class nay cung cap cac tien ich/do choi/1 loat cac ham toan hoc de 
//giup cho cac class su dung..., vi du Calculator can nhieu ham toan hoc
//Cai gi ma la tien ich dung chung, sure no nen design STATIC
public class MathUtil {
    
    //ham tinh n! =1.2.3.4...n
    //khong co giai thua am
    //0! = 1! = 1
    //giai thua tang rat nhanh, 20! du cho long, 18 so 0
    //21! vuot 18 so 0, tran kieu
    //chan viec n<0 va/hoac n>20
    public static long getFactorial(int n){
        
        if(n <0 || n > 20)
            throw new IllegalArgumentException("Invalid argument."
                    + " n must be between 0..20");
        if(n == 0 || n == 1)
            return 1;
        
        //song sot den day, sure n= 2...20
        long product = 1; //ket qua trung gian
        for (int i = 2; i <= n; i++) 
            product *= i;
        
        return product;
        
    }
}
