package com.vilson.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingleConnection {

    private static String url = "jdbc:mysql://localhost:3306/blog_mysql";
    private static String user = "Developer";
    private static String password = "admin";
    private static Connection conn = null;

    static {
        conectar();
    }

    public SingleConnection() {
        conectar();
    }

    private static void conectar() {

        try {

            if (conn == null) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(url, user, password);
                conn.setAutoCommit(false);
                System.out.println("Testando conexão...");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return conn;
    }
}
