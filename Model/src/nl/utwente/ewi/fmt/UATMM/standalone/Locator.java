package nl.utwente.ewi.fmt.UATMM.standalone;

import java.net.URI;
import java.net.URISyntaxException;

public class Locator
{
	public static java.net.URI getURI()
	{
		URI binUri;
		URI uri = null;
		try {
			binUri = ATTMain.class.getResource("").toURI();


			if (binUri.toString().indexOf("bin") > -1) {
				uri = new URI(binUri.toString().replaceAll("bin/.*", "data/"));

			} else {
				uri = new URI(binUri.toString().replaceAll("nl/.*", "data/"));
			}
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}

		return uri;
	}
}
