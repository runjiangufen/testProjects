// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package native_widgets.proxies;

public enum Enumeration
{
	First(new java.lang.String[][] { new java.lang.String[] { "en_US", "First" } }),
	Second(new java.lang.String[][] { new java.lang.String[] { "en_US", "Second" } }),
	Third(new java.lang.String[][] { new java.lang.String[] { "en_US", "Third" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private Enumeration(java.lang.String[][] captionStrings)
	{
		this.captions = new java.util.HashMap<java.lang.String, java.lang.String>();
		for (java.lang.String[] captionString : captionStrings)
			captions.put(captionString[0], captionString[1]);
	}

	public java.lang.String getCaption(java.lang.String languageCode)
	{
		if (captions.containsKey(languageCode))
			return captions.get(languageCode);
		return captions.get("en_US");
	}

	public java.lang.String getCaption()
	{
		return captions.get("en_US");
	}
}
