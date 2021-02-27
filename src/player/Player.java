package player;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;

public class Player implements NewInterface{
    private String name;
    Myusic mu = new Myusic();

    public static void main(String[] args) {
        List<Myusic>songs = new ArrayList<>();
        songs.add(new Myusic()
            .setName("n ")
            .setTime(8));
        new Player().play(songs);
    } 
    public String getName(){
    return name;
    }
    
    public Player setName(String name){
    this.name=name;
    return this;
    }

    @Override
    public void play(List<Myusic>songs) {
        for (Myusic i:songs){
            System.out.println(i.getName() + i.getTime());
        }   
    }
    
    
}
