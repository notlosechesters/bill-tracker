package com.billtracker.server.services;

import com.billtracker.server.model.Invoice;
import java.util.List;

public interface InvoiceService {
    public Invoice addInvoice(Invoice invoice);
    public List<Invoice> getInvoices();
    public Invoice deleteInvoice(long id);
}

