import java.util.Hashtable ;
import java.util.Iterator; 

public class SongsOfThe90s implements SongIterator {
	Hashtable<Integer, SongInfo> bestSongs = new Hashtable<Integer, SongInfo>();
	int hashKey = 0 ;
	
	public SongsOfThe90s() {
		
		addSong("Losing My Religion", "REM", 1991) ;
		addSong("Creep", "Radiohead", 1993) ;
		addSong("Walk on the Ocean", "Toad the Wet Sprocket", 1991) ;
	}
	
	public void addSong(String songName, String bandName, int yearReleased) {
		SongInfo songInfo = new SongInfo(songName, bandName, yearReleased) ;
		bestSongs.put(hashKey,  songInfo) ;
		hashKey++ ;
	}
	
	
	public Hashtable<Integer, SongInfo> getBestSongs() {
		return bestSongs;
	}

	@Override
	public Iterator<SongInfo> createIterator() {
		// TODO Auto-generated method stub
		return bestSongs.values().iterator();
	}
}