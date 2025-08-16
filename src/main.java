import ...
public class User {
    private String username;
    private String id;
    private String role;

    public User(String username, String id, String role) {
        this.username = username;
        this.id = id;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
public class Student {
    private String id;
    private String name;
    private String contact;
    private String fatherName;
    private String motherName;
    private String parmanentAddress;
    private String religion;
    private String bloodGroup;
    private int distance;
    private int merit;
    private int fatherMonthlyIncome;
    private String roomNumber;
    private String department;

    public Student(String id, String name, String contact, String fatherName, String motherName, String parmanentAddress, String religion, String bloodGroup, int distance, int merit, int fatherMonthlyIncome, String roomNumber, String department) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.parmanentAddress = parmanentAddress;
        this.religion = religion;
        this.bloodGroup = bloodGroup;
        this.distance = distance;
        this.merit = merit;
        this.fatherMonthlyIncome = fatherMonthlyIncome;
        this.roomNumber = roomNumber;
        this.department = department;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getParmanentAddress() {
        return parmanentAddress;
    }

    public void setParmanentAddress(String parmanentAddress) {
        this.parmanentAddress = parmanentAddress;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getMerit() {
        return merit;
    }

    public void setMerit(int merit) {
        this.merit = merit;
    }

    public int getFatherMonthlyIncome() {
        return fatherMonthlyIncome;
    }

    public void setFatherMonthlyIncome(int fatherMonthlyIncome) {
        this.fatherMonthlyIncome = fatherMonthlyIncome;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

class Appointment implements Serializable{
    private String appointmentId;
    private String StudentId;
    private String authority;
    private String date;
    private String time;
    private boolean isApproved;

    public Appointment(String appointmentId,String studentId){
        this.appointmentId=appointmentId;
        this.studnetId=studentId;
        this.authority=authority;
        this.data=data;
        this.time=time;
        this.isApproved=false;
    }
    public String getAppointmentId(){
        return appointmentId;
    }
    public String getStudentId(){
        return studentId;
    }
    public String getAuthority(){
        return authority;
    }
    public String getDate(){
        return date;
    }
    public String getTime(){
        return time;
    }
    public boolean isApproved(){
        return isApproved;
    }
    public void setApproved(boolean approved){
        this.isApproved=approved;
    }
}