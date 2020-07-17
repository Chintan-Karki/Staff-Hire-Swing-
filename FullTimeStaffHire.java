//Class FullTimeStaffHire that inherits from Class StaffHire
public class FullTimeStaffHire extends StaffHire{
	//Attributes
	private int salary;
	private int workingHour;
	private String staffName;
	private String joiningDate;
	private String qualification;
	private String appointedBy;
	private boolean joined ; //either true or false (boolean)

	//Constructor
	public FullTimeStaffHire(int vacancyNumber, String designation,String jobType,int salary, int workingHour){
		super(vacancyNumber, designation, jobType);
		this.salary = salary;
		this.workingHour = workingHour;
		this.staffName = "";
		this.joiningDate= "";
		this.qualification = "";
		this.appointedBy = "";
		joined = false; 
	}

	public int getSalary(){
		return salary;
	}
	public int getWorkingHour(){
		return workingHour;
	}
	public String getStaffName(){
		return staffName;
	}
	public String getJoiningDate(){
		return joiningDate;
	}
	public String getQualification(){
		return qualification;
	}
	public String getAppointedBy(){
		return appointedBy;
	}
	public boolean getJoined(){
		return joined;
	}

	public void setSalary(int Salary){
		if (getJoined() == true){
			System.out.println(" Staff has already been appointed. Henceforth, Salary can't be changed"); 
		}else{
			this.salary = salary;
		}
	}

	public void setWorkingHour(int workingHour){
		this.workingHour = workingHour;
	}
	public void setStaffName(String staffName){
		this.staffName = staffName;
	}
	public void setJoiningDate(String joiningDate){
		this.joiningDate = joiningDate;
	}
	public void setQualification(String qualification){
		this.qualification = qualification;
	}
	public void setAppointedBy(String appointedBy){
		this.appointedBy = appointedBy;
	}
	public void setJoined(boolean joined){
		this.joined = joined;
	}

	public void fullTimeStaffHire(String staffName, String joiningDate, String qualification, String appointedBy){
		if (getJoined() == true){
		        System.out.println(getStaffName()+" has already been appointed on "+getJoiningDate()); 
		}else{
			this.staffName = staffName;
			this.joiningDate = joiningDate;
			this.qualification = qualification;
			this.appointedBy = appointedBy;
			joined = true;
		}
	}
	
	public void displayStaffDetails(){
	    System.out.println();
	    super.displayStaffDetails();
	    
			if (getJoined() == true){	
	            System.out.println();
		    //System.out.println("----------x-----------x--------");
		System.out.println("* Staff Name is: "+getStaffName());
		System.out.println("* Working Hour: "+getWorkingHour());
		System.out.println("* Joined Company On: "+getJoiningDate());
		System.out.println("* Qualifications: "+getQualification());	
		System.out.println("* Appointed By: "+getAppointedBy());			
		System.out.println("----------x-----------x--------");
		System.out.println(); 
	}
}
}