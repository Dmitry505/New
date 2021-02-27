package player;

import java.util.List;

public class Myusic implements NewInterface{
    private String name;
    private int time;
    Singer si = new Singer();
    Albom al = new Albom();
    
    public String getName (){
        return name;
    } 
    
    public Myusic setName(String name){
        this.name=name; 
        return this;
    }
    
    public int getTime(){
       return time;
   } 
    
    public Myusic setTime(int time){
        this.time=time;
        return this;
    } 

    @Override
    public void play(List<Myusic>songs) {

    }
    
   
    
}
