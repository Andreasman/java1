package net.staecker.javalernen;

import net.staecker.javalernen.exceptions.InstDataAuthorisationException;

public class LearnException {

	public static void main(String[] args) {

		authorisation("admin", "admin");

	}

	private static void authorisation(String username, String password) throws InstDataAuthorisationException {
		if ((username.equals("admin")) && (password.equals("admin"))) {
			System.out.println("Login erfolgreich...");
		} else {
			throw new InstDataAuthorisationException("Auth-Problem");
		}

	}
}
