import java.util.*;
import java.util.ArrayList;


public class playList {
    
}

class Song implements Comparable{
    
    private String songName;
    private String songArtist; 

    //Constructor 
    public Song(String sName, String sArtist){
        this.songName = sName; 
        this.songArtist = sArtist;
    }

    public String getSongName (){
        return songName; 
    }
    public String getSongArtist (){
        return songArtist; 
    }

    public int compareTo (Object o) {
        Song s = (Song)o; 
        return (this.songName).compareTo(s.songName);     
    }

    public boolean equals(Song other){
      return this.songName.equals(other.songName) && this.songArtist.equals(other.songArtist);
    }

    public String toString()
    {
     return songName + " " + songArtist;
    }
    
 }

 class PlayList
{
   ArrayList<Song> list;  //instance variable
   public PlayList()   //constructor
   {
      list = new ArrayList<Song>();
   }

    
   public boolean search(String s)
   {
      for(int i = 0; i < list.size(); i++)
      {
         if(s.equals(list.get(i).getSongName()))
             return true;
      }
      return false;
   }

   
   public String toString()
   {
      String s = "";
      for(int i = 0; i< list.size(); i++)
      {
         s = s + list.get(i).toString()+"\n";
      }
      return s;
      
   }

/*returns true if the object is removed, false otherwise*/
public boolean remove(String name) // gets the name of the song
{
   for(int i = 0; i < list.size(); i++)
   {
      if(list.get(i).getSongName().equals(name))
      {
         list.remove(i); // delete the song from the list
         return true;
      }
   }
   return false;  // the song was not found in the list
}
 
}

   class Driver
{
   public static void main(String[] args)
   {
     PlayList myList = new PlayList();
     myList.add(new Song(   "Hello","Jack"));
     myList.add(new Song("Heaven","Marty"));
     myList.add(new Song("Rain", "Nik"));
     System.out.println(myList);
     myList.remove("Hello");
     System.out.println(myList);
     
   }
}
 

