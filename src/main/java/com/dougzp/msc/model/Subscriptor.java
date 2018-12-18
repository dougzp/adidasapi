package com.dougzp.msc.model;

import java.util.Date;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Susbscriptor
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-12T16:56:00.547Z")

public class Subscriptor   {
  @JsonProperty("id")

  private Long id = null;

  @JsonProperty("email")
  @NotNull
  private String email = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("dateOfBith")
  @NotNull
  private Date dateOfBith = null;

  @JsonProperty("gender")
  private String gender = null;

  @JsonProperty("consent")
  @NotNull
  private Boolean consent = null;

  public Subscriptor id(Long id) {
    this.id = id;
    return this;
  }
  public Subscriptor() {

 }

  public Subscriptor(Long id,String email, String firstName,String gender, Date dateOfBith, Boolean consent) {
		super();
		this.id=id;
		this.email = email;
		this.firstName = firstName;
		this.gender = gender;
		this.dateOfBith = dateOfBith;
		this.consent = consent;
	}
  

  
  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "234", value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Subscriptor email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(example = "dougzp@gmail.com", value = "")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Subscriptor firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(example = "Douglas Piva", value = "")


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Subscriptor dateOfBith(Date dateOfBith) {
    this.dateOfBith = dateOfBith;
    return this;
  }

  /**
   * Get dateOfBith
   * @return dateOfBith
  **/
  @ApiModelProperty(example = "Douglas Piva", value = "")


  
  public Subscriptor gender(String gender) {
    this.gender = gender;
    return this;
  }

	public Date getDateOfBith() {
		return dateOfBith;
	}

	public void setDateOfBith(Date dateOfBith) {
		this.dateOfBith = dateOfBith;
	}

/**
   * Get gender
   * @return gender
  **/
  @ApiModelProperty(example = "Male", value = "")


  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public Subscriptor consent(Boolean consent) {
    this.consent = consent;
    return this;
  }

  /**
   * Get consent
   * @return consent
  **/
  @ApiModelProperty(example = "true", value = "")


  public Boolean isConsent() {
    return consent;
  }

  public void setConsent(Boolean consent) {
    this.consent = consent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Subscriptor susbscriptor = (Subscriptor) o;
    return Objects.equals(this.id, susbscriptor.id) &&
        Objects.equals(this.email, susbscriptor.email) &&
        Objects.equals(this.firstName, susbscriptor.firstName) &&
        Objects.equals(this.dateOfBith, susbscriptor.dateOfBith) &&
        Objects.equals(this.gender, susbscriptor.gender) &&
        Objects.equals(this.consent, susbscriptor.consent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, email, firstName, dateOfBith, gender, consent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Susbscriptor {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    dateOfBith: ").append(toIndentedString(dateOfBith)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    consent: ").append(toIndentedString(consent)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

