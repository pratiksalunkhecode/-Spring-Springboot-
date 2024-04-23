package com.gfg_l12_JDBC_Ope.CRUD.Operation;

import java.sql.*;

public class CRUD_Ope {

    public static void main(String[] args) {

       // Initialize variables for database connection
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/jbdl65"; //URL to connect to the MySQL database
        String user = "root"; // Username for the database
        String password = "root"; // password for the database
        int temp;


        try {
            // Establish a database connection
            con = dbconnection(url,user,password);
            //create table in database
          //  createTable(con);   pass here method and execute
           // insertRecord(con);
          //  selectQuery(con);

            updateRecordPS(con, 1,"uss");
            updateRecordPS(con, 1,"uss3");
            selectQueryUpdate(con);
            deleteRecordPS(con,9926);

            for(int i=0;i<10;i++) {
				temp = getRandomNumber();
				insertRecordPS(con,temp,"First "+temp,"Last "+temp,"us");
			}
        } catch (SQLException e) {
            e.printStackTrace(); // Print any SQL exceptions that occur
        }
    }

    // Method to establish a database connection
    public static Connection dbconnection(String url,String user,String password) {
        Connection con = null;
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create a connection to the MySQL database
            con = DriverManager.getConnection(url, user, password);

        } catch (ClassNotFoundException e) {
           // throw new RuntimeException(e); // Throw a runtime exception if the driver class is not found
            e.printStackTrace();
        } catch (SQLException e) {
           // throw new RuntimeException(e); // Throw a runtime exception if a SQL exception occurs
            e.printStackTrace();
        }
        return con;  // Return the database connection
    }

    // Method to create a table in the database
    public static void createTable(Connection con) throws SQLException{

//        String tableName = "registration";
//        DatabaseMetaData metadata = con.getMetaData();
//        ResultSet resultSet = metadata.getTables(null, null, tableName, null);
//        if (resultSet.next()) {
//            System.out.println("Table '" + tableName + "' already exists");
//            return;
//        }

        // SQL query to create a table named 'registration' in the 'jbdl65' database
        String sql="CREATE TABLE IF NOT EXISTS `registeration`  (" +
                "  `id` INT NOT NULL," +
                "  `first_name` VARCHAR(45) NOT NULL," +
                "  `Last_name` VARCHAR(45) NOT NULL," +
                "  `address` VARCHAR(45) NOT NULL," +
                "  PRIMARY KEY (`id`));";

        // Create a statement object to execute SQL queries
        Statement stmt = con.createStatement();

        // Execute the SQL query to create the table
        stmt.execute(sql);

        // Print a message indicating that the table was created successfully
        System.out.println("Table create successfully");
    }

    //JDBC Driver Selection type1, type2, type3 type4
    //Adding JDBC Driver to Classpath --Explain that the JDBC driver JAR file needs to be added to the project's classpath.
     //Load JDBC Driver
    //Establish Database Connection
    //Execute SQL Queries
    //Create Statement
    //Process Results:
    //Close Resources

    public static int insertRecord(Connection con) throws SQLException {

        String sql = "insert into registration values(6,'pratik','salunkhe','us')";

        Statement stmt = con.createStatement();
        int result = stmt.executeUpdate(sql);
        System.out.println("insert result"+result);
        return result;


    }

    public static int insertRecordPS(Connection con,int id, String first_name, String Last_name, String address) throws SQLException {

        String sql = "insert into registration values(?,?,?,?)";

        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.setString(2, first_name);
        stmt.setString(3,Last_name);
        stmt.setString(4, address);


       int result = stmt.executeUpdate();
        System.out.println("insert result"+result);
        return result;


    }


    public static int updateRecordPS(Connection con,int id, String address) throws SQLException {

        String sql = "Update registration set address = ? where id = ?;";

        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, address);
        stmt.setInt(2, id);


        int result = stmt.executeUpdate();
        System.out.println("Update result"+result);
        return result;


    }

    public static int deleteRecordPS(Connection con,int id) throws SQLException {

        String sql = "delete from registration where id = ?;";

        PreparedStatement pstmt = con.prepareStatement(sql);

        pstmt.setInt(1, id);


        int result = pstmt.executeUpdate();
        System.out.println("deletion result"+result);
        return result;


    }

    public static void updateRecordPSRS(Connection con,int id, String address) throws SQLException {

        String sql = "Update registration set address = ? where id = ?;";

        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, address);
        pstmt.setInt(2, id);

        int result = pstmt.executeUpdate();
        System.out.println("Update result"+result);

        String sql2 = "select * from registration where id = 1";
        Statement stmt = con.createStatement();
        ResultSet rs = pstmt.executeQuery(sql2);
        System.out.println(rs.getRow());
        System.out.println("*****************************************************");
        System.out.println("ID            First Name      Last Name          Age ");


        while(rs.next()) {
            System.out.println(rs.getInt(1)+"            "+rs.getString(2)+"      "+rs.getString(3)+"          "+rs.getInt(4)+" Row Number:"+rs.getRow());

        }


        System.out.println("*****************************************************");

        rs.close();
        pstmt.close();


    }
// Result SET

    public static void selectQuery(Connection con) throws SQLException {

        String sql = "select * from registration";

        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = stmt.executeQuery(sql);
        System.out.println(rs.getRow());
        System.out.println("**************************************************");
        System.out.println("id              firstname     Lastname        address");
       // rs.absolute(26);
        while (rs.next()) {
            System.out.println(rs.getInt(1) + "             " + rs.getString(2) + "        " + rs.getString(3) + "     " + rs.getString(4) + "   " + rs.getRow());
        }
    }

    public static void selectQueryUpdate(Connection con) throws SQLException {

        String sql = "select * from registration";

        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = stmt.executeQuery(sql);
        System.out.println(rs.getRow());
        System.out.println("**************************************************");
        System.out.println("id              firstname     Lastname        address");
        // rs.absolute(26);
        while (rs.next()){
            if(rs.getInt(1)==5){
                rs.updateInt(4,100);
                rs.updateRow();
            }
            System.out.println(rs.getInt(1)+"             "+rs.getString(2)+"        "+rs.getString(3)+"     "+rs.getString(4)+"   "+rs.getRow());
        }



    }

    private static int getRandomNumber() {
        int min =1, max = 10000;
        return (int) ((Math.random() * (max - min)) + min);
    }



}
// see 57.26 for Statement