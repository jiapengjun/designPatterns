
public class Originator {

	private String article ;
	
	public void set(String newArticle) {
		System.out.println("From Originator: Current Version of Article\n" + newArticle+"\n") ;
		
		article =newArticle ;
	}
	
	public Memento storeInMemento() {
		System.out.println("From Originator: Saving to Memento") ;
		
		return new Memento(article) ;
	}
	
	public String restoreFromMemento(Memento memento) {
		article = memento.getSavedArticle() ;
		
		System.out.println("From Originator: Previous Article Saved in Memento\n" + article + "\n") ;
		return article ;
	}
}
