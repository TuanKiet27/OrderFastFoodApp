//package utils;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//
//public class DatabaseConnection {
//	private static final String URL = "jdbc:sqlserver://DESKTOP-B61GCPS\\SA:1433;databaseName=FastFoodOrder";
//    private static final String USER = "sa";
//    private static final String PASSWORD = "123"; 
//    public static Connection getConnection() {
//        try {
//            return DriverManager.getConnection(URL, USER, PASSWORD);
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
//}
