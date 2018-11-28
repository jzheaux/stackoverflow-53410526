package com.example.permissionevaluator;

import java.io.Serializable;

import org.springframework.security.access.PermissionEvaluator;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

@Component
public class CustomPermissionEvaluator implements PermissionEvaluator {

	@Override
	public boolean hasPermission(Authentication auth, Object targetDomainObject, Object permission) {
		return true;
	}

	@Override
	public boolean hasPermission(Authentication authentication, Serializable serializable, String s, Object o) {
		return true;
	}
}
