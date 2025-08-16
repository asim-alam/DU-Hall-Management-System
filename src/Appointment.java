import ...
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