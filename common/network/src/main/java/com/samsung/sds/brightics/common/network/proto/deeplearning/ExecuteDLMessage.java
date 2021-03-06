/*
    Copyright 2019 Samsung SDS
    
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
    
        http://www.apache.org/licenses/LICENSE-2.0
    
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
*/

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: deeplearning.proto

package com.samsung.sds.brightics.common.network.proto.deeplearning;

/**
 * Protobuf type {@code com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage}
 */
public  final class ExecuteDLMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage)
    ExecuteDLMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExecuteDLMessage.newBuilder() to construct.
  private ExecuteDLMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExecuteDLMessage() {
    user_ = "";
    parameters_ = "";
    actionType_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ExecuteDLMessage(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            user_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            parameters_ = s;
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            actionType_ = rawValue;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.samsung.sds.brightics.common.network.proto.deeplearning.DeeplearningProto.internal_static_com_samsung_sds_brightics_common_network_proto_deeplearning_ExecuteDLMessage_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.samsung.sds.brightics.common.network.proto.deeplearning.DeeplearningProto.internal_static_com_samsung_sds_brightics_common_network_proto_deeplearning_ExecuteDLMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage.class, com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage.Builder.class);
  }

  /**
   * Protobuf enum {@code com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage.DLActionType}
   */
  public enum DLActionType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>STATUS = 0;</code>
     */
    STATUS(0),
    /**
     * <code>BROWSE = 1;</code>
     */
    BROWSE(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>STATUS = 0;</code>
     */
    public static final int STATUS_VALUE = 0;
    /**
     * <code>BROWSE = 1;</code>
     */
    public static final int BROWSE_VALUE = 1;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static DLActionType valueOf(int value) {
      return forNumber(value);
    }

    public static DLActionType forNumber(int value) {
      switch (value) {
        case 0: return STATUS;
        case 1: return BROWSE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<DLActionType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        DLActionType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<DLActionType>() {
            public DLActionType findValueByNumber(int number) {
              return DLActionType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage.getDescriptor().getEnumTypes().get(0);
    }

    private static final DLActionType[] VALUES = values();

    public static DLActionType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private DLActionType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage.DLActionType)
  }

  public static final int USER_FIELD_NUMBER = 1;
  private volatile java.lang.Object user_;
  /**
   * <code>string user = 1;</code>
   */
  public java.lang.String getUser() {
    java.lang.Object ref = user_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      user_ = s;
      return s;
    }
  }
  /**
   * <code>string user = 1;</code>
   */
  public com.google.protobuf.ByteString
      getUserBytes() {
    java.lang.Object ref = user_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      user_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PARAMETERS_FIELD_NUMBER = 2;
  private volatile java.lang.Object parameters_;
  /**
   * <code>string parameters = 2;</code>
   */
  public java.lang.String getParameters() {
    java.lang.Object ref = parameters_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parameters_ = s;
      return s;
    }
  }
  /**
   * <code>string parameters = 2;</code>
   */
  public com.google.protobuf.ByteString
      getParametersBytes() {
    java.lang.Object ref = parameters_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parameters_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACTIONTYPE_FIELD_NUMBER = 3;
  private int actionType_;
  /**
   * <code>.com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage.DLActionType actionType = 3;</code>
   */
  public int getActionTypeValue() {
    return actionType_;
  }
  /**
   * <code>.com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage.DLActionType actionType = 3;</code>
   */
  public com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage.DLActionType getActionType() {
    com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage.DLActionType result = com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage.DLActionType.valueOf(actionType_);
    return result == null ? com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage.DLActionType.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getUserBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, user_);
    }
    if (!getParametersBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, parameters_);
    }
    if (actionType_ != com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage.DLActionType.STATUS.getNumber()) {
      output.writeEnum(3, actionType_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getUserBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, user_);
    }
    if (!getParametersBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, parameters_);
    }
    if (actionType_ != com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage.DLActionType.STATUS.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, actionType_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage)) {
      return super.equals(obj);
    }
    com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage other = (com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage) obj;

    boolean result = true;
    result = result && getUser()
        .equals(other.getUser());
    result = result && getParameters()
        .equals(other.getParameters());
    result = result && actionType_ == other.actionType_;
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + USER_FIELD_NUMBER;
    hash = (53 * hash) + getUser().hashCode();
    hash = (37 * hash) + PARAMETERS_FIELD_NUMBER;
    hash = (53 * hash) + getParameters().hashCode();
    hash = (37 * hash) + ACTIONTYPE_FIELD_NUMBER;
    hash = (53 * hash) + actionType_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage)
      com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.samsung.sds.brightics.common.network.proto.deeplearning.DeeplearningProto.internal_static_com_samsung_sds_brightics_common_network_proto_deeplearning_ExecuteDLMessage_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.samsung.sds.brightics.common.network.proto.deeplearning.DeeplearningProto.internal_static_com_samsung_sds_brightics_common_network_proto_deeplearning_ExecuteDLMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage.class, com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage.Builder.class);
    }

    // Construct using com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      user_ = "";

      parameters_ = "";

      actionType_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.samsung.sds.brightics.common.network.proto.deeplearning.DeeplearningProto.internal_static_com_samsung_sds_brightics_common_network_proto_deeplearning_ExecuteDLMessage_descriptor;
    }

    public com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage getDefaultInstanceForType() {
      return com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage.getDefaultInstance();
    }

    public com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage build() {
      com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage buildPartial() {
      com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage result = new com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage(this);
      result.user_ = user_;
      result.parameters_ = parameters_;
      result.actionType_ = actionType_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage) {
        return mergeFrom((com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage other) {
      if (other == com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage.getDefaultInstance()) return this;
      if (!other.getUser().isEmpty()) {
        user_ = other.user_;
        onChanged();
      }
      if (!other.getParameters().isEmpty()) {
        parameters_ = other.parameters_;
        onChanged();
      }
      if (other.actionType_ != 0) {
        setActionTypeValue(other.getActionTypeValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object user_ = "";
    /**
     * <code>string user = 1;</code>
     */
    public java.lang.String getUser() {
      java.lang.Object ref = user_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        user_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string user = 1;</code>
     */
    public com.google.protobuf.ByteString
        getUserBytes() {
      java.lang.Object ref = user_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        user_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string user = 1;</code>
     */
    public Builder setUser(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      user_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string user = 1;</code>
     */
    public Builder clearUser() {
      
      user_ = getDefaultInstance().getUser();
      onChanged();
      return this;
    }
    /**
     * <code>string user = 1;</code>
     */
    public Builder setUserBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      user_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object parameters_ = "";
    /**
     * <code>string parameters = 2;</code>
     */
    public java.lang.String getParameters() {
      java.lang.Object ref = parameters_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parameters_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string parameters = 2;</code>
     */
    public com.google.protobuf.ByteString
        getParametersBytes() {
      java.lang.Object ref = parameters_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parameters_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string parameters = 2;</code>
     */
    public Builder setParameters(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      parameters_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string parameters = 2;</code>
     */
    public Builder clearParameters() {
      
      parameters_ = getDefaultInstance().getParameters();
      onChanged();
      return this;
    }
    /**
     * <code>string parameters = 2;</code>
     */
    public Builder setParametersBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      parameters_ = value;
      onChanged();
      return this;
    }

    private int actionType_ = 0;
    /**
     * <code>.com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage.DLActionType actionType = 3;</code>
     */
    public int getActionTypeValue() {
      return actionType_;
    }
    /**
     * <code>.com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage.DLActionType actionType = 3;</code>
     */
    public Builder setActionTypeValue(int value) {
      actionType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage.DLActionType actionType = 3;</code>
     */
    public com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage.DLActionType getActionType() {
      com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage.DLActionType result = com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage.DLActionType.valueOf(actionType_);
      return result == null ? com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage.DLActionType.UNRECOGNIZED : result;
    }
    /**
     * <code>.com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage.DLActionType actionType = 3;</code>
     */
    public Builder setActionType(com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage.DLActionType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      actionType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage.DLActionType actionType = 3;</code>
     */
    public Builder clearActionType() {
      
      actionType_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage)
  }

  // @@protoc_insertion_point(class_scope:com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage)
  private static final com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage();
  }

  public static com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExecuteDLMessage>
      PARSER = new com.google.protobuf.AbstractParser<ExecuteDLMessage>() {
    public ExecuteDLMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ExecuteDLMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ExecuteDLMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExecuteDLMessage> getParserForType() {
    return PARSER;
  }

  public com.samsung.sds.brightics.common.network.proto.deeplearning.ExecuteDLMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

