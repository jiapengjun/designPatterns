import java.lang.reflect.*;

import javax.swing.*;

public class MeasurementConversion {

	public static void main(String[] args) {
		JFrame frame = new JFrame() ;
		
		String questionAsked = JOptionPane.showInputDialog(frame, "What's your question") ;
		
		ConversionContext question = new ConversionContext(questionAsked);
		
		String fromConversion = question.getFromConversion() ;
		String toConversion = question.getToConversion() ;
		
		double quantity = question.getQuantity() ;
		
		Class tempClass;
		try {
			tempClass = Class.forName(fromConversion);
			
			Constructor con = tempClass.getConstructor() ;
			
			Object convertFrom = (Expression) con.newInstance() ;
			
			Class[] methodParams = new Class[]{Double.TYPE};
			
			Method conversionMethod = tempClass.getMethod(toConversion, methodParams) ;
			
			Object[] params = new Object[] {new Double(quantity)} ;
			
			String toQuantity = (String) conversionMethod.invoke(convertFrom, params);
			
			String answerToQues = question.getResponse() + toQuantity + " " + toConversion ;
			
			JOptionPane.showMessageDialog(null, answerToQues);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
