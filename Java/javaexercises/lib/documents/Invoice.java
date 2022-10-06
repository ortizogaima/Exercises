package javaexercises.lib.documents;

//Invoice Class
public class Invoice {

    private String nameProduct;     
    private String descriptionProduct;
    private int quantityProduct;
    private double priceProduct;


    //Constructor to set default values
    public Invoice(){
        nameProduct = "None";
        descriptionProduct = "None";
        priceProduct = 0;
    };

    //Accessor methods
    //Get nameProduct
    public String getNameProduct(){
        return nameProduct;
    };

    //Get descriptionProduct
    public String getDescriptionProduct(){
        return descriptionProduct;
    };

    //Get quantity
    public int getQuantityProduct(){
        return quantityProduct;
    };

    //Get priceProduct
    public double getPriceProduct(){
        return priceProduct;
    };

    //Get totalPrice
    public double getTotalPrice(){
        return priceProduct*quantityProduct;
    };    

    //Mutator methods
    //Set nameProduct
    public void setNameProduct(String nameProduct){
        this.nameProduct = nameProduct;
    };

    //Set descriptionProduct
    public void setDescriptionProduct(String descriptionProduct){
        this.descriptionProduct = descriptionProduct;
    };

    //Set quantity
    public void setQuantityProduct(int quantityProduct){
        this.quantityProduct = quantityProduct;
    };

    //Set priceProduct
    public void setPriceProduct(double priceProduct){
        this.priceProduct = priceProduct;
    };

    //Method to set an invoice
    public void setInvoice(){

        this.setNameProduct("Celphone");

        this.setDescriptionProduct("Moto Edge 30 Pro");

        this.setPriceProduct(800);

        this.setQuantityProduct(2);

    }
    
    //Method to show an invoice
    public void showInvoice (Invoice invoice){

        System.out.println("Product: " + invoice.getNameProduct());
        System.out.println("Description: " + invoice.getDescriptionProduct());
        System.out.println("Quantity: " + invoice.getQuantityProduct());
        System.out.println("Price: $" + invoice.getPriceProduct());
        System.out.println("____________");
        System.out.println("Total price: $" + invoice.getTotalPrice());
        System.out.println();
        System.out.println("---------------------------------------");
        System.out.println();

    };
}