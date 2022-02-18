/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.annv.mathutil.test;

import com.annv.mathutil.core.MathUtil;
import static com.annv.mathutil.core.MathUtil.getFactorial;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


/**
 *
 * @author admin
 */

@RunWith(value = Parameterized.class)
public class MathUtilDDTTest{
    
    //ta can test thu ham getF() ben code chinh chay dung khong
    //ro rang ta phai dua data cho ham, xong xem no tra ve gi
    //so sanhs ket luan ham dung sai
    //3 viec: chuan bi data, dua data vao ham (goi ham)
    //                      ket luan dung sai
    //done o ben MathUtilTest roi, NHUNG
    
    //0!, 0 -> 1
    //1!, 1 -> 1
    //2!, 2 -> 2        bo du lieu test, test data
    //3!, 3 -> 6        luu table SQLServer, Excel, .CSV
    //5!, 5 -> 120      luu trong mot mang trong code cx okie
    //6!, 6 -> 720
    //mang 2 chieu [7] [2]
    //[10][20]
    
    //hoc cach viet code tach dam data ra khoi cac cau lenh
    //getF(), khong mixed. Tat ca cac framework UnitTest cua moi
    //NNLT deu lam duoc dieu nay!!!
    
    //ham tra ve mang 2 chieu kieu Object
    //vi cac framework choi voi Object khong ha, mang so nguyen
    //phai hieu la Object, tuc la choi voi Wrapper Class neu
    //mang so...
    //Wrapper class: Integer (int) Long (long), Character (character)
    
    //bao may JVM JUnit day la data nguon!!! dung nhoi assert
    @Parameterized.Parameters
    public static Object[][] initData(){
        //int a[] = {2, 4, 6, 8};
        //int a[4] = {2, 4, 6, 8};
        //int a[] = {0, 1}
        
        return new Integer [] []{
        
                                   {0, 1},
                                   {1, 1},
                                   {2, 2},
                                   {3, 6},
                                   {6, 720}
    
                                };
        }
    //can trich mang con ra de duoc cap value input/expected
    @Parameterized.Parameter(value = 0)//map cot 0
    public int input;
    
    @Parameterized.Parameter(value = 1) //map cot 1
    public int expected;
    
    @Test
    public void testFactotialGinvenValidArgumentReturnWell() {
        
        //long actual = getFactorial(input);
        
        
        assertEquals(expected, getFactorial(input));
        }
    }

//DDT tach data can test ra 1 cho. Sau do lay tung mieng data
//moi/nhoi/lap/map vao trong cho goi ham, cho assert()
//tach va nhoi vao -> lam hoai nhu vay cho cac bo data
//phai thong qua ten bien/tham so
//DDT con duoc goi ten la: THAM SO HOA TEST DATA PARAMETERIZED
