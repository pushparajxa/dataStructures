/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.experiments.kafkaApplications;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
/** Represents an Employee at a company */
@org.apache.avro.specific.AvroGenerated
public class Employee extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -3563376397342212795L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Employee\",\"namespace\":\"com.experiments.kafkaApplications\",\"doc\":\"Represents an Employee at a company\",\"fields\":[{\"name\":\"firstName\",\"type\":\"string\",\"doc\":\"The persons given name\"},{\"name\":\"nickName\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"lastName\",\"type\":\"string\"},{\"name\":\"age\",\"type\":\"int\",\"default\":-1},{\"name\":\"emails\",\"type\":{\"type\":\"array\",\"items\":\"string\"},\"default\":[]},{\"name\":\"phoneNumber\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"PhoneNumber\",\"fields\":[{\"name\":\"areaCode\",\"type\":\"string\"},{\"name\":\"countryCode\",\"type\":\"string\",\"default\":\"\"},{\"name\":\"prefix\",\"type\":\"string\"},{\"name\":\"number\",\"type\":\"string\"}]}]},{\"name\":\"status\",\"type\":{\"type\":\"enum\",\"name\":\"Status\",\"symbols\":[\"RETIRED\",\"SALARY\",\"HOURLY\",\"PART_TIME\"]},\"default\":\"SALARY\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** The persons given name */
  @Deprecated public java.lang.CharSequence firstName;
  @Deprecated public java.lang.CharSequence nickName;
  @Deprecated public java.lang.CharSequence lastName;
  @Deprecated public int age;
  @Deprecated public java.util.List<java.lang.CharSequence> emails;
  @Deprecated public com.experiments.kafkaApplications.PhoneNumber phoneNumber;
  @Deprecated public com.experiments.kafkaApplications.Status status;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Employee() {}

  /**
   * All-args constructor.
   * @param firstName The persons given name
   * @param nickName The new value for nickName
   * @param lastName The new value for lastName
   * @param age The new value for age
   * @param emails The new value for emails
   * @param phoneNumber The new value for phoneNumber
   * @param status The new value for status
   */
  public Employee(java.lang.CharSequence firstName, java.lang.CharSequence nickName, java.lang.CharSequence lastName, java.lang.Integer age, java.util.List<java.lang.CharSequence> emails, com.experiments.kafkaApplications.PhoneNumber phoneNumber, com.experiments.kafkaApplications.Status status) {
    this.firstName = firstName;
    this.nickName = nickName;
    this.lastName = lastName;
    this.age = age;
    this.emails = emails;
    this.phoneNumber = phoneNumber;
    this.status = status;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return firstName;
    case 1: return nickName;
    case 2: return lastName;
    case 3: return age;
    case 4: return emails;
    case 5: return phoneNumber;
    case 6: return status;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: firstName = (java.lang.CharSequence)value$; break;
    case 1: nickName = (java.lang.CharSequence)value$; break;
    case 2: lastName = (java.lang.CharSequence)value$; break;
    case 3: age = (java.lang.Integer)value$; break;
    case 4: emails = (java.util.List<java.lang.CharSequence>)value$; break;
    case 5: phoneNumber = (com.experiments.kafkaApplications.PhoneNumber)value$; break;
    case 6: status = (com.experiments.kafkaApplications.Status)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'firstName' field.
   * @return The persons given name
   */
  public java.lang.CharSequence getFirstName() {
    return firstName;
  }

  /**
   * Sets the value of the 'firstName' field.
   * The persons given name
   * @param value the value to set.
   */
  public void setFirstName(java.lang.CharSequence value) {
    this.firstName = value;
  }

  /**
   * Gets the value of the 'nickName' field.
   * @return The value of the 'nickName' field.
   */
  public java.lang.CharSequence getNickName() {
    return nickName;
  }

  /**
   * Sets the value of the 'nickName' field.
   * @param value the value to set.
   */
  public void setNickName(java.lang.CharSequence value) {
    this.nickName = value;
  }

  /**
   * Gets the value of the 'lastName' field.
   * @return The value of the 'lastName' field.
   */
  public java.lang.CharSequence getLastName() {
    return lastName;
  }

  /**
   * Sets the value of the 'lastName' field.
   * @param value the value to set.
   */
  public void setLastName(java.lang.CharSequence value) {
    this.lastName = value;
  }

  /**
   * Gets the value of the 'age' field.
   * @return The value of the 'age' field.
   */
  public java.lang.Integer getAge() {
    return age;
  }

  /**
   * Sets the value of the 'age' field.
   * @param value the value to set.
   */
  public void setAge(java.lang.Integer value) {
    this.age = value;
  }

  /**
   * Gets the value of the 'emails' field.
   * @return The value of the 'emails' field.
   */
  public java.util.List<java.lang.CharSequence> getEmails() {
    return emails;
  }

  /**
   * Sets the value of the 'emails' field.
   * @param value the value to set.
   */
  public void setEmails(java.util.List<java.lang.CharSequence> value) {
    this.emails = value;
  }

  /**
   * Gets the value of the 'phoneNumber' field.
   * @return The value of the 'phoneNumber' field.
   */
  public com.experiments.kafkaApplications.PhoneNumber getPhoneNumber() {
    return phoneNumber;
  }

  /**
   * Sets the value of the 'phoneNumber' field.
   * @param value the value to set.
   */
  public void setPhoneNumber(com.experiments.kafkaApplications.PhoneNumber value) {
    this.phoneNumber = value;
  }

  /**
   * Gets the value of the 'status' field.
   * @return The value of the 'status' field.
   */
  public com.experiments.kafkaApplications.Status getStatus() {
    return status;
  }

  /**
   * Sets the value of the 'status' field.
   * @param value the value to set.
   */
  public void setStatus(com.experiments.kafkaApplications.Status value) {
    this.status = value;
  }

  /**
   * Creates a new Employee RecordBuilder.
   * @return A new Employee RecordBuilder
   */
  public static com.experiments.kafkaApplications.Employee.Builder newBuilder() {
    return new com.experiments.kafkaApplications.Employee.Builder();
  }

  /**
   * Creates a new Employee RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Employee RecordBuilder
   */
  public static com.experiments.kafkaApplications.Employee.Builder newBuilder(com.experiments.kafkaApplications.Employee.Builder other) {
    return new com.experiments.kafkaApplications.Employee.Builder(other);
  }

  /**
   * Creates a new Employee RecordBuilder by copying an existing Employee instance.
   * @param other The existing instance to copy.
   * @return A new Employee RecordBuilder
   */
  public static com.experiments.kafkaApplications.Employee.Builder newBuilder(com.experiments.kafkaApplications.Employee other) {
    return new com.experiments.kafkaApplications.Employee.Builder(other);
  }

  /**
   * RecordBuilder for Employee instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Employee>
    implements org.apache.avro.data.RecordBuilder<Employee> {

    /** The persons given name */
    private java.lang.CharSequence firstName;
    private java.lang.CharSequence nickName;
    private java.lang.CharSequence lastName;
    private int age;
    private java.util.List<java.lang.CharSequence> emails;
    private com.experiments.kafkaApplications.PhoneNumber phoneNumber;
    private com.experiments.kafkaApplications.PhoneNumber.Builder phoneNumberBuilder;
    private com.experiments.kafkaApplications.Status status;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.experiments.kafkaApplications.Employee.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.firstName)) {
        this.firstName = data().deepCopy(fields()[0].schema(), other.firstName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.nickName)) {
        this.nickName = data().deepCopy(fields()[1].schema(), other.nickName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.lastName)) {
        this.lastName = data().deepCopy(fields()[2].schema(), other.lastName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.age)) {
        this.age = data().deepCopy(fields()[3].schema(), other.age);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.emails)) {
        this.emails = data().deepCopy(fields()[4].schema(), other.emails);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.phoneNumber)) {
        this.phoneNumber = data().deepCopy(fields()[5].schema(), other.phoneNumber);
        fieldSetFlags()[5] = true;
      }
      if (other.hasPhoneNumberBuilder()) {
        this.phoneNumberBuilder = com.experiments.kafkaApplications.PhoneNumber.newBuilder(other.getPhoneNumberBuilder());
      }
      if (isValidValue(fields()[6], other.status)) {
        this.status = data().deepCopy(fields()[6].schema(), other.status);
        fieldSetFlags()[6] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Employee instance
     * @param other The existing instance to copy.
     */
    private Builder(com.experiments.kafkaApplications.Employee other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.firstName)) {
        this.firstName = data().deepCopy(fields()[0].schema(), other.firstName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.nickName)) {
        this.nickName = data().deepCopy(fields()[1].schema(), other.nickName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.lastName)) {
        this.lastName = data().deepCopy(fields()[2].schema(), other.lastName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.age)) {
        this.age = data().deepCopy(fields()[3].schema(), other.age);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.emails)) {
        this.emails = data().deepCopy(fields()[4].schema(), other.emails);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.phoneNumber)) {
        this.phoneNumber = data().deepCopy(fields()[5].schema(), other.phoneNumber);
        fieldSetFlags()[5] = true;
      }
      this.phoneNumberBuilder = null;
      if (isValidValue(fields()[6], other.status)) {
        this.status = data().deepCopy(fields()[6].schema(), other.status);
        fieldSetFlags()[6] = true;
      }
    }

    /**
      * Gets the value of the 'firstName' field.
      * The persons given name
      * @return The value.
      */
    public java.lang.CharSequence getFirstName() {
      return firstName;
    }

    /**
      * Sets the value of the 'firstName' field.
      * The persons given name
      * @param value The value of 'firstName'.
      * @return This builder.
      */
    public com.experiments.kafkaApplications.Employee.Builder setFirstName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.firstName = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'firstName' field has been set.
      * The persons given name
      * @return True if the 'firstName' field has been set, false otherwise.
      */
    public boolean hasFirstName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'firstName' field.
      * The persons given name
      * @return This builder.
      */
    public com.experiments.kafkaApplications.Employee.Builder clearFirstName() {
      firstName = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'nickName' field.
      * @return The value.
      */
    public java.lang.CharSequence getNickName() {
      return nickName;
    }

    /**
      * Sets the value of the 'nickName' field.
      * @param value The value of 'nickName'.
      * @return This builder.
      */
    public com.experiments.kafkaApplications.Employee.Builder setNickName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.nickName = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'nickName' field has been set.
      * @return True if the 'nickName' field has been set, false otherwise.
      */
    public boolean hasNickName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'nickName' field.
      * @return This builder.
      */
    public com.experiments.kafkaApplications.Employee.Builder clearNickName() {
      nickName = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'lastName' field.
      * @return The value.
      */
    public java.lang.CharSequence getLastName() {
      return lastName;
    }

    /**
      * Sets the value of the 'lastName' field.
      * @param value The value of 'lastName'.
      * @return This builder.
      */
    public com.experiments.kafkaApplications.Employee.Builder setLastName(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.lastName = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'lastName' field has been set.
      * @return True if the 'lastName' field has been set, false otherwise.
      */
    public boolean hasLastName() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'lastName' field.
      * @return This builder.
      */
    public com.experiments.kafkaApplications.Employee.Builder clearLastName() {
      lastName = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'age' field.
      * @return The value.
      */
    public java.lang.Integer getAge() {
      return age;
    }

    /**
      * Sets the value of the 'age' field.
      * @param value The value of 'age'.
      * @return This builder.
      */
    public com.experiments.kafkaApplications.Employee.Builder setAge(int value) {
      validate(fields()[3], value);
      this.age = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'age' field has been set.
      * @return True if the 'age' field has been set, false otherwise.
      */
    public boolean hasAge() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'age' field.
      * @return This builder.
      */
    public com.experiments.kafkaApplications.Employee.Builder clearAge() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'emails' field.
      * @return The value.
      */
    public java.util.List<java.lang.CharSequence> getEmails() {
      return emails;
    }

    /**
      * Sets the value of the 'emails' field.
      * @param value The value of 'emails'.
      * @return This builder.
      */
    public com.experiments.kafkaApplications.Employee.Builder setEmails(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[4], value);
      this.emails = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'emails' field has been set.
      * @return True if the 'emails' field has been set, false otherwise.
      */
    public boolean hasEmails() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'emails' field.
      * @return This builder.
      */
    public com.experiments.kafkaApplications.Employee.Builder clearEmails() {
      emails = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'phoneNumber' field.
      * @return The value.
      */
    public com.experiments.kafkaApplications.PhoneNumber getPhoneNumber() {
      return phoneNumber;
    }

    /**
      * Sets the value of the 'phoneNumber' field.
      * @param value The value of 'phoneNumber'.
      * @return This builder.
      */
    public com.experiments.kafkaApplications.Employee.Builder setPhoneNumber(com.experiments.kafkaApplications.PhoneNumber value) {
      validate(fields()[5], value);
      this.phoneNumberBuilder = null;
      this.phoneNumber = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'phoneNumber' field has been set.
      * @return True if the 'phoneNumber' field has been set, false otherwise.
      */
    public boolean hasPhoneNumber() {
      return fieldSetFlags()[5];
    }

    /**
     * Gets the Builder instance for the 'phoneNumber' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.experiments.kafkaApplications.PhoneNumber.Builder getPhoneNumberBuilder() {
      if (phoneNumberBuilder == null) {
        if (hasPhoneNumber()) {
          setPhoneNumberBuilder(com.experiments.kafkaApplications.PhoneNumber.newBuilder(phoneNumber));
        } else {
          setPhoneNumberBuilder(com.experiments.kafkaApplications.PhoneNumber.newBuilder());
        }
      }
      return phoneNumberBuilder;
    }

    /**
     * Sets the Builder instance for the 'phoneNumber' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.experiments.kafkaApplications.Employee.Builder setPhoneNumberBuilder(com.experiments.kafkaApplications.PhoneNumber.Builder value) {
      clearPhoneNumber();
      phoneNumberBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'phoneNumber' field has an active Builder instance
     * @return True if the 'phoneNumber' field has an active Builder instance
     */
    public boolean hasPhoneNumberBuilder() {
      return phoneNumberBuilder != null;
    }

    /**
      * Clears the value of the 'phoneNumber' field.
      * @return This builder.
      */
    public com.experiments.kafkaApplications.Employee.Builder clearPhoneNumber() {
      phoneNumber = null;
      phoneNumberBuilder = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'status' field.
      * @return The value.
      */
    public com.experiments.kafkaApplications.Status getStatus() {
      return status;
    }

    /**
      * Sets the value of the 'status' field.
      * @param value The value of 'status'.
      * @return This builder.
      */
    public com.experiments.kafkaApplications.Employee.Builder setStatus(com.experiments.kafkaApplications.Status value) {
      validate(fields()[6], value);
      this.status = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'status' field has been set.
      * @return True if the 'status' field has been set, false otherwise.
      */
    public boolean hasStatus() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'status' field.
      * @return This builder.
      */
    public com.experiments.kafkaApplications.Employee.Builder clearStatus() {
      status = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    public Employee build() {
      try {
        Employee record = new Employee();
        record.firstName = fieldSetFlags()[0] ? this.firstName : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.nickName = fieldSetFlags()[1] ? this.nickName : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.lastName = fieldSetFlags()[2] ? this.lastName : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.age = fieldSetFlags()[3] ? this.age : (java.lang.Integer) defaultValue(fields()[3]);
        record.emails = fieldSetFlags()[4] ? this.emails : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[4]);
        if (phoneNumberBuilder != null) {
          record.phoneNumber = this.phoneNumberBuilder.build();
        } else {
          record.phoneNumber = fieldSetFlags()[5] ? this.phoneNumber : (com.experiments.kafkaApplications.PhoneNumber) defaultValue(fields()[5]);
        }
        record.status = fieldSetFlags()[6] ? this.status : (com.experiments.kafkaApplications.Status) defaultValue(fields()[6]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
