// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package mxmodelreflection.proxies;

public enum ReferenceType
{
	Reference(new java.lang.String[][] { new java.lang.String[] { "en_US", "Reference" }, new java.lang.String[] { "nl_NL", "Referentie" }, new java.lang.String[] { "en_GB", "Reference" }, new java.lang.String[] { "en_ZA", "Reference" } }),
	ReferenceSet(new java.lang.String[][] { new java.lang.String[] { "en_US", "Reference set" }, new java.lang.String[] { "nl_NL", "Reference set" }, new java.lang.String[] { "en_GB", "Reference set" }, new java.lang.String[] { "en_ZA", "Reference set" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private ReferenceType(java.lang.String[][] captionStrings)
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
