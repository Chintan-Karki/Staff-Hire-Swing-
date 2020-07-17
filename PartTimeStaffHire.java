//Class FullTimeStaffHire that inherits from Class StaffHire
public class PartTimeStaffHire extends StaffHire{
        //Attributes
	private int workingHour;
	private int wagesPerHour;
	private String staffName;
	private String joiningDate;
	private String qualification;
	private String appointedBy;
	private String shifts;
	private boolean joined;
	private boolean terminated;
	
	public PartTimeStaffHire(int vacancyNumber, String designation,String jobType,int workingHour,int wagesPerHour,String shifts){
		super(vacancyNumber, designation, jobType);
		this.workingHour = workingHour;
		this.wagesPerHour = wagesPerHour;
		this.shifts = shifts;
		staffName = "";
		joiningDate = "";
		qualification = "";
		appointedBy = "";
		joined = false;
		terminated = false; 
	}

	
	//Accessor Methods
	//Getters
	
	public int getWagesPerHour(){
		return wagesPerHour;
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
	public String getShifts(){
		return shifts;
	}
	public boolean getTerminated(){
		return terminated;
	}
	public boolean getJoined(){
		return joined;
	}

	//Setters
	public void setShifts(String shifts){
		if (getJoined() != true){
			this.shifts = shifts;
		}else{
		  System.out.println("You cannot set new shift. Shift has already been assigned");
		  }
	}
	public void setWorkingHour(int workingHour){
		this.workingHour = workingHour;	
	}
	public void setWagesPerHour(int wagesPerHour){
		this.wagesPerHour = wagesPerHour;	
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
	public void setTerminated(boolean terminated){
		this.terminated = terminated;
	}
	
	

	public void partTimeStaffHire(String staffName, String joiningDate, String qualification, String appointedBy){
		if (getJoined() == true){
			System.out.println(getStaffName()+" has already been appointed on "+getJoiningDate()); 
		}else{
			this.staffName = staffName;
			this.joiningDate = joiningDate;
			this.qualification = qualification;
			this.appointedBy = appointedBy;
			joined = true;
			terminated = false;
		}
	}

	public void terminateStaff(){
	    if (getTerminated() == true){
	        System.out.println("Sorry,the staff has already been terminated. "); 
		}else{  
		    staffName = "";
		    joiningDate = "";
		    qualification = "";
		    appointedBy = "";
		    joined = false;
		    terminated = true;
		}
	}

	public int incomePerDay(){
		return getWagesPerHour()*getWorkingHour();
	}
	//Display Method
	public void displayStaffDetails(){
		
		if (getJoined() == true){		
		System.out.println();
	        super.displayStaffDetails();
		//System.out.println("----------x-----------x--------");
		System.out.println("Staff Name is: "+getStaffName());
		System.out.println("Wages Per Hour is : "+getWagesPerHour());
		System.out.println("Working Hour: "+getWorkingHour());
		System.out.println("Joined Company On: "+getJoiningDate());
		System.out.println("Qualifications: "+getQualification());	
		System.out.println("Appointed By: "+getAppointedBy());	
		System.out.println("Income per day is calculated to be:"+incomePerDay());		
		System.out.println("----------x-----------x--------");
		System.out.println(); 
		}		
	}
} 