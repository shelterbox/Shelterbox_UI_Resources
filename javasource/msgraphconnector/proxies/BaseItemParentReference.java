// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package msgraphconnector.proxies;

public class BaseItemParentReference
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject baseItemParentReferenceMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MSGraphConnector.BaseItemParentReference";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		DriveId("DriveId"),
		_id("_id"),
		Name("Name"),
		Path("Path"),
		ShareId("ShareId"),
		BaseItemParentReference_BaseItem("MSGraphConnector.BaseItemParentReference_BaseItem"),
		BaseItemSharepointIds_BaseItemParentReference("MSGraphConnector.BaseItemSharepointIds_BaseItemParentReference");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public BaseItemParentReference(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MSGraphConnector.BaseItemParentReference"));
	}

	protected BaseItemParentReference(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject baseItemParentReferenceMendixObject)
	{
		if (baseItemParentReferenceMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MSGraphConnector.BaseItemParentReference", baseItemParentReferenceMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MSGraphConnector.BaseItemParentReference");

		this.baseItemParentReferenceMendixObject = baseItemParentReferenceMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'BaseItemParentReference.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static msgraphconnector.proxies.BaseItemParentReference initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return msgraphconnector.proxies.BaseItemParentReference.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static msgraphconnector.proxies.BaseItemParentReference initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new msgraphconnector.proxies.BaseItemParentReference(context, mendixObject);
	}

	public static msgraphconnector.proxies.BaseItemParentReference load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return msgraphconnector.proxies.BaseItemParentReference.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of DriveId
	 */
	public final java.lang.String getDriveId()
	{
		return getDriveId(getContext());
	}

	/**
	 * @param context
	 * @return value of DriveId
	 */
	public final java.lang.String getDriveId(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.DriveId.toString());
	}

	/**
	 * Set value of DriveId
	 * @param driveid
	 */
	public final void setDriveId(java.lang.String driveid)
	{
		setDriveId(getContext(), driveid);
	}

	/**
	 * Set value of DriveId
	 * @param context
	 * @param driveid
	 */
	public final void setDriveId(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String driveid)
	{
		getMendixObject().setValue(context, MemberNames.DriveId.toString(), driveid);
	}

	/**
	 * @return value of _id
	 */
	public final java.lang.String get_id()
	{
		return get_id(getContext());
	}

	/**
	 * @param context
	 * @return value of _id
	 */
	public final java.lang.String get_id(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames._id.toString());
	}

	/**
	 * Set value of _id
	 * @param _id
	 */
	public final void set_id(java.lang.String _id)
	{
		set_id(getContext(), _id);
	}

	/**
	 * Set value of _id
	 * @param context
	 * @param _id
	 */
	public final void set_id(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String _id)
	{
		getMendixObject().setValue(context, MemberNames._id.toString(), _id);
	}

	/**
	 * @return value of Name
	 */
	public final java.lang.String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final java.lang.String getName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(java.lang.String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
	}

	/**
	 * @return value of Path
	 */
	public final java.lang.String getPath()
	{
		return getPath(getContext());
	}

	/**
	 * @param context
	 * @return value of Path
	 */
	public final java.lang.String getPath(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Path.toString());
	}

	/**
	 * Set value of Path
	 * @param path
	 */
	public final void setPath(java.lang.String path)
	{
		setPath(getContext(), path);
	}

	/**
	 * Set value of Path
	 * @param context
	 * @param path
	 */
	public final void setPath(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String path)
	{
		getMendixObject().setValue(context, MemberNames.Path.toString(), path);
	}

	/**
	 * @return value of ShareId
	 */
	public final java.lang.String getShareId()
	{
		return getShareId(getContext());
	}

	/**
	 * @param context
	 * @return value of ShareId
	 */
	public final java.lang.String getShareId(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ShareId.toString());
	}

	/**
	 * Set value of ShareId
	 * @param shareid
	 */
	public final void setShareId(java.lang.String shareid)
	{
		setShareId(getContext(), shareid);
	}

	/**
	 * Set value of ShareId
	 * @param context
	 * @param shareid
	 */
	public final void setShareId(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String shareid)
	{
		getMendixObject().setValue(context, MemberNames.ShareId.toString(), shareid);
	}

	/**
	 * @return value of BaseItemParentReference_BaseItem
	 */
	public final msgraphconnector.proxies.BaseItem getBaseItemParentReference_BaseItem() throws com.mendix.core.CoreException
	{
		return getBaseItemParentReference_BaseItem(getContext());
	}

	/**
	 * @param context
	 * @return value of BaseItemParentReference_BaseItem
	 */
	public final msgraphconnector.proxies.BaseItem getBaseItemParentReference_BaseItem(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		msgraphconnector.proxies.BaseItem result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.BaseItemParentReference_BaseItem.toString());
		if (identifier != null)
			result = msgraphconnector.proxies.BaseItem.load(context, identifier);
		return result;
	}

	/**
	 * Set value of BaseItemParentReference_BaseItem
	 * @param baseitemparentreference_baseitem
	 */
	public final void setBaseItemParentReference_BaseItem(msgraphconnector.proxies.BaseItem baseitemparentreference_baseitem)
	{
		setBaseItemParentReference_BaseItem(getContext(), baseitemparentreference_baseitem);
	}

	/**
	 * Set value of BaseItemParentReference_BaseItem
	 * @param context
	 * @param baseitemparentreference_baseitem
	 */
	public final void setBaseItemParentReference_BaseItem(com.mendix.systemwideinterfaces.core.IContext context, msgraphconnector.proxies.BaseItem baseitemparentreference_baseitem)
	{
		if (baseitemparentreference_baseitem == null)
			getMendixObject().setValue(context, MemberNames.BaseItemParentReference_BaseItem.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.BaseItemParentReference_BaseItem.toString(), baseitemparentreference_baseitem.getMendixObject().getId());
	}

	/**
	 * @return value of BaseItemSharepointIds_BaseItemParentReference
	 */
	public final msgraphconnector.proxies.BaseItemSharepointIds getBaseItemSharepointIds_BaseItemParentReference() throws com.mendix.core.CoreException
	{
		return getBaseItemSharepointIds_BaseItemParentReference(getContext());
	}

	/**
	 * @param context
	 * @return value of BaseItemSharepointIds_BaseItemParentReference
	 */
	public final msgraphconnector.proxies.BaseItemSharepointIds getBaseItemSharepointIds_BaseItemParentReference(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		msgraphconnector.proxies.BaseItemSharepointIds result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.BaseItemSharepointIds_BaseItemParentReference.toString());
		if (identifier != null)
			result = msgraphconnector.proxies.BaseItemSharepointIds.load(context, identifier);
		return result;
	}

	/**
	 * Set value of BaseItemSharepointIds_BaseItemParentReference
	 * @param baseitemsharepointids_baseitemparentreference
	 */
	public final void setBaseItemSharepointIds_BaseItemParentReference(msgraphconnector.proxies.BaseItemSharepointIds baseitemsharepointids_baseitemparentreference)
	{
		setBaseItemSharepointIds_BaseItemParentReference(getContext(), baseitemsharepointids_baseitemparentreference);
	}

	/**
	 * Set value of BaseItemSharepointIds_BaseItemParentReference
	 * @param context
	 * @param baseitemsharepointids_baseitemparentreference
	 */
	public final void setBaseItemSharepointIds_BaseItemParentReference(com.mendix.systemwideinterfaces.core.IContext context, msgraphconnector.proxies.BaseItemSharepointIds baseitemsharepointids_baseitemparentreference)
	{
		if (baseitemsharepointids_baseitemparentreference == null)
			getMendixObject().setValue(context, MemberNames.BaseItemSharepointIds_BaseItemParentReference.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.BaseItemSharepointIds_BaseItemParentReference.toString(), baseitemsharepointids_baseitemparentreference.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return baseItemParentReferenceMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final msgraphconnector.proxies.BaseItemParentReference that = (msgraphconnector.proxies.BaseItemParentReference) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "MSGraphConnector.BaseItemParentReference";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
