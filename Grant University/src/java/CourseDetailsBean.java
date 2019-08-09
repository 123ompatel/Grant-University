

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Named;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.event.ValueChangeEvent;


@ManagedBean
@RequestScoped
public class CourseDetailsBean {

    private String CourseName;
    private HtmlOutputText CourseId,CourseDuration,CourseEligibilty,CourseFee;
    public CourseDetailsBean() {}
    
    public void CourseDetailsAction(ValueChangeEvent vce)
    {
    
    String id=vce.getNewValue().toString();
    String cId=" ",cDuration=" ",cEligibilty=" ",cFee=" ";
    if(id.compareTo("Science")==0)     
    {
        cId="A-101";
        cDuration="4 years";
        cEligibilty="70% in high school";
        cFee="$5000 p.a.";
            
    }   
    else if(id.compareTo("Law")==0)
    {
        cId="A-105";
        cDuration="5 years";
        cEligibilty="60% in high school";
        cFee="$3000 p.a.";
    }
     else if(id.compareTo("Medical")==0)
    {
        cId="A-115";
        cDuration="6 years";
        cEligibilty="70% in high school";
        cFee="$7000 p.a.";
    } else if(id.compareTo("Management")==0)
    {
        cId="A-110";
        cDuration="2 years";
        cEligibilty="50% in high school";
        cFee="$5000 p.a.";
    }    
    getCourseId().setValue(cId);
    getCourseDuration().setValue(cDuration);
    getCourseEligibilty().setValue( cEligibilty);
    getCourseFee().setValue(cFee);
    
    
          
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
    }

    public HtmlOutputText getCourseId() {
        return CourseId;
    }

    public void setCourseId(HtmlOutputText CourseId) {
        this.CourseId = CourseId;
    }

    public HtmlOutputText getCourseDuration() {
        return CourseDuration;
    }

    public void setCourseDuration(HtmlOutputText CourseDuration) {
        this.CourseDuration = CourseDuration;
    }

    public HtmlOutputText getCourseEligibilty() {
        return CourseEligibilty;
    }

    public void setCourseEligibilty(HtmlOutputText CourseEligibilty) {
        this.CourseEligibilty = CourseEligibilty;
    }

    public HtmlOutputText getCourseFee() {
        return CourseFee;
    }

    public void setCourseFee(HtmlOutputText CourseFee) {
        this.CourseFee = CourseFee;
    }
    
    
}
