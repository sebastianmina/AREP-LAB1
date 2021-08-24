package edu.escuelaing.arep.laboratorio1;

/**
 * Clase extendida de HttpSocketService, que se crea para procesar la API de Alpha Ventage.
 * @author Sebastián Mina
 */
public class AlphaHttpStockService extends HttpStockService{
    
    String stock="fb";
    @Override
    public String getURL() {
        return "https://www.alphavantage.co/query?function=TIME_SERIES_DAILY&symbol="+stock+"&apikey=Q1QZFVJQ21K7C6XM";
    }

    @Override
    public void setStock(String stock) {
        this.stock=stock;
    }
}
