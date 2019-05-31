package com.springunivers.util;

import org.hsqldb.util.DatabaseManagerSwing;

public class StartHSQLDB {
	private static String URL = "file:/home/joze/opendigytal/springunivers/database/springuniversdb\r\n"
			+ ";user=sa;password=sa";

	public static void main(String[] args) { // local();
		server();
		// local();
	}

	private static void local() {
		// final String[] dbArgs = { "--user", "sa", "--password", "sa", "--url",
		// "jdbc:hsqldb:" + URL };
		final String[] dbArgs = { "--url", "jdbc:hsqldb:" + URL };
		DatabaseManagerSwing.main(dbArgs);

	}

	private static void server() {
		final String[] dbArg = { "--database.0", URL, "--dbname.0", "springuniversdb", "--port", "5454" };
		org.hsqldb.server.Server.main(dbArg);

		// final String[] dbArgsServer = { "--user", "sa", "--password", "sa","--url",
		// "jdbc:hsqldb:hsql://localhost:5454/springuniversdb" };
		// DatabaseManagerSwing.main(dbArgsServer);
	}
}
