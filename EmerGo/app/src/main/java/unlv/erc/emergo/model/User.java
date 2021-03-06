package unlv.erc.emergo.model;

import java.util.ArrayList;
import java.util.Date;

public class User {

    private String name;
    private Date birthday;
    private String typeBlood;
    private ArrayList<String> allergy;
    private Boolean cardiac = false;
    private Boolean diabetic = false;
    private Boolean hypertension = false;
    private Boolean seropositive = false;

    public User(){

    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Date getBirthday(){
        return birthday;
    }

    public void setBirthday(Date birthday){
        this.birthday = birthday;
    }

    public String getTypeBlood(){
        return typeBlood;
    }

    public void setTypeBlood(String typeBlood){
        this.typeBlood = typeBlood;
    }

    public ArrayList<String> getAllergy(){
        return allergy;
    }

    public void setAllergy(String allergy){
       this.allergy.add(allergy);
    }

    public boolean getCardiac(){
        return cardiac;
    }

    public void setCardiac(boolean cardiac){
        this.cardiac = cardiac;
    }

    public boolean getDiabetic(){
        return diabetic;
    }

    public void setDiabetic(boolean diabetic){
        this.diabetic = diabetic;
    }

    public boolean getHypertension(){
        return hypertension;
    }

    public void setHypertension(boolean hypertension){
        this.hypertension = hypertension;
    }

    public boolean getSeropositive(){
        return seropositive;
    }

    public void setSeropositive(boolean seropositive){
        this.seropositive = seropositive;
    }
}
