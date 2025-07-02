package beans;



public class buyers {
    private int buyer_id;
    private String buyer_name;
    private String address;
    private String contact_details;
    private String email;
    private int flatId;

    public buyers(int buyer_id, String buyer_name, String address, String contact_details, String email, int flatId) {
        this.buyer_id = buyer_id;
        this.buyer_name = buyer_name;
        this.address = address;
        this.contact_details = contact_details;
        this.email = email;
        this.flatId = flatId;
    }

    public buyers() {
    }

    public int getBuyer_id() {
        return buyer_id;
    }

    public void setBuyer_id(int buyer_id) {
        this.buyer_id = buyer_id;
    }

    public String getBuyer_name() {
        return buyer_name;
    }

    public void setBuyer_name(String buyer_name) {
        this.buyer_name = buyer_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact_details() {
        return contact_details;
    }

    public void setContact_details(String contact_details) {
        this.contact_details = contact_details;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getFlatId() {
        return flatId;
    }

    public void setFlatId(int flatId) {
        this.flatId = flatId;
    }
    
}
