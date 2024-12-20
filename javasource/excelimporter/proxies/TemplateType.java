// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package excelimporter.proxies;

public enum TemplateType
{
	Normal(new java.lang.String[][] { new java.lang.String[] { "en_US", "Normal" }, new java.lang.String[] { "nl_NL", "Normaal" }, new java.lang.String[] { "en_GB", "Normal" }, new java.lang.String[] { "en_ZA", "Normal" } }),
	Wizard(new java.lang.String[][] { new java.lang.String[] { "en_US", "Wizard" }, new java.lang.String[] { "nl_NL", "Wizard" }, new java.lang.String[] { "en_GB", "Wizard" }, new java.lang.String[] { "en_ZA", "Wizard" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private TemplateType(java.lang.String[][] captionStrings)
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
