/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialization_1;

import java.io.Serializable;

/**
 *
 * @author admin
 */
public class Demo implements Serializable {

    public int a;
    public String b;

    public Demo(int a, String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public String toString(){
        return "a= " + a + " b= " + b;
    }

}
