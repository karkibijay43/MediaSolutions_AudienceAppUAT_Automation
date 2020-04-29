package audienceAppManagers;

import audienceAppDataProvider.AudienceAppConfigFileReader;

public class AudienceAppFileReaderManager {

	private static AudienceAppFileReaderManager fileReaderManager = new AudienceAppFileReaderManager();
	private static AudienceAppConfigFileReader configFileReader;

	private AudienceAppFileReaderManager() {
	}

	public static AudienceAppFileReaderManager getInstance() {
		return fileReaderManager;
	}

	public AudienceAppConfigFileReader getConfigReader() {
		return (configFileReader == null) ? new AudienceAppConfigFileReader() : configFileReader;
	}
}
