package com.example.Practica4Facturas.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Invoice implements Serializable {
    private Integer folio;
    private Date date;
    private List<InvoiceLine> invoiceLineList;

    public Invoice(Integer folio, Date date, List<InvoiceLine> invoiceLineList) {
        this.folio = folio;
        this.date = date;
        this.invoiceLineList = invoiceLineList;
    }

    public Integer getFolio() {
        return folio;
    }

    public void setFolio(Integer folio) {
        this.folio = folio;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double calculateTotal(){
        double total = 0.0;
        for (InvoiceLine invoiceLine:invoiceLineList) {

            total = total + invoiceLine.calculateAmount();
        }
        return total;
    }
}
