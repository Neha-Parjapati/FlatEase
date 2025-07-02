package DAO;
import util.DBconnection;

import java.sql.*;
public class flat {
    Connection conn;

    public flat() {
        conn = DBconnection.getConnection();
        if (conn == null) {
            throw new RuntimeException("Failed to connect to DB. Check DBconnection.getConnection()");
        }
    }

    public void availableflats() {
        try{
        PreparedStatement p1 = conn.prepareStatement("select * from availflats");
        ResultSet rs = p1.executeQuery();
        while (rs.next()) {
            System.out.println("location  :   " + rs.getString("location") +
                    "   building_no  :  " + rs.getString("building_name") +
                    "   floor_no  :  " + rs.getString("floor_no") +
                    "   category  :   " + rs.getString("category") +
                    "   availfor  :  " + rs.getString("availfor") +
                    "   conditioning  :  " + rs.getString("conditioning"));
        }}
        catch (Exception e) {
            e.printStackTrace();
        }
    }

//
//
        public void registerBuyer(int buyer_id, String buyer_name,String address,String contact_details, String email, int flatId) {
            try {
                PreparedStatement ps = conn.prepareStatement( "INSERT INTO buyers(buyer_id, buyer_name,address,contact_details, email, flatId) VALUES (?, ?, ?, ?,?,?)");
                ps.setInt(1, buyer_id);
                ps.setString(2,buyer_name);
                ps.setString(3,address);
                ps.setString(4,contact_details);
                ps.setString(5, email);
                ps.setInt(6, flatId);
                ps.executeUpdate();
                System.out.println("Buyer registered successfully.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        public void updateBuyer(int buyer_Id, String newname) {

        try {
                String sql = "UPDATE Buyers SET buyer_name = ? WHERE buyer_id = ?";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, newname);
                ps.setInt(2, buyer_Id);
                int rowsaffected=ps.executeUpdate();
            if(rowsaffected>0) {
                System.out.println("Buyer name updated.");
            }
            else System.out.println("no such record in database");

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    public void updateBuyer2(int buyer_id, String newAddress) {

        try {
            String sql = "UPDATE Buyers SET address = ? WHERE buyer_id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, newAddress);
            ps.setInt(2, buyer_id);
            int rowsaffected2=ps.executeUpdate();
            if(rowsaffected2>0) {
                System.out.println("Buyer address updated.");
            }
            else System.out.println("no such record in database");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void updateBuyer3(int buyer_id, String newcontact) {

        try {
            String sql = "UPDATE Buyers SET contact_details = ? WHERE buyer_id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, newcontact);
            ps.setInt(2, buyer_id);
            int rowsaffected3=ps.executeUpdate();
            if(rowsaffected3>0) {
                System.out.println("Buyer contact_details updated.");
            }
            else System.out.println("no such record in database");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void updateBuyer4(int buyer_id, String newEmail) {

        try {
            String sql = "UPDATE Buyers SET email = ? WHERE buyer_id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, newEmail);
            ps.setInt(2, buyer_id);
            int rowsaffected4=ps.executeUpdate();
            if(rowsaffected4>0) {
                System.out.println("Buyer email updated.");
            }
            else System.out.println("no such record in database");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void updateBuyer5(int buyer_id, String newflatId) {

        try {
            String sql = "UPDATE Buyers SET flatId = ? WHERE buyer_id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, newflatId);
            ps.setInt(2, buyer_id);
            int rowsaffected5=ps.executeUpdate();
            if(rowsaffected5>0) {
                System.out.println("Buyer flatId  updated.");
            }
            else System.out.println("no such record in database");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
//
        public void deleteBuyer(int buyer_id) {
            try {
                String sql = "DELETE FROM Buyers WHERE buyer_id = ?";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setInt(1, buyer_id);
                ps.executeUpdate();
                System.out.println("Buyer deleted.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
