package com.languagefudametals;

public class BugTracker {
	int bugId=404;
	String ApplicationName="Ecart Portal";
	String BugTitle="Appliaction Name not Found";
	String severity="critical";
	String priority="high";
	String  status="In progress";
	String AssignedDeveloper = "Harika";
	static int getbugId(int bugId) {
		return bugId;
	}
	static String DisplayApp(String ApplicationName) {
		return ApplicationName;
	}
	static String DispBugTitle(String BugTitle) {
		return BugTitle;
	}
	static String DisplaySeverity(String severity) {
		return severity;
	}
	static String DisplayPriority(String priority) {
		return priority;
	}
	static String Displaystatus(String status) {
		return status;
	}
	static void AssignDevelopers(int bugId,String AssignedDeveloper) {
		System.out.println("The Assigned Developer for the bug id " + bugId +" is : " + AssignedDeveloper);
		
	}
	static String updateStatus(String status) {
		return status;
	}
	static void BugSummary(int bugId,String ApplicationName,String BugTitle,String severity,String priority,String status,String AssignedDeveloper) {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BugTracker b=new BugTracker();
		System.out.println("Bug id : " + getbugId(b.bugId));
		System.out.println("Bug Title : " +DispBugTitle(b.ApplicationName));
		System.out.println("Application name : " +DisplayApp(b.ApplicationName));
		System.out.println("severity : " + DisplaySeverity(b.severity));
		System.out.println("priority :" + DisplayPriority(b.priority));
		System.out.println("status : " +Displaystatus(b.status));
		AssignDevelopers(b.bugId, b.AssignedDeveloper);
		String status = "In Development";
		System.out.println("status changed :  " + updateStatus(status));
		
		
		
		
		
		

	}

}
