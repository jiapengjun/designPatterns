//import java.util.ArrayList;
//import java.util.Enumeration;
//import java.util.Hashtable;
import java.util.Iterator;


public class DiscJockey {
	SongsOfThe70s songs70s ;
	SongsOfThe80s songs80s ;
	SongsOfThe90s songs90s ;
	
	SongIterator iter70sSongs ;
	SongIterator iter80sSongs ;
	SongIterator iter90sSongs ;
	
	public DiscJockey(SongIterator newSongs70s, SongIterator newSongs80s, SongIterator newSongs90s) {	
		iter70sSongs = newSongs70s ;
		iter80sSongs = newSongs80s ;
		iter90sSongs = newSongs90s ;
	}
	
	/*
	public DiscJockey(SongsOfThe70s newSongs70s, SongsOfThe80s newSongs80s, SongsOfThe90s newSongs90s) {

		
	}

	public void showTheSongs() {
		ArrayList aL70sSongs = songs70s.getBestSongs() ;
		System.out.println("Songs of the 70s\n") ;
		
		for(int i=0; i<aL70sSongs.size(); i++) {
			SongInfo bestSongs = (SongInfo) aL70sSongs.get(i) ;
			System.out.println(bestSongs.getSongName()) ;
			System.out.println(bestSongs.getBandName()) ;
			System.out.println(bestSongs.getYearReleased()) ;
		}
		
		SongInfo[] array80sSongs = songs80s.getBestSongs() ;
		System.out.println("Songs of the 80s\n") ;
		
		for(int i=0; i<array80sSongs.length; i++) {
			SongInfo bestSongs = array80sSongs[i] ;
			System.out.println(bestSongs.getSongName()) ;
			System.out.println(bestSongs.getBandName()) ;
			System.out.println(bestSongs.getYearReleased()) ;
		}
		
		Hashtable<Integer, SongInfo> ht90sSongs = songs90s.getBestSongs() ;
		System.out.println("Songs of the 90s\n") ;
		
		for(Enumeration<Integer> e = ht90sSongs.keys(); e.hasMoreElements();) {
			SongInfo bestSongs = ht90sSongs.get(e.nextElement()) ;
			System.out.println(bestSongs.getSongName()) ;
			System.out.println(bestSongs.getBandName()) ;
			System.out.println(bestSongs.getYearReleased()) ;
			
		}
	}  */

	public void showTheSongs2() {
		Iterator<SongInfo> songs70s = iter70sSongs.createIterator() ;
		Iterator<SongInfo> songs80s = iter80sSongs.createIterator() ;
		Iterator<SongInfo> songs90s = iter90sSongs.createIterator() ;
	
		System.out.println("Songs of the 70s\n");
		printTheSongs(songs70s) ;

		System.out.println("Songs of the 80s\n");
		printTheSongs(songs80s) ;
		
		System.out.println("Songs of the 90s\n");
		printTheSongs(songs90s) ;}
	
	public void printTheSongs(Iterator<SongInfo> iterator) {
		while(iterator.hasNext()) {
			SongInfo songInfo = iterator.next() ;
			System.out.println(songInfo.getSongName()) ;
			System.out.println(songInfo.getBandName()) ;
			System.out.println(songInfo.getYearReleased()) ;			
		}
	}
}
