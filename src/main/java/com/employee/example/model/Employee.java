package com.employee.example.model;

import java.util.Objects;
import com.employee.example.model.Details;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Employee
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-09-12T19:18:35.042+05:30")


public class Employee  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("jobTitle")
  private String jobTitle = null;

  @JsonProperty("mobileNo")
  private String mobileNo = null;

  @JsonProperty("joinedDate")
  private LocalDate joinedDate = null;

  /**
   * Gets or Sets gender
   */
  public enum GenderEnum {
    MALE("male"),
    
    FEMALE("female"),
    
    OTHER("other");

    private String value;

    GenderEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static GenderEnum fromValue(String text) {
      for (GenderEnum b : GenderEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("gender")
  private GenderEnum gender = null;

  @JsonProperty("salary")
  private Double salary = null;

  @JsonProperty("department")
  private Details department = null;

  @JsonProperty("project")
  private Details project = null;

  public Employee id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Employee name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Employee jobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
    return this;
  }

  /**
   * Get jobTitle
   * @return jobTitle
  **/
  @ApiModelProperty(value = "")


  public String getJobTitle() {
    return jobTitle;
  }

  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }

  public Employee mobileNo(String mobileNo) {
    this.mobileNo = mobileNo;
    return this;
  }

  /**
   * Get mobileNo
   * @return mobileNo
  **/
  @ApiModelProperty(value = "")

@Size(min=10,max=10) 
  public String getMobileNo() {
    return mobileNo;
  }

  public void setMobileNo(String mobileNo) {
    this.mobileNo = mobileNo;
  }

  public Employee joinedDate(LocalDate joinedDate) {
    this.joinedDate = joinedDate;
    return this;
  }

  /**
   * Get joinedDate
   * @return joinedDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getJoinedDate() {
    return joinedDate;
  }

  public void setJoinedDate(LocalDate joinedDate) {
    this.joinedDate = joinedDate;
  }

  public Employee gender(GenderEnum gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Get gender
   * @return gender
  **/
  @ApiModelProperty(value = "")


  public GenderEnum getGender() {
    return gender;
  }

  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }

  public Employee salary(Double salary) {
    this.salary = salary;
    return this;
  }

  /**
   * Get salary
   * @return salary
  **/
  @ApiModelProperty(value = "")


  public Double getSalary() {
    return salary;
  }

  public void setSalary(Double salary) {
    this.salary = salary;
  }

  public Employee department(Details department) {
    this.department = department;
    return this;
  }

  /**
   * Get department
   * @return department
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Details getDepartment() {
    return department;
  }

  public void setDepartment(Details department) {
    this.department = department;
  }

  public Employee project(Details project) {
    this.project = project;
    return this;
  }

  /**
   * Get project
   * @return project
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Details getProject() {
    return project;
  }

  public void setProject(Details project) {
    this.project = project;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Employee employee = (Employee) o;
    return Objects.equals(this.id, employee.id) &&
        Objects.equals(this.name, employee.name) &&
        Objects.equals(this.jobTitle, employee.jobTitle) &&
        Objects.equals(this.mobileNo, employee.mobileNo) &&
        Objects.equals(this.joinedDate, employee.joinedDate) &&
        Objects.equals(this.gender, employee.gender) &&
        Objects.equals(this.salary, employee.salary) &&
        Objects.equals(this.department, employee.department) &&
        Objects.equals(this.project, employee.project);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, jobTitle, mobileNo, joinedDate, gender, salary, department, project);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Employee {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    mobileNo: ").append(toIndentedString(mobileNo)).append("\n");
    sb.append("    joinedDate: ").append(toIndentedString(joinedDate)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    salary: ").append(toIndentedString(salary)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
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

