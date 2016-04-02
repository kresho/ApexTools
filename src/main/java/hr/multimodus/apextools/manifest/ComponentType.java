package hr.multimodus.apextools.manifest;

public enum ComponentType {
	APEX_CLASS(1, "cls", "cls-meta.xml"), VISUALFORCE_PAGE(1, "page", "page-meta.xml");

	private int sinceApiLevel;
	private String defaultFileExtension;
	private String defaultMetaFileExtension;

	private ComponentType(int sinceApiLevel, String defaultFileExtension, String defaultMetaFileExtension) {
		this.sinceApiLevel = sinceApiLevel;
		this.defaultFileExtension = defaultFileExtension;
		this.defaultMetaFileExtension = defaultMetaFileExtension;
	}

	public int getSinceApiLevel() {
		return sinceApiLevel;
	}

	public String getDefaultFileExtension() {
		return defaultFileExtension;
	}

	public String getDefaultMetaFileExtension() {
		return defaultMetaFileExtension;
	}
}
