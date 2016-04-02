package hr.multimodus.apextools.userprefs.defaults;

import org.springframework.stereotype.Component;

import hr.multimodus.apextools.userprefs.UserPrefs;

@Component
public class DefaultUserPrefs implements UserPrefs {
	@Override
	public boolean getPreferToolingApi() {
		return false;
	}
}
