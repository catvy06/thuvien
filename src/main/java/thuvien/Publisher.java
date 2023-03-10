package thuvien;

public class Publisher {
    private int id;
    private String name;
    private String address;
    private String phone;
    private String email;

    public Publisher(int id, String name, String address, String phone, String email) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private Publisher[] publishers;
    public void addPublisher(Publisher publisher){
        int index = -1;
        for (int i =0; i< publishers.length; i++){
            if (publishers[i] == null){
                index = i;
                break;
            }
        }

        if (index != -1) {
            publishers[index] = publisher;
        } else {
            System.out.println("Is full");
        }
    }
}
