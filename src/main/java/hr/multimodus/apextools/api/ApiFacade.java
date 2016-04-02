package hr.multimodus.apextools.api;

import org.springframework.beans.factory.annotation.Autowired;

import hr.multimodus.apextools.Package;
import hr.multimodus.apextools.manifest.Manifest;
import hr.multimodus.apextools.session.ApiSession;
import hr.multimodus.apextools.userprefs.UserPrefs;

public class ApiFacade {
	@Autowired
	private UserPrefs userPrefs;

	private ApiSession session;

	public ApiFacade(ApiSession session) {
		this.session = session;
	}

	public static void getFromOrg(Manifest manifest) {

	}

	public static void getFromOrg(Package pkg) {

	}
}
