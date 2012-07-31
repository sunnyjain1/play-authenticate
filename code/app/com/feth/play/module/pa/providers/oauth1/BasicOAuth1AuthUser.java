package com.feth.play.module.pa.providers.oauth1;

import com.feth.play.module.pa.user.AuthUser;
import com.feth.play.module.pa.user.BasicIdentity;

public abstract class BasicOAuth1AuthUser extends OAuth1AuthUser implements
		BasicIdentity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BasicOAuth1AuthUser(final String id, final OAuth1AuthInfo info,
			final String state) {
		super(id, info, state);
	}

	@Override
	public String toString() {
		return AuthUser.toString(this);
	}

}