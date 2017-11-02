
/**
 * Write a description of class iPod here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class iPod
{
    private Song song;
    private Song[] songs;
    private int numSongs;
    private String name;
    public iPod(String n){
        name=n;
        numSongs=0;
        songs = new Song[5];
    }
    
    public void addSong(String t, String a, int s, String f){
        songs[numSongs] = new Song(t,a,s,f);
        Mp3Player mp3 = new Mp3Player(f);
        numSongs++;
    }
    
    public String getSongList(){
        String s="";
        for (int i = 0; i<numSongs; i++){
            s += (i+1)+". " + songs[i].getTitle() + "\n";
        }
        return s;
    }
    
    public void playSong(int i){
        Mp3Player mp3=new Mp3Player(songs[i].getFileName());
        mp3.play();
    }
    
    public String toString(){
        String t="";
        t=name+"'s iPod\n";
        //t+=song;
        return t;
    }
}