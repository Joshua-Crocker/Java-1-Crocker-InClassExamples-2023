package InClassAssignment5;

public class Invoice {
    private InvoiceItem InvoiceItem1;
    private InvoiceItem InvoiceItem2;
    private InvoiceItem InvoiceItem3;

    public InvoiceItem getInvoiceItem1() {
        return InvoiceItem1;
    }

    public void setInvoiceItem1(InvoiceItem invoiceItem1) {
        InvoiceItem1 = invoiceItem1;
    }

    public InvoiceItem getInvoiceItem2() {
        return InvoiceItem2;
    }

    public void setInvoiceItem2(InvoiceItem invoiceItem2) {
        InvoiceItem2 = invoiceItem2;
    }

    public InvoiceItem getInvoiceItem3() {
        return InvoiceItem3;
    }

    public void setInvoiceItem3(InvoiceItem invoiceItem3) {
        InvoiceItem3 = invoiceItem3;
    }

    public double getInvoiceTotal() {
        double invoiceTotal = 0;
        if(this.InvoiceItem1 != null) {
            invoiceTotal += InvoiceItem1.getitemTotal();
        }
        if(this.InvoiceItem2 != null) {
            invoiceTotal += InvoiceItem2.getitemTotal();
        }
        if(this.InvoiceItem3 != null) {
            invoiceTotal += InvoiceItem3.getitemTotal();
        }
        return invoiceTotal;
    }
}


