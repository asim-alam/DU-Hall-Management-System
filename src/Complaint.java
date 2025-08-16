public class Complaint {
    private String complaintId;
    private String studentId;
    private String description;
    private boolean isResolved;

    public Complaint(String complaintId, String studentId, String description, boolean isResolved) {
        this.complaintId = complaintId;
        this.studentId = studentId;
        this.description = description;
        this.isResolved = isResolved;
    }

    public String getComplaintId() {
        return complaintId;
    }

    public void setComplaintId(String complaintId) {
        this.complaintId = complaintId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isResolved() {
        return isResolved;
    }

    public void setResolved(boolean resolved) {
        isResolved = resolved;
    }
}
