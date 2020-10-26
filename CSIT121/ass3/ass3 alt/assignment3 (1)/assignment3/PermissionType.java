package assignment3;

enum PermissionType {
    Edit("Allow to view or edit", 1),
    Booking("Only allow to view and book the service", 2),
    View("Only allow to view services", 3),
    None("Don't have any permission", 5);
    private String name;
    private int id;
    
    PermissionType(String name, int id){
        this.name = name;
        this.id = id;
    }
    
    @Override
    public String toString() {
        return name+", id: "+id;
    }
    public String getName(){
        return name;
    }
    
    public int getId() {
        return id;
    }
}
