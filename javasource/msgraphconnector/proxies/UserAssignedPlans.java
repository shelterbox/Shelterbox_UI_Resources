// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package msgraphconnector.proxies;

public class UserAssignedPlans
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject userAssignedPlansMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MSGraphConnector.UserAssignedPlans";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		AssignedDateTime("AssignedDateTime"),
		CapabilityStatus("CapabilityStatus"),
		Service("Service"),
		ServicePlanId("ServicePlanId"),
		AssignedPlans_User("MSGraphConnector.AssignedPlans_User");

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

	public UserAssignedPlans(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MSGraphConnector.UserAssignedPlans"));
	}

	protected UserAssignedPlans(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject userAssignedPlansMendixObject)
	{
		if (userAssignedPlansMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MSGraphConnector.UserAssignedPlans", userAssignedPlansMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MSGraphConnector.UserAssignedPlans");

		this.userAssignedPlansMendixObject = userAssignedPlansMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'UserAssignedPlans.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static msgraphconnector.proxies.UserAssignedPlans initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return msgraphconnector.proxies.UserAssignedPlans.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static msgraphconnector.proxies.UserAssignedPlans initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new msgraphconnector.proxies.UserAssignedPlans(context, mendixObject);
	}

	public static msgraphconnector.proxies.UserAssignedPlans load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return msgraphconnector.proxies.UserAssignedPlans.initialize(context, mendixObject);
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
	 * @return value of AssignedDateTime
	 */
	public final java.util.Date getAssignedDateTime()
	{
		return getAssignedDateTime(getContext());
	}

	/**
	 * @param context
	 * @return value of AssignedDateTime
	 */
	public final java.util.Date getAssignedDateTime(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.AssignedDateTime.toString());
	}

	/**
	 * Set value of AssignedDateTime
	 * @param assigneddatetime
	 */
	public final void setAssignedDateTime(java.util.Date assigneddatetime)
	{
		setAssignedDateTime(getContext(), assigneddatetime);
	}

	/**
	 * Set value of AssignedDateTime
	 * @param context
	 * @param assigneddatetime
	 */
	public final void setAssignedDateTime(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date assigneddatetime)
	{
		getMendixObject().setValue(context, MemberNames.AssignedDateTime.toString(), assigneddatetime);
	}

	/**
	 * @return value of CapabilityStatus
	 */
	public final java.lang.String getCapabilityStatus()
	{
		return getCapabilityStatus(getContext());
	}

	/**
	 * @param context
	 * @return value of CapabilityStatus
	 */
	public final java.lang.String getCapabilityStatus(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.CapabilityStatus.toString());
	}

	/**
	 * Set value of CapabilityStatus
	 * @param capabilitystatus
	 */
	public final void setCapabilityStatus(java.lang.String capabilitystatus)
	{
		setCapabilityStatus(getContext(), capabilitystatus);
	}

	/**
	 * Set value of CapabilityStatus
	 * @param context
	 * @param capabilitystatus
	 */
	public final void setCapabilityStatus(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String capabilitystatus)
	{
		getMendixObject().setValue(context, MemberNames.CapabilityStatus.toString(), capabilitystatus);
	}

	/**
	 * @return value of Service
	 */
	public final java.lang.String getService()
	{
		return getService(getContext());
	}

	/**
	 * @param context
	 * @return value of Service
	 */
	public final java.lang.String getService(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Service.toString());
	}

	/**
	 * Set value of Service
	 * @param service
	 */
	public final void setService(java.lang.String service)
	{
		setService(getContext(), service);
	}

	/**
	 * Set value of Service
	 * @param context
	 * @param service
	 */
	public final void setService(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String service)
	{
		getMendixObject().setValue(context, MemberNames.Service.toString(), service);
	}

	/**
	 * @return value of ServicePlanId
	 */
	public final java.lang.String getServicePlanId()
	{
		return getServicePlanId(getContext());
	}

	/**
	 * @param context
	 * @return value of ServicePlanId
	 */
	public final java.lang.String getServicePlanId(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ServicePlanId.toString());
	}

	/**
	 * Set value of ServicePlanId
	 * @param serviceplanid
	 */
	public final void setServicePlanId(java.lang.String serviceplanid)
	{
		setServicePlanId(getContext(), serviceplanid);
	}

	/**
	 * Set value of ServicePlanId
	 * @param context
	 * @param serviceplanid
	 */
	public final void setServicePlanId(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String serviceplanid)
	{
		getMendixObject().setValue(context, MemberNames.ServicePlanId.toString(), serviceplanid);
	}

	/**
	 * @return value of AssignedPlans_User
	 */
	public final msgraphconnector.proxies.User getAssignedPlans_User() throws com.mendix.core.CoreException
	{
		return getAssignedPlans_User(getContext());
	}

	/**
	 * @param context
	 * @return value of AssignedPlans_User
	 */
	public final msgraphconnector.proxies.User getAssignedPlans_User(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		msgraphconnector.proxies.User result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.AssignedPlans_User.toString());
		if (identifier != null)
			result = msgraphconnector.proxies.User.load(context, identifier);
		return result;
	}

	/**
	 * Set value of AssignedPlans_User
	 * @param assignedplans_user
	 */
	public final void setAssignedPlans_User(msgraphconnector.proxies.User assignedplans_user)
	{
		setAssignedPlans_User(getContext(), assignedplans_user);
	}

	/**
	 * Set value of AssignedPlans_User
	 * @param context
	 * @param assignedplans_user
	 */
	public final void setAssignedPlans_User(com.mendix.systemwideinterfaces.core.IContext context, msgraphconnector.proxies.User assignedplans_user)
	{
		if (assignedplans_user == null)
			getMendixObject().setValue(context, MemberNames.AssignedPlans_User.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.AssignedPlans_User.toString(), assignedplans_user.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return userAssignedPlansMendixObject;
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
			final msgraphconnector.proxies.UserAssignedPlans that = (msgraphconnector.proxies.UserAssignedPlans) obj;
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
		return "MSGraphConnector.UserAssignedPlans";
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
