package io.onedev.server.plugin.authenticator.ldap;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LdapAuthenticatorTest {

	@Test
	public void test() {
		LdapAuthenticator authenticator = new LdapAuthenticator();

		assertEquals(authenticator.printClassName(), "LOG8371");
	}

}
