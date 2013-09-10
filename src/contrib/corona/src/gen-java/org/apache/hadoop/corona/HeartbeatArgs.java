/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.hadoop.corona;

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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HeartbeatArgs implements org.apache.thrift.TBase<HeartbeatArgs, HeartbeatArgs._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("HeartbeatArgs");

  private static final org.apache.thrift.protocol.TField REQUEST_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("requestId", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField GRANT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("grantId", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField RESOURCE_USAGES_FIELD_DESC = new org.apache.thrift.protocol.TField("resourceUsages", org.apache.thrift.protocol.TType.MAP, (short)3);

  public int requestId; // required
  public int grantId; // required
  public Map<ResourceType,List<Long>> resourceUsages; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    REQUEST_ID((short)1, "requestId"),
    GRANT_ID((short)2, "grantId"),
    RESOURCE_USAGES((short)3, "resourceUsages");

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
        case 1: // REQUEST_ID
          return REQUEST_ID;
        case 2: // GRANT_ID
          return GRANT_ID;
        case 3: // RESOURCE_USAGES
          return RESOURCE_USAGES;
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
  private static final int __REQUESTID_ISSET_ID = 0;
  private static final int __GRANTID_ISSET_ID = 1;
  private BitSet __isset_bit_vector = new BitSet(2);

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.REQUEST_ID, new org.apache.thrift.meta_data.FieldMetaData("requestId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "ResourceRequestId")));
    tmpMap.put(_Fields.GRANT_ID, new org.apache.thrift.meta_data.FieldMetaData("grantId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "ResourceRequestId")));
    tmpMap.put(_Fields.RESOURCE_USAGES, new org.apache.thrift.meta_data.FieldMetaData("resourceUsages", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, ResourceType.class), 
            new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(HeartbeatArgs.class, metaDataMap);
  }

  public HeartbeatArgs() {
  }

  public HeartbeatArgs(
    int requestId,
    int grantId,
    Map<ResourceType,List<Long>> resourceUsages)
  {
    this();
    this.requestId = requestId;
    setRequestIdIsSet(true);
    this.grantId = grantId;
    setGrantIdIsSet(true);
    this.resourceUsages = resourceUsages;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public HeartbeatArgs(HeartbeatArgs other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.requestId = other.requestId;
    this.grantId = other.grantId;
    if (other.isSetResourceUsages()) {
      Map<ResourceType,List<Long>> __this__resourceUsages = new HashMap<ResourceType,List<Long>>();
      for (Map.Entry<ResourceType, List<Long>> other_element : other.resourceUsages.entrySet()) {

        ResourceType other_element_key = other_element.getKey();
        List<Long> other_element_value = other_element.getValue();

        ResourceType __this__resourceUsages_copy_key = other_element_key;

        List<Long> __this__resourceUsages_copy_value = new ArrayList<Long>();
        for (Long other_element_value_element : other_element_value) {
          __this__resourceUsages_copy_value.add(other_element_value_element);
        }

        __this__resourceUsages.put(__this__resourceUsages_copy_key, __this__resourceUsages_copy_value);
      }
      this.resourceUsages = __this__resourceUsages;
    }
  }

  public HeartbeatArgs deepCopy() {
    return new HeartbeatArgs(this);
  }

  @Override
  public void clear() {
    setRequestIdIsSet(false);
    this.requestId = 0;
    setGrantIdIsSet(false);
    this.grantId = 0;
    this.resourceUsages = null;
  }

  public int getRequestId() {
    return this.requestId;
  }

  public HeartbeatArgs setRequestId(int requestId) {
    this.requestId = requestId;
    setRequestIdIsSet(true);
    return this;
  }

  public void unsetRequestId() {
    __isset_bit_vector.clear(__REQUESTID_ISSET_ID);
  }

  /** Returns true if field requestId is set (has been assigned a value) and false otherwise */
  public boolean isSetRequestId() {
    return __isset_bit_vector.get(__REQUESTID_ISSET_ID);
  }

  public void setRequestIdIsSet(boolean value) {
    __isset_bit_vector.set(__REQUESTID_ISSET_ID, value);
  }

  public int getGrantId() {
    return this.grantId;
  }

  public HeartbeatArgs setGrantId(int grantId) {
    this.grantId = grantId;
    setGrantIdIsSet(true);
    return this;
  }

  public void unsetGrantId() {
    __isset_bit_vector.clear(__GRANTID_ISSET_ID);
  }

  /** Returns true if field grantId is set (has been assigned a value) and false otherwise */
  public boolean isSetGrantId() {
    return __isset_bit_vector.get(__GRANTID_ISSET_ID);
  }

  public void setGrantIdIsSet(boolean value) {
    __isset_bit_vector.set(__GRANTID_ISSET_ID, value);
  }

  public int getResourceUsagesSize() {
    return (this.resourceUsages == null) ? 0 : this.resourceUsages.size();
  }

  public void putToResourceUsages(ResourceType key, List<Long> val) {
    if (this.resourceUsages == null) {
      this.resourceUsages = new HashMap<ResourceType,List<Long>>();
    }
    this.resourceUsages.put(key, val);
  }

  public Map<ResourceType,List<Long>> getResourceUsages() {
    return this.resourceUsages;
  }

  public HeartbeatArgs setResourceUsages(Map<ResourceType,List<Long>> resourceUsages) {
    this.resourceUsages = resourceUsages;
    return this;
  }

  public void unsetResourceUsages() {
    this.resourceUsages = null;
  }

  /** Returns true if field resourceUsages is set (has been assigned a value) and false otherwise */
  public boolean isSetResourceUsages() {
    return this.resourceUsages != null;
  }

  public void setResourceUsagesIsSet(boolean value) {
    if (!value) {
      this.resourceUsages = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case REQUEST_ID:
      if (value == null) {
        unsetRequestId();
      } else {
        setRequestId((Integer)value);
      }
      break;

    case GRANT_ID:
      if (value == null) {
        unsetGrantId();
      } else {
        setGrantId((Integer)value);
      }
      break;

    case RESOURCE_USAGES:
      if (value == null) {
        unsetResourceUsages();
      } else {
        setResourceUsages((Map<ResourceType,List<Long>>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case REQUEST_ID:
      return Integer.valueOf(getRequestId());

    case GRANT_ID:
      return Integer.valueOf(getGrantId());

    case RESOURCE_USAGES:
      return getResourceUsages();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case REQUEST_ID:
      return isSetRequestId();
    case GRANT_ID:
      return isSetGrantId();
    case RESOURCE_USAGES:
      return isSetResourceUsages();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof HeartbeatArgs)
      return this.equals((HeartbeatArgs)that);
    return false;
  }

  public boolean equals(HeartbeatArgs that) {
    if (that == null)
      return false;

    boolean this_present_requestId = true;
    boolean that_present_requestId = true;
    if (this_present_requestId || that_present_requestId) {
      if (!(this_present_requestId && that_present_requestId))
        return false;
      if (this.requestId != that.requestId)
        return false;
    }

    boolean this_present_grantId = true;
    boolean that_present_grantId = true;
    if (this_present_grantId || that_present_grantId) {
      if (!(this_present_grantId && that_present_grantId))
        return false;
      if (this.grantId != that.grantId)
        return false;
    }

    boolean this_present_resourceUsages = true && this.isSetResourceUsages();
    boolean that_present_resourceUsages = true && that.isSetResourceUsages();
    if (this_present_resourceUsages || that_present_resourceUsages) {
      if (!(this_present_resourceUsages && that_present_resourceUsages))
        return false;
      if (!this.resourceUsages.equals(that.resourceUsages))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(HeartbeatArgs other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    HeartbeatArgs typedOther = (HeartbeatArgs)other;

    lastComparison = Boolean.valueOf(isSetRequestId()).compareTo(typedOther.isSetRequestId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRequestId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.requestId, typedOther.requestId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGrantId()).compareTo(typedOther.isSetGrantId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGrantId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.grantId, typedOther.grantId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetResourceUsages()).compareTo(typedOther.isSetResourceUsages());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResourceUsages()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.resourceUsages, typedOther.resourceUsages);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    org.apache.thrift.protocol.TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == org.apache.thrift.protocol.TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // REQUEST_ID
          if (field.type == org.apache.thrift.protocol.TType.I32) {
            this.requestId = iprot.readI32();
            setRequestIdIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // GRANT_ID
          if (field.type == org.apache.thrift.protocol.TType.I32) {
            this.grantId = iprot.readI32();
            setGrantIdIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // RESOURCE_USAGES
          if (field.type == org.apache.thrift.protocol.TType.MAP) {
            {
              org.apache.thrift.protocol.TMap _map17 = iprot.readMapBegin();
              this.resourceUsages = new HashMap<ResourceType,List<Long>>(2*_map17.size);
              for (int _i18 = 0; _i18 < _map17.size; ++_i18)
              {
                ResourceType _key19; // required
                List<Long> _val20; // required
                _key19 = ResourceType.findByValue(iprot.readI32());
                {
                  org.apache.thrift.protocol.TList _list21 = iprot.readListBegin();
                  _val20 = new ArrayList<Long>(_list21.size);
                  for (int _i22 = 0; _i22 < _list21.size; ++_i22)
                  {
                    long _elem23; // required
                    _elem23 = iprot.readI64();
                    _val20.add(_elem23);
                  }
                  iprot.readListEnd();
                }
                this.resourceUsages.put(_key19, _val20);
              }
              iprot.readMapEnd();
            }
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    if (!isSetRequestId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'requestId' was not found in serialized data! Struct: " + toString());
    }
    if (!isSetGrantId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'grantId' was not found in serialized data! Struct: " + toString());
    }
    validate();
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(REQUEST_ID_FIELD_DESC);
    oprot.writeI32(this.requestId);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(GRANT_ID_FIELD_DESC);
    oprot.writeI32(this.grantId);
    oprot.writeFieldEnd();
    if (this.resourceUsages != null) {
      oprot.writeFieldBegin(RESOURCE_USAGES_FIELD_DESC);
      {
        oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.LIST, this.resourceUsages.size()));
        for (Map.Entry<ResourceType, List<Long>> _iter24 : this.resourceUsages.entrySet())
        {
          oprot.writeI32(_iter24.getKey().getValue());
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, _iter24.getValue().size()));
            for (long _iter25 : _iter24.getValue())
            {
              oprot.writeI64(_iter25);
            }
            oprot.writeListEnd();
          }
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("HeartbeatArgs(");
    boolean first = true;

    sb.append("requestId:");
    sb.append(this.requestId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("grantId:");
    sb.append(this.grantId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("resourceUsages:");
    if (this.resourceUsages == null) {
      sb.append("null");
    } else {
      sb.append(this.resourceUsages);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'requestId' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'grantId' because it's a primitive and you chose the non-beans generator.
    if (resourceUsages == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'resourceUsages' was not present! Struct: " + toString());
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

}

