package javaexercises.lib.documents;

//Order Class
public class Order{
    
    private String nameProduct;
    private int quantityProduct;
    private String namePurchaser;
    private String emailPurchaser;
        
    //Constructor to set default values
    public Order(){
        namePurchaser = "None";
        emailPurchaser = "None";
        nameProduct = "None";
        quantityProduct = 0;
    }

    //Accessor methods
    //Get nameProduct
    public String getNameProduct(){
        return nameProduct;
    };

    //Get quantity
    public int getQuantityProduct(){
        return quantityProduct;
    };

    //Get purchaser name
    public String getPurchaserName(){
        return namePurchaser;
    }

    //Get purchaser email
    public String getPurchaserEmail(){
        return emailPurchaser;
    }

    //Mutator methods
    //Set nameProduct
    public void setNameProduct(String nameProduct){
        this.nameProduct = nameProduct;
    };

    //Set quantity
    public void setQuantityProduct(int quantityProduct){
        this.quantityProduct = quantityProduct;
    };

    //Set purchaser name
    public void setPurchaserName(String namePurchaser){
        this.namePurchaser = namePurchaser;
    }

    //Set purchaser email
    public void setPurchaserEmail(String emailPurchaser){
        this.emailPurchaser = emailPurchaser;
    }
    
    //Method to ser an order
    public void setOrder(){

        this.setPurchaserName("Imanol Ortiz");

        this.setPurchaserEmail("ImanolOrtiz@gmail.com");

        this.setNameProduct("Celphone");

        this.setQuantityProduct(2);

    }

    //Method to show an order
    public void showOrder (Order Order){

        System.out.println("Purchaser: " + Order.getPurchaserName());
        System.out.println("Email: " + Order.getPurchaserEmail());
        System.out.println("____________");
        System.out.println("Product: " + Order.getNameProduct());
        System.out.println("Quantity: " + Order.getQuantityProduct());
        System.out.println();
        System.out.println("---------------------------------------");
        System.out.println();

    };
}