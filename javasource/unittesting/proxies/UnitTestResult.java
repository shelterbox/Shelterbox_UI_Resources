// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package unittesting.proxies;

public enum UnitTestResult
{
	_1_Running(new java.lang.String[][] { new java.lang.String[] { "en_US", "Running" }, new java.lang.String[] { "en_GB", "Running" } }),
	_2_Failed(new java.lang.String[][] { new java.lang.String[] { "en_US", "Failed" }, new java.lang.String[] { "en_GB", "Failed" } }),
	_3_Success(new java.lang.String[][] { new java.lang.String[] { "en_US", "Success" }, new java.lang.String[] { "en_GB", "Success" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private UnitTestResult(java.lang.String[][] captionStrings)
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
