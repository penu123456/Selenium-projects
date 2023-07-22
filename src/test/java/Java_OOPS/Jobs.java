package Java_OOPS;

public class Jobs {
	
	private String JobTitle,JoDescr,JobNote;

	public String getJobTitle() {
		return JobTitle;
	}

	public void setJobTitle(String jobTitle) {
		JobTitle = jobTitle;
	}

	public String getJoDescr() {
		return JoDescr;
	}

	public void setJoDescr(String joDescr) {
		JoDescr = joDescr;
	}

	public String getJobNote() {
		return JobNote;
	}

	public void setJobNote(String jobNote) {
		JobNote = jobNote;
	}
	
	
public void JobsData() {
		
		System.out.println("Job Title :"+JobTitle);
		System.out.println("Job Descr No :"+JoDescr);
		System.out.println("Job Note:"+JobNote);
		System.out.println("------------------------");
		
	}


}
