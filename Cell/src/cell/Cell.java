/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cell;

import java.io.Serializable;

/**
 *
 * @author user-pc
 */
public class Cell implements Serializable{

     String manufacturer, modelNumber;
     double retailPrice;

    public Cell(String manufacturer, String modelNumber, double retailPrice) {
        this.manufacturer = manufacturer;
        this.modelNumber = modelNumber;
        this.retailPrice = retailPrice;
    }

    
    
    public String getManufacturer() {
        return manufacturer;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public double getRetailPrice() {
        return retailPrice;
    }
    
    
    
    
}
