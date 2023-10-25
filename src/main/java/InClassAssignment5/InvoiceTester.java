package InClassAssignment5;

public class InvoiceTester {
    public static void main(String[] args) {
        Products justinHollSkills = new Products(-1, "Justin Holl has mad skillz man", 3400000);
        Products josephWollSkillz = new Products(2, "Jospeh Woll is the starting wolie", 850000);
        Products connorMcFraud = new Products(3, "Connor mc who? mcIrrelevant", -1050000);

        System.out.printf("id: %d, desc: %s, price: %f \n", justinHollSkills.getId(), justinHollSkills.getDescription(), justinHollSkills.getPrice());
        System.out.printf("id: %d, desc: %s, price: %f \n", josephWollSkillz.getId(), josephWollSkillz.getDescription(), josephWollSkillz.getPrice());
        System.out.printf("id: %d, desc: %s, price: %f \n", connorMcFraud.getId(), connorMcFraud.getDescription(), connorMcFraud.getPrice());

        justinHollSkills.setId(1);
        connorMcFraud.setPrice(1050000);

        System.out.printf("id: %d, desc: %s, price: %f \n", connorMcFraud.getId(), connorMcFraud.getDescription(), connorMcFraud.getPrice());
        System.out.printf("id: %d, desc: %s, price: %f \n", justinHollSkills.getId(), justinHollSkills.getDescription(), justinHollSkills.getPrice());

        InvoiceItem justinHollIsTheBest = new InvoiceItem(6, justinHollSkills);
        InvoiceItem josephWollIsTheBest = new InvoiceItem(-2, josephWollSkillz);
        InvoiceItem connorMcFraudSucks = new InvoiceItem(12, connorMcFraud);

        System.out.printf("id: %d, quantity: %d, total: %.2f \n", justinHollIsTheBest.getProduct().getId(),
                justinHollIsTheBest.getQuantity(),
                justinHollIsTheBest.getitemTotal());
        System.out.printf("id: %d, quantity: %d, total: %.2f \n", josephWollIsTheBest.getProduct().getId(),
                josephWollIsTheBest.getQuantity(),
                josephWollIsTheBest.getitemTotal());
        System.out.printf("id: %d, quantity: %d, total: %.2f \n", connorMcFraudSucks.getProduct().getId(),
                connorMcFraudSucks.getQuantity(),
                connorMcFraudSucks.getitemTotal());

        josephWollIsTheBest.setQuantity(2);

        System.out.printf("id: %d, quantity: %d, total: %.2f \n", josephWollIsTheBest.getProduct().getId(),
                josephWollIsTheBest.getQuantity(),
                josephWollIsTheBest.getitemTotal());

        Invoice invoice = new Invoice();

        invoice.setInvoiceItem1(justinHollIsTheBest);
        invoice.setInvoiceItem1(josephWollIsTheBest);
        invoice.setInvoiceItem1(connorMcFraudSucks);

        System.out.printf("Invoice total: %.2f", invoice.getInvoiceTotal());
    }
}
