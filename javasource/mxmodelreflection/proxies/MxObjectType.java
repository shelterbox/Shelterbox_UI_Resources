// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package mxmodelreflection.proxies;

public class MxObjectType
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject mxObjectTypeMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MxModelReflection.MxObjectType";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		CompleteName("CompleteName"),
		Name("Name"),
		Module("Module"),
		ReadableName("ReadableName"),
		PersistenceType("PersistenceType"),
		MxObjectType_SubClassOf_MxObjectType("MxModelReflection.MxObjectType_SubClassOf_MxObjectType"),
		MxObjectType_Module("MxModelReflection.MxObjectType_Module");

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

	public MxObjectType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MxModelReflection.MxObjectType"));
	}

	protected MxObjectType(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mxObjectTypeMendixObject)
	{
		if (mxObjectTypeMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MxModelReflection.MxObjectType", mxObjectTypeMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MxModelReflection.MxObjectType");

		this.mxObjectTypeMendixObject = mxObjectTypeMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'MxObjectType.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static mxmodelreflection.proxies.MxObjectType initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return mxmodelreflection.proxies.MxObjectType.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static mxmodelreflection.proxies.MxObjectType initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new mxmodelreflection.proxies.MxObjectType(context, mendixObject);
	}

	public static mxmodelreflection.proxies.MxObjectType load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return mxmodelreflection.proxies.MxObjectType.initialize(context, mendixObject);
	}

	public static java.util.List<mxmodelreflection.proxies.MxObjectType> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<mxmodelreflection.proxies.MxObjectType> result = new java.util.ArrayList<mxmodelreflection.proxies.MxObjectType>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MxModelReflection.MxObjectType" + xpathConstraint))
			result.add(mxmodelreflection.proxies.MxObjectType.initialize(context, obj));
		return result;
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
	 * @return value of CompleteName
	 */
	public final java.lang.String getCompleteName()
	{
		return getCompleteName(getContext());
	}

	/**
	 * @param context
	 * @return value of CompleteName
	 */
	public final java.lang.String getCompleteName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.CompleteName.toString());
	}

	/**
	 * Set value of CompleteName
	 * @param completename
	 */
	public final void setCompleteName(java.lang.String completename)
	{
		setCompleteName(getContext(), completename);
	}

	/**
	 * Set value of CompleteName
	 * @param context
	 * @param completename
	 */
	public final void setCompleteName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String completename)
	{
		getMendixObject().setValue(context, MemberNames.CompleteName.toString(), completename);
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
	 * @return value of Module
	 */
	public final java.lang.String getModule()
	{
		return getModule(getContext());
	}

	/**
	 * @param context
	 * @return value of Module
	 */
	public final java.lang.String getModule(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Module.toString());
	}

	/**
	 * Set value of Module
	 * @param module
	 */
	public final void setModule(java.lang.String module)
	{
		setModule(getContext(), module);
	}

	/**
	 * Set value of Module
	 * @param context
	 * @param module
	 */
	public final void setModule(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String module)
	{
		getMendixObject().setValue(context, MemberNames.Module.toString(), module);
	}

	/**
	 * @return value of ReadableName
	 */
	public final java.lang.String getReadableName()
	{
		return getReadableName(getContext());
	}

	/**
	 * @param context
	 * @return value of ReadableName
	 */
	public final java.lang.String getReadableName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ReadableName.toString());
	}

	/**
	 * Set value of ReadableName
	 * @param readablename
	 */
	public final void setReadableName(java.lang.String readablename)
	{
		setReadableName(getContext(), readablename);
	}

	/**
	 * Set value of ReadableName
	 * @param context
	 * @param readablename
	 */
	public final void setReadableName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String readablename)
	{
		getMendixObject().setValue(context, MemberNames.ReadableName.toString(), readablename);
	}

	/**
	 * Set value of PersistenceType
	 * @param persistencetype
	 */
	public final mxmodelreflection.proxies.PersistenceType getPersistenceType()
	{
		return getPersistenceType(getContext());
	}

	/**
	 * @param context
	 * @return value of PersistenceType
	 */
	public final mxmodelreflection.proxies.PersistenceType getPersistenceType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.PersistenceType.toString());
		if (obj == null)
			return null;

		return mxmodelreflection.proxies.PersistenceType.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of PersistenceType
	 * @param persistencetype
	 */
	public final void setPersistenceType(mxmodelreflection.proxies.PersistenceType persistencetype)
	{
		setPersistenceType(getContext(), persistencetype);
	}

	/**
	 * Set value of PersistenceType
	 * @param context
	 * @param persistencetype
	 */
	public final void setPersistenceType(com.mendix.systemwideinterfaces.core.IContext context, mxmodelreflection.proxies.PersistenceType persistencetype)
	{
		if (persistencetype != null)
			getMendixObject().setValue(context, MemberNames.PersistenceType.toString(), persistencetype.toString());
		else
			getMendixObject().setValue(context, MemberNames.PersistenceType.toString(), null);
	}

	/**
	 * @return value of MxObjectType_SubClassOf_MxObjectType
	 */
	public final java.util.List<mxmodelreflection.proxies.MxObjectType> getMxObjectType_SubClassOf_MxObjectType() throws com.mendix.core.CoreException
	{
		return getMxObjectType_SubClassOf_MxObjectType(getContext());
	}

	/**
	 * @param context
	 * @return value of MxObjectType_SubClassOf_MxObjectType
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<mxmodelreflection.proxies.MxObjectType> getMxObjectType_SubClassOf_MxObjectType(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<mxmodelreflection.proxies.MxObjectType> result = new java.util.ArrayList<mxmodelreflection.proxies.MxObjectType>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.MxObjectType_SubClassOf_MxObjectType.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(mxmodelreflection.proxies.MxObjectType.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of MxObjectType_SubClassOf_MxObjectType
	 * @param mxobjecttype_subclassof_mxobjecttype
	 */
	public final void setMxObjectType_SubClassOf_MxObjectType(java.util.List<mxmodelreflection.proxies.MxObjectType> mxobjecttype_subclassof_mxobjecttype)
	{
		setMxObjectType_SubClassOf_MxObjectType(getContext(), mxobjecttype_subclassof_mxobjecttype);
	}

	/**
	 * Set value of MxObjectType_SubClassOf_MxObjectType
	 * @param context
	 * @param mxobjecttype_subclassof_mxobjecttype
	 */
	public final void setMxObjectType_SubClassOf_MxObjectType(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<mxmodelreflection.proxies.MxObjectType> mxobjecttype_subclassof_mxobjecttype)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (mxmodelreflection.proxies.MxObjectType proxyObject : mxobjecttype_subclassof_mxobjecttype)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.MxObjectType_SubClassOf_MxObjectType.toString(), identifiers);
	}

	/**
	 * @return value of MxObjectType_Module
	 */
	public final mxmodelreflection.proxies.Module getMxObjectType_Module() throws com.mendix.core.CoreException
	{
		return getMxObjectType_Module(getContext());
	}

	/**
	 * @param context
	 * @return value of MxObjectType_Module
	 */
	public final mxmodelreflection.proxies.Module getMxObjectType_Module(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		mxmodelreflection.proxies.Module result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.MxObjectType_Module.toString());
		if (identifier != null)
			result = mxmodelreflection.proxies.Module.load(context, identifier);
		return result;
	}

	/**
	 * Set value of MxObjectType_Module
	 * @param mxobjecttype_module
	 */
	public final void setMxObjectType_Module(mxmodelreflection.proxies.Module mxobjecttype_module)
	{
		setMxObjectType_Module(getContext(), mxobjecttype_module);
	}

	/**
	 * Set value of MxObjectType_Module
	 * @param context
	 * @param mxobjecttype_module
	 */
	public final void setMxObjectType_Module(com.mendix.systemwideinterfaces.core.IContext context, mxmodelreflection.proxies.Module mxobjecttype_module)
	{
		if (mxobjecttype_module == null)
			getMendixObject().setValue(context, MemberNames.MxObjectType_Module.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.MxObjectType_Module.toString(), mxobjecttype_module.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return mxObjectTypeMendixObject;
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
			final mxmodelreflection.proxies.MxObjectType that = (mxmodelreflection.proxies.MxObjectType) obj;
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
		return "MxModelReflection.MxObjectType";
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
