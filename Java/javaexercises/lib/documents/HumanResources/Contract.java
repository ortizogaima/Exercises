package javaexercises.lib.documents.HumanResources;


public class Contract {
    
    private String fullNameFirstPerson;
    private String fullNameSecondPerson;
    private String descriptionContract;
   
    //Constructor to set default values
    public Contract(){
        fullNameFirstPerson = "None";
        fullNameSecondPerson = "None";
        descriptionContract = "None";
    };

    //Accessor methods
    //Get fullname of first person
    public String getFullNameFirstPerson(){
        return fullNameFirstPerson;
    };
    
    //Get fullname of second person
    public String getFullNameSecondPerson(){
        return fullNameSecondPerson;
    };  
    
    //Get description of contract
    public String getDescriptionContract(){
        return descriptionContract;
    };

    //Mutator methods
    //Set fullname of first person
    public void setFullNameFirstPerson(String fullNameFirstPerson){
        this.fullNameFirstPerson = fullNameFirstPerson;
    };

    //Set fullname of second person
    public void setFullNameSecondPerson(String fullNameSecondPerson){
        this.fullNameSecondPerson = fullNameSecondPerson;
    };

    //Set description of contract
    public void setdescriptionContract(String descriptionContract){
        this.descriptionContract = descriptionContract;
    };

    //Method to set an Contract
    public void setContract(){

        this.setFullNameFirstPerson("Imanol Ortiz");
        
        this.setFullNameSecondPerson("Milton Oga");

        this.setdescriptionContract("For this contract we acept are married");

    }
    
    //Method to show an Contract
    public void showContract (Contract Contract){

        System.out.println("Full name of first person: " + Contract.getFullNameFirstPerson());
        System.out.println("Full name of second person: " + Contract.getFullNameSecondPerson());
        System.out.println(Contract.getDescriptionContract());
        System.out.println();
        System.out.println("Firm of " + Contract.getFullNameFirstPerson() + "______________");
        System.out.println("Firm of " + Contract.getFullNameSecondPerson() + "______________");
        System.out.println();
        System.out.println("---------------------------------------");
        System.out.println();

    };
}
