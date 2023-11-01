package InClassAssignment5;

/**
 * A class that builds the invoice for the invoice system
 *
 * @author joshua.crocker
 */

public class Invoice {
    private final InvoiceItem[] invoiceItemsArray = new InvoiceItem[50];
    private int invoiceItemsCounter = 0;

    /**
     * get invoice items array
     * @return invoice items array
     */
    public InvoiceItem[] getInvoiceItemsArray() {
        return invoiceItemsArray;
    }

    /**
     * get invoice items counter
     * @return invoice items counter
     */
    public int getInvoiceItemsCounter() {
        return invoiceItemsCounter;
    }

    /**
     * set invoice items counter
     * @param invoiceItemsCounter invoice items counter
     */
    public void setInvoiceItemsCounter(int invoiceItemsCounter) {
        this.invoiceItemsCounter = invoiceItemsCounter;
    }

    /**
     * add invoice item to invoice
     * @param invoiceItem invoice item
     */
    public void addInvoiceItem(InvoiceItem invoiceItem) {
        this.invoiceItemsArray[invoiceItemsCounter] = invoiceItem;
        invoiceItemsCounter += 1;
    }

    /**
     * get invoice total
     * @return invoice total
     */
    public double getInvoiceTotal() {
        double invoiceTotal = 0;
        for (int i = 0; i < this.invoiceItemsCounter; i++) {
            invoiceTotal += invoiceItemsArray[i].getitemTotal();
        }
        return invoiceTotal;
    }
}


