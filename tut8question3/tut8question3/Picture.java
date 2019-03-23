package tut8question3;

import java.util.ArrayList;
import java.util.Iterator;

public class Picture {
	private ArrayList <Shape>shapes;

	public Picture()
	{
		shapes = new ArrayList<Shape>();
	}
	void addShape(Shape s)
	{
		shapes.add(s);
	}
	public void listAllShapeTypes()
	{
		for(Iterator it=shapes.iterator();it.hasNext();)
	       {
	    	   Shape shapes=(Shape)it.next();
	    	   shapes.displayShape();
	       }
	}
	public void listSingleShapeType(String className)
	{
		if(shapes.toString()==className)
		{
			for (Iterator it=shapes.iterator();it.hasNext();)
			{
				Shape shapes=(Shape)it.next();
		    	   shapes.displayShape();
			}
		}
		else if(shapes.toString()==className)
		{
			for (Iterator it=shapes.iterator();it.hasNext();)
			{
				Shape shapes=(Shape)it.next();
		    	   shapes.displayShape();
			}
		}
		else
		{
			for (Iterator it=shapes.iterator();it.hasNext();)
			{
				Shape shapes=(Shape)it.next();
		    	   shapes.displayShape();
			}
		}
	}

}

