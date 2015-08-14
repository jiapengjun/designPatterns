import java.util.HashMap ;
import java.awt.Color ;

public class RectFactory {

		private static final HashMap<Color, MyRect> rectsByColor = new HashMap<Color, MyRect>();
		
		public static MyRect getRect(Color color) {
			MyRect rect = (MyRect) rectsByColor.get(color) ;
			if(rect == null) {
				rect = new MyRect(color) ;
				rectsByColor.put(color, rect) ;
			}
			return rect;
		}		
}
