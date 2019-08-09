
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author hp
 */
@ManagedBean
@RequestScoped
public class RegistratrationForm {

    public RegistratrationForm() {

    }

    private String firstName;
    private String lastName;
    private String gender;
    private String address;
    private String contactNumber;
    private String emailID;
    private String userID;
    private String password;
    private String confirmedPassword;
    private Date datofBirth;
    private String FinalPassword;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmedPassword() {
        return confirmedPassword;
    }

    public void setConfirmedPassword(String confirmedPassword) {
        this.confirmedPassword = confirmedPassword;
    }

    public Date getDatofBirth() {
        return datofBirth;
    }

    public void setDatofBirth(Date datofBirth) {
        this.datofBirth = datofBirth;
    }

    public String getFinalPassword() {
        return FinalPassword;
    }

    public void setFinalPassword(String FinalPassword) {
        this.FinalPassword = FinalPassword;
    }

    public void validateEmail(FacesContext fc, UIComponent c, Object value) throws ValidatorException {
        String email = (String) value;
        Pattern mask = null;
        mask = Pattern.compile(".+@.+\\.[a-z]+");
        Matcher matcher = mask.matcher(email);
        if (!matcher.matches()) {
            FacesMessage message = new FacesMessage();
            message.setDetail("Invalid e-mail ID");
            message.setSummary("Invalid e-mail ID");
            throw new ValidatorException(message);
        }

    }
    public void validateName(FacesContext fc,UIComponent c, Object value)
    {
    
        if(
            ((String)value).contains("!")||((String)value).contains("@")||((String)value).contains("#")||((String)value).contains("$")||((String)value).contains("%")||((String)value).contains("&")||((String)value).contains("*")) throw new  ValidatorException(
                         new FacesMessage("Name cannot contain special characters"));
        
            
    }

    public void validateFinalPassword(FacesContext fc, UIComponent c, Object value) throws ValidatorException {
        setFinalPassword((String) value);
    }

    public void validateCPassword(FacesContext fc, UIComponent c, Object value) throws ValidatorException {
        String cPassword = (String) value;
        RegistratrationForm rf = new RegistratrationForm();
        System.out.println(getFinalPassword());
        if (cPassword.compareTo(getFinalPassword()) != 0) {
            FacesMessage message = new FacesMessage();
            message.setSummary("Password does not match");
            throw new ValidatorException(message);

        }

    }

}