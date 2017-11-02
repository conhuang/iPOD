import java.util.Scanner;
public class iPodTest{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        iPod myipod= new iPod("Connie");
        myipod.addSong("Bohemian Rhapsody", "Queen", 180, "Bohemian Rhapsody.mp3");
        myipod.addSong("I Want You Back", "Jackson 5", 180, "I want you back.mp3");
        myipod.addSong("You Should be Dancing", "Bee Gees", 180, "You Should Be Dancing.mp3");
       
        System.out.println(myipod);
        System.out.println(myipod.getSongList());
        System.out.println("Which song number would you like to play? ");
        int x = scan.nextInt();
        
        myipod.playSong(x-1);
    }
}