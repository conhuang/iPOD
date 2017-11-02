/**
 * Write a description of class Song here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Song{
  
    private String title=null;
    private String artist=null;
    private int length=0;
    private String filename="";

    /**
     * Constructor for objects of class Song
     */
    public Song(String t, String a, int s, String f)
    {
        title=t;
        artist=a;
        length=s;
        filename=f;
    }

    public Song(){
    }
    public String getFileName(){
        return filename;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String t){
        title = t;
    }
    public String getArtist(){
        return artist;
    }
    public void setArtist(String a){
        artist = a;
    }
    public int getLength(){
        return length;
    }
    public void setLength(int sec){
        length = sec;
    }
    public String toString(){
        String a = title + "  "+artist + "  " + length +" sec";
        return a;
    }
    
}