/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.aspe.egresos.model;

/**
 *
 * @author HP
 */
public class CasaComercial {
    
    private String ID_CC;
    private String NOMBRE_CC;
    private String RUC_CC;
    private String PRODUCTOS_CC;
    private String VENTAS_CC;

    
    public CasaComercial(String ID_CC, String NOMBRE_CC, String RUC_CC, String PRODUCTOS_CC, String VENTAS_CC) {
        this.ID_CC = ID_CC;
        this.NOMBRE_CC = NOMBRE_CC;
        this.RUC_CC = RUC_CC;
        this.PRODUCTOS_CC = PRODUCTOS_CC;
        this.VENTAS_CC = VENTAS_CC;
    }

    /**
     * @return the ID_CC
     */
    public String getID_CC() {
        return ID_CC;
    }

    /**
     * @param ID_CC the ID_CC to set
     */
    public void setID_CC(String ID_CC) {
        this.ID_CC = ID_CC;
    }

    /**
     * @return the NOMBRE_CC
     */
    public String getNOMBRE_CC() {
        return NOMBRE_CC;
    }

    /**
     * @param NOMBRE_CC the NOMBRE_CC to set
     */
    public void setNOMBRE_CC(String NOMBRE_CC) {
        this.NOMBRE_CC = NOMBRE_CC;
    }

    /**
     * @return the RUC_CC
     */
    public String getRUC_CC() {
        return RUC_CC;
    }

    /**
     * @param RUC_CC the RUC_CC to set
     */
    public void setRUC_CC(String RUC_CC) {
        this.RUC_CC = RUC_CC;
    }

    /**
     * @return the PRODUCTOS_CC
     */
    public String getPRODUCTOS_CC() {
        return PRODUCTOS_CC;
    }

    /**
     * @param PRODUCTOS_CC the PRODUCTOS_CC to set
     */
    public void setPRODUCTOS_CC(String PRODUCTOS_CC) {
        this.PRODUCTOS_CC = PRODUCTOS_CC;
    }

    /**
     * @return the VENTAS_CC
     */
    public String getVENTAS_CC() {
        return VENTAS_CC;
    }

    /**
     * @param VENTAS_CC the VENTAS_CC to set
     */
    public void setVENTAS_CC(String VENTAS_CC) {
        this.VENTAS_CC = VENTAS_CC;
    }
}
