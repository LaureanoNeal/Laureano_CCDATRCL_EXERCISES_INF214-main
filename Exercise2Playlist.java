import java.util.LinkedList;

public class Exercise2Playlist {
    public static void main(String[] args) {

         
        LinkedList<String> Song = new LinkedList<>();

        
        Song.add("Dynamite");
        Song.add("Whistle");
        Song.add("Butter");
        Song.add("Marry The Night");
        Song.add("Focus");

       
        Song.addFirst("Rain On Me");

     
        Song.addLast("Sour Candy");

     
        System.out.println(Song.get(0));

     
        Song.set(6, "Left and Right");

   
        Song.remove(0);

       
        System.out.println("Neal's Playlist: " + Song);
    
    }
}
