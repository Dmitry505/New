package player;

import java.util.List;

public class Albom implements NewInterface{
    private String name;
    private String god;
    
    public String getName (){
        return name;
    } 
    
    public Albom setName (String name){
        this.name=name;
        return this;
        
    } 
    
    public String getGod (){
        return god;
    } 
    
    public Albom setGod(String god){
        this.god=god;
        return this;
    } 

    @Override
    public void play(List<Myusic>songs) {

    }
}
