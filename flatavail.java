package beans;
import util.DBconnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class flatavail {
    private int location;
    private String building_name;
    private int floor_no;
    private int flat_no;
    private int category;
    private String availfor;
    private String conditioning;
    Connection conn;

    public flatavail(int location, String building_name, int floor_no, int flat_no, int category, String availfor, String conditioning, Connection conn) {
        this.location = location;
        this.building_name = building_name;
        this.floor_no = floor_no;
        this.flat_no = flat_no;
        this.category = category;
        this.availfor = availfor;
        this.conditioning = conditioning;
        this.conn = conn;
    }

    public flatavail() {
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public String getBuilding_name() {
        return building_name;
    }

    public void setBuilding_name(String building_name) {
        this.building_name = building_name;
    }

    public int getFloor_no() {
        return floor_no;
    }

    public void setFloor_no(int floor_no) {
        this.floor_no = floor_no;
    }

    public int getFlat_no() {
        return flat_no;
    }

    public void setFlat_no(int flat_no) {
        this.flat_no = flat_no;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getAvailfor() {
        return availfor;
    }

    public void setAvailfor(String availfor) {
        this.availfor = availfor;
    }

    public String getCondition() {
        return conditioning;
    }

    public void setCondition(String condition) {
        this.conditioning = condition;
    }

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }
}


