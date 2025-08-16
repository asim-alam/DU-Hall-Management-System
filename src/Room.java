
Class Room implements Serializable{
    private String roomNumber;
    private int capacity;
    private List<String>occupants;

    public Room(String roomnumber,int capacity){
        this.roomNUmber=roomNumber;
        this.capacity=capacity;
        this.occupants= new Arraylist<>();

    }
    public string getRoomNUmber(){
        return roomNumber;
    }
    public int getCapacity(){
        return capacity;
    }
    public List<String>getOccupants(){
        return occupants;
    }
    public boolean isAvailable(){
        return occupants.size()<capacity;
    }
    public void addOcccupant(String studentId){
        if(isAvailable()){
            occupants.add(studentId);
        }
        else{
            throw new illegalStateException("Room is full");
        }
    }
    public void removeOccupant(String studentId){
        occupants.remove(StudentId);
    }
}