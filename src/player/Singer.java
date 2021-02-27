package player;

import java.util.List;

public class Singer implements NewInterface{
    private String name;
    private String strana;
    private String janr;
    
    public String getName(){
        return name;
    } 
    
    public Singer setName(String name){
        this.name=name;
        return this;
    } 
    
    public String getStrana(){
        return strana;
    } 
    
    public Singer setStrana(String strana){
        this.strana= strana;
        return this;
    } 
    
    public String getJanr(){
        return janr;
    } 
    
    public Singer setJanr(String janr){
        this.janr=janr;
        return this;
    } 

    @Override
    public void play(List<Myusic>songs) {
  
    }
    
}
