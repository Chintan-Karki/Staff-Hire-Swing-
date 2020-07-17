//Class Staffhire:

public class StaffHire{
	//Attributes
	private int vacancyNumber;
	private String designation;
	private String jobType; //Job Type indicates part time or full time job

	//Constructor
	public StaffHire(int vacancyNumber, String designation,String jobType){
		this.vacancyNumber= vacancyNumber;
		this.designation = designation;
		this.jobType = jobType; 
	}
	
	//Accessor methods
	//Getter
	public int getVacancyNumber(){
		return vacancyNumber;
	}
	public String getDesignation(){
		return designation;
	}
	public String getJobType(){
		return jobType;
	}


	//Setter
	public void setVacancyNumber(int vacancyNumber){
		this.vacancyNumber = vacancyNumber;
	}
	public void setDesignation(String designation){
		this.designation = designation;
	}
	public void setJobType(String jobType){
		this.jobType = jobType;
	}

	//Display Method
	public void displayStaffDetails(){
		System.out.println();
		System.out.println("----------x-----------x--------");
		System.out.println("Vacancy Number: "+getVacancyNumber());
		System.out.println("Designation : "+getDesignation());
		System.out.println("Job Type: "+getJobType());		
		System.out.println("----------x-----------x--------");
		System.out.println();
	}
		

}