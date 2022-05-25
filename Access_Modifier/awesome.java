public class awesome {
    /**
     * Assign and print the roll number, phone number and address of two
students having names "Sam" and "John" respectively by creating two
objects of class 'Student•
     */
    int rollNumber;
    String address;
    public static void main(String[] args) {
        awesome sam = new awesome();
        awesome jhon = new awesome();
        sam.address="Jaulakhel, kathmandu";
        sam.rollNumber=22;
        jhon.address = "Buddhanagar, Kathmandu";
        jhon.rollNumber = 33;

        System.out.println("Address of sam: " +sam.address+ "and Roll number of sam: "+sam.rollNumber);
        System.out.println("Address of sam: " +jhon.address+ "and Roll number of sam: "+jhon.rollNumber);
    }
    
}
