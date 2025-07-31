public class Worker {
    protected String name;
    protected String birthDate;
    protected String endDate; //Because this will be set dynamically by a method or a SubClass

    public Worker(String name, String date){
        this.name = name;
        this.birthDate = date;
    }

    public String toString(){
        return "name{Name = " + name + " Birth Date: = " + birthDate + "EndDate: = " + endDate + " }";
    }

    public int getAge(){

        int currentYear = 2025;
        int birthYear = Integer.parseInt(birthDate.substring(6));
        return (currentYear - birthYear);
    }

    public double collectPay(){
        return 0.0d;
    }

    // Worker Method for setting the Retire Date:
    public void terminate(String endDate){
        this.endDate = endDate;
    }
}
