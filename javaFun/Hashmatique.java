import java.util.HashMap;
import java.util.Set;

public class Hashmatique {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Mr. Nice Guy", "Don't take my kindness for a weakness.");
        trackList.put("Tell Me", "Hit me with your best combo baby.");
        trackList.put("Rough", "Let me hold your hand for all time.");
        trackList.put("Gee", "neomu banjjakbanjjak nuni busheo");
    
        String song = trackList.get("Gee");
        System.out.println(song);

        Set<String> keys = trackList.keySet();
        for(String key: keys) {
            System.out.println("Title: " + key);
            System.out.println("Lyrics: " + trackList.get(key));
        }    
    }
}