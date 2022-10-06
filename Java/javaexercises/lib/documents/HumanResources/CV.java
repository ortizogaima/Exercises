package javaexercises.lib.documents.HumanResources;

public class CV {

    private String fullName;
    private int age;
    private String email;
    private String experience;
    private String gitHub;
    
    //Constructor to set default values
    public CV(){
        fullName = "None";
        age = 0;
        email = "None";
        experience = "None";
        gitHub = "None";
    };

    //Accessor methods
    //Get fullname
    public String getFullName(){
        return fullName;
    };
    
    //Get age
    public int getAge(){
        return age;
    };
    
    //Get email
    public String getEmail(){
        return email;
    };  
    
    //Get experience
    public String getExperience(){
        return experience;
    };

    //Get github
    public String getGitHub(){
        return gitHub;
    };  

    //Mutator methods
    //Set fullname
    public void setFullName(String fullName){
        this.fullName = fullName;
    };
    
    //Set age
    public void setAge(int age){
        this.age = age;
    };
    
    //Set email
    public void setEmail(String email){
        this.email = email;
    };

    //Set experience
    public void setExperience(String experience){
        this.experience = experience;
    };
    
    //Set gitHub
    public void setGitHub(String gitHub){
        this.gitHub = gitHub;
    };

    //Method to set an CV
    public void setCV(){

        this.setFullName("Imanol Ortiz");
        
        this.setAge(24);

        this.setEmail("ImanolOrtiz@gmail.com");

        this.setExperience("I have experience in Java");

        this.setGitHub("imanolortiz.github.com");

    }
    
    //Method to show an CV
    public void showCV (CV CV){

        System.out.println("Full Name: " + CV.getFullName());
        System.out.println("Age: " + CV.getAge());
        System.out.println("Email: " + CV.getEmail());
        System.out.println("Experience: " + CV.getExperience());
        System.out.println("GitHub: " + CV.getGitHub());
        System.out.println();
        System.out.println("---------------------------------------");
        System.out.println();

    };

}
