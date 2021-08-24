/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arep.laboratorio1;

/**
 * Clase extendida de HttpSocketService, que se crea para procesar la API de Iex Cloud.
 * @author Sebastián Mina
 */
public class IEXHttpStockService extends HttpStockService {
    
    String stock="aapl";
    @Override
    public String getURL() {
        return "https://cloud.iexapis.com/stable/stock/"+stock+"/quote?token=pk_8a6cc2e8c79a4d01a8e938fb171f1d9c";
    }

    @Override
    public void setStock(String stock) {
        this.stock = stock;
    }

}
