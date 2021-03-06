/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.banking.server;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2020-02-04")
public class TManager implements org.apache.thrift.TBase<TManager, TManager._Fields>, java.io.Serializable, Cloneable, Comparable<TManager> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TManager");

  private static final org.apache.thrift.protocol.TField ACCOUNT_NUMBER_FIELD_DESC = new org.apache.thrift.protocol.TField("accountNumber", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField BRANCH_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("branchCode", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField USERNAME_FIELD_DESC = new org.apache.thrift.protocol.TField("username", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TManagerStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TManagerTupleSchemeFactory());
  }

  public String accountNumber; // required
  public String branchCode; // required
  public String username; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ACCOUNT_NUMBER((short)1, "accountNumber"),
    BRANCH_CODE((short)2, "branchCode"),
    USERNAME((short)3, "username");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ACCOUNT_NUMBER
          return ACCOUNT_NUMBER;
        case 2: // BRANCH_CODE
          return BRANCH_CODE;
        case 3: // USERNAME
          return USERNAME;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ACCOUNT_NUMBER, new org.apache.thrift.meta_data.FieldMetaData("accountNumber", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.BRANCH_CODE, new org.apache.thrift.meta_data.FieldMetaData("branchCode", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.USERNAME, new org.apache.thrift.meta_data.FieldMetaData("username", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TManager.class, metaDataMap);
  }

  public TManager() {
  }

  public TManager(
    String accountNumber,
    String branchCode,
    String username)
  {
    this();
    this.accountNumber = accountNumber;
    this.branchCode = branchCode;
    this.username = username;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TManager(TManager other) {
    if (other.isSetAccountNumber()) {
      this.accountNumber = other.accountNumber;
    }
    if (other.isSetBranchCode()) {
      this.branchCode = other.branchCode;
    }
    if (other.isSetUsername()) {
      this.username = other.username;
    }
  }

  public TManager deepCopy() {
    return new TManager(this);
  }

  @Override
  public void clear() {
    this.accountNumber = null;
    this.branchCode = null;
    this.username = null;
  }

  public String getAccountNumber() {
    return this.accountNumber;
  }

  public TManager setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  public void unsetAccountNumber() {
    this.accountNumber = null;
  }

  /** Returns true if field accountNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetAccountNumber() {
    return this.accountNumber != null;
  }

  public void setAccountNumberIsSet(boolean value) {
    if (!value) {
      this.accountNumber = null;
    }
  }

  public String getBranchCode() {
    return this.branchCode;
  }

  public TManager setBranchCode(String branchCode) {
    this.branchCode = branchCode;
    return this;
  }

  public void unsetBranchCode() {
    this.branchCode = null;
  }

  /** Returns true if field branchCode is set (has been assigned a value) and false otherwise */
  public boolean isSetBranchCode() {
    return this.branchCode != null;
  }

  public void setBranchCodeIsSet(boolean value) {
    if (!value) {
      this.branchCode = null;
    }
  }

  public String getUsername() {
    return this.username;
  }

  public TManager setUsername(String username) {
    this.username = username;
    return this;
  }

  public void unsetUsername() {
    this.username = null;
  }

  /** Returns true if field username is set (has been assigned a value) and false otherwise */
  public boolean isSetUsername() {
    return this.username != null;
  }

  public void setUsernameIsSet(boolean value) {
    if (!value) {
      this.username = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ACCOUNT_NUMBER:
      if (value == null) {
        unsetAccountNumber();
      } else {
        setAccountNumber((String)value);
      }
      break;

    case BRANCH_CODE:
      if (value == null) {
        unsetBranchCode();
      } else {
        setBranchCode((String)value);
      }
      break;

    case USERNAME:
      if (value == null) {
        unsetUsername();
      } else {
        setUsername((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ACCOUNT_NUMBER:
      return getAccountNumber();

    case BRANCH_CODE:
      return getBranchCode();

    case USERNAME:
      return getUsername();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ACCOUNT_NUMBER:
      return isSetAccountNumber();
    case BRANCH_CODE:
      return isSetBranchCode();
    case USERNAME:
      return isSetUsername();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TManager)
      return this.equals((TManager)that);
    return false;
  }

  public boolean equals(TManager that) {
    if (that == null)
      return false;

    boolean this_present_accountNumber = true && this.isSetAccountNumber();
    boolean that_present_accountNumber = true && that.isSetAccountNumber();
    if (this_present_accountNumber || that_present_accountNumber) {
      if (!(this_present_accountNumber && that_present_accountNumber))
        return false;
      if (!this.accountNumber.equals(that.accountNumber))
        return false;
    }

    boolean this_present_branchCode = true && this.isSetBranchCode();
    boolean that_present_branchCode = true && that.isSetBranchCode();
    if (this_present_branchCode || that_present_branchCode) {
      if (!(this_present_branchCode && that_present_branchCode))
        return false;
      if (!this.branchCode.equals(that.branchCode))
        return false;
    }

    boolean this_present_username = true && this.isSetUsername();
    boolean that_present_username = true && that.isSetUsername();
    if (this_present_username || that_present_username) {
      if (!(this_present_username && that_present_username))
        return false;
      if (!this.username.equals(that.username))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_accountNumber = true && (isSetAccountNumber());
    list.add(present_accountNumber);
    if (present_accountNumber)
      list.add(accountNumber);

    boolean present_branchCode = true && (isSetBranchCode());
    list.add(present_branchCode);
    if (present_branchCode)
      list.add(branchCode);

    boolean present_username = true && (isSetUsername());
    list.add(present_username);
    if (present_username)
      list.add(username);

    return list.hashCode();
  }

  @Override
  public int compareTo(TManager other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetAccountNumber()).compareTo(other.isSetAccountNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAccountNumber()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.accountNumber, other.accountNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBranchCode()).compareTo(other.isSetBranchCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBranchCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.branchCode, other.branchCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUsername()).compareTo(other.isSetUsername());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsername()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.username, other.username);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TManager(");
    boolean first = true;

    sb.append("accountNumber:");
    if (this.accountNumber == null) {
      sb.append("null");
    } else {
      sb.append(this.accountNumber);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("branchCode:");
    if (this.branchCode == null) {
      sb.append("null");
    } else {
      sb.append(this.branchCode);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("username:");
    if (this.username == null) {
      sb.append("null");
    } else {
      sb.append(this.username);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    if (accountNumber == null) {
      throw new TProtocolException("Required field 'accountNumber' was not present! Struct: " + toString());
    }
    if (branchCode == null) {
      throw new TProtocolException("Required field 'branchCode' was not present! Struct: " + toString());
    }
    if (username == null) {
      throw new TProtocolException("Required field 'username' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TManagerStandardSchemeFactory implements SchemeFactory {
    public TManagerStandardScheme getScheme() {
      return new TManagerStandardScheme();
    }
  }

  private static class TManagerStandardScheme extends StandardScheme<TManager> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TManager struct) throws TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ACCOUNT_NUMBER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.accountNumber = iprot.readString();
              struct.setAccountNumberIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // BRANCH_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.branchCode = iprot.readString();
              struct.setBranchCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // USERNAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.username = iprot.readString();
              struct.setUsernameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TManager struct) throws TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.accountNumber != null) {
        oprot.writeFieldBegin(ACCOUNT_NUMBER_FIELD_DESC);
        oprot.writeString(struct.accountNumber);
        oprot.writeFieldEnd();
      }
      if (struct.branchCode != null) {
        oprot.writeFieldBegin(BRANCH_CODE_FIELD_DESC);
        oprot.writeString(struct.branchCode);
        oprot.writeFieldEnd();
      }
      if (struct.username != null) {
        oprot.writeFieldBegin(USERNAME_FIELD_DESC);
        oprot.writeString(struct.username);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TManagerTupleSchemeFactory implements SchemeFactory {
    public TManagerTupleScheme getScheme() {
      return new TManagerTupleScheme();
    }
  }

  private static class TManagerTupleScheme extends TupleScheme<TManager> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TManager struct) throws TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.accountNumber);
      oprot.writeString(struct.branchCode);
      oprot.writeString(struct.username);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TManager struct) throws TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.accountNumber = iprot.readString();
      struct.setAccountNumberIsSet(true);
      struct.branchCode = iprot.readString();
      struct.setBranchCodeIsSet(true);
      struct.username = iprot.readString();
      struct.setUsernameIsSet(true);
    }
  }

}

