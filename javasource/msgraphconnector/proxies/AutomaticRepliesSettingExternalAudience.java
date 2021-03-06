// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package msgraphconnector.proxies;

public enum AutomaticRepliesSettingExternalAudience
{
	none(new java.lang.String[][] { new java.lang.String[] { "en_US", "none" }, new java.lang.String[] { "en_GB", "none" } }),
	contactsOnly(new java.lang.String[][] { new java.lang.String[] { "en_US", "contactsOnly" }, new java.lang.String[] { "en_GB", "contactsOnly" } }),
	all(new java.lang.String[][] { new java.lang.String[] { "en_US", "all" }, new java.lang.String[] { "en_GB", "all" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private AutomaticRepliesSettingExternalAudience(java.lang.String[][] captionStrings)
	{
		this.captions = new java.util.HashMap<java.lang.String, java.lang.String>();
		for (java.lang.String[] captionString : captionStrings)
			captions.put(captionString[0], captionString[1]);
	}

	public java.lang.String getCaption(java.lang.String languageCode)
	{
		if (captions.containsKey(languageCode))
			return captions.get(languageCode);
		return captions.get("en_GB");
	}

	public java.lang.String getCaption()
	{
		return captions.get("en_GB");
	}
}
