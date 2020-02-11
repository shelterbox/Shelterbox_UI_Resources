// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package objecthandling.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.webui.CustomJavaAction;
import objecthandling.XPath;

/**
 * Removes ALL instances of a certain domain object type using batches.
 */
public class deleteAll extends CustomJavaAction<java.lang.Boolean>
{
	private IMendixObject entityType;

	public deleteAll(IContext context, IMendixObject entityType)
	{
		super(context);
		this.entityType = entityType;
	}

	@java.lang.Override
	public java.lang.Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		return XPath.create(this.getContext(), entityType.toString()).deleteAll();
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "deleteAll";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}