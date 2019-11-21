// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Tracing.proto

package org.apache.hadoop.hbase.shaded.protobuf.generated;

@javax.annotation.Generated("proto") public final class TracingProtos {
  private TracingProtos() {}
  public static void registerAllExtensions(
      org.apache.hbase.thirdparty.com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      org.apache.hbase.thirdparty.com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (org.apache.hbase.thirdparty.com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RPCTInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:hbase.pb.RPCTInfo)
      org.apache.hbase.thirdparty.com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int64 trace_id = 1;</code>
     */
    boolean hasTraceId();
    /**
     * <code>optional int64 trace_id = 1;</code>
     */
    long getTraceId();

    /**
     * <code>optional int64 parent_id = 2;</code>
     */
    boolean hasParentId();
    /**
     * <code>optional int64 parent_id = 2;</code>
     */
    long getParentId();
  }
  /**
   * <pre>
   *Used to pass through the information necessary to continue
   *a trace after an RPC is made. All we need is the traceid 
   *(so we know the overarching trace this message is a part of), and
   *the id of the current span when this message was sent, so we know 
   *what span caused the new span we will create when this message is received.
   * </pre>
   *
   * Protobuf type {@code hbase.pb.RPCTInfo}
   */
  @javax.annotation.Generated("proto") public  static final class RPCTInfo extends
      org.apache.hbase.thirdparty.com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:hbase.pb.RPCTInfo)
      RPCTInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RPCTInfo.newBuilder() to construct.
    private RPCTInfo(org.apache.hbase.thirdparty.com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RPCTInfo() {
      traceId_ = 0L;
      parentId_ = 0L;
    }

    @java.lang.Override
    public final org.apache.hbase.thirdparty.com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RPCTInfo(
        org.apache.hbase.thirdparty.com.google.protobuf.CodedInputStream input,
        org.apache.hbase.thirdparty.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hbase.thirdparty.com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      org.apache.hbase.thirdparty.com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          org.apache.hbase.thirdparty.com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              traceId_ = input.readInt64();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              parentId_ = input.readInt64();
              break;
            }
          }
        }
      } catch (org.apache.hbase.thirdparty.com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new org.apache.hbase.thirdparty.com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final org.apache.hbase.thirdparty.com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.hadoop.hbase.shaded.protobuf.generated.TracingProtos.internal_static_hbase_pb_RPCTInfo_descriptor;
    }

    protected org.apache.hbase.thirdparty.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.hadoop.hbase.shaded.protobuf.generated.TracingProtos.internal_static_hbase_pb_RPCTInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.hadoop.hbase.shaded.protobuf.generated.TracingProtos.RPCTInfo.class, org.apache.hadoop.hbase.shaded.protobuf.generated.TracingProtos.RPCTInfo.Builder.class);
    }

    private int bitField0_;
    public static final int TRACE_ID_FIELD_NUMBER = 1;
    private long traceId_;
    /**
     * <code>optional int64 trace_id = 1;</code>
     */
    public boolean hasTraceId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int64 trace_id = 1;</code>
     */
    public long getTraceId() {
      return traceId_;
    }

    public static final int PARENT_ID_FIELD_NUMBER = 2;
    private long parentId_;
    /**
     * <code>optional int64 parent_id = 2;</code>
     */
    public boolean hasParentId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int64 parent_id = 2;</code>
     */
    public long getParentId() {
      return parentId_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(org.apache.hbase.thirdparty.com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt64(1, traceId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt64(2, parentId_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += org.apache.hbase.thirdparty.com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, traceId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += org.apache.hbase.thirdparty.com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, parentId_);
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
      if (!(obj instanceof org.apache.hadoop.hbase.shaded.protobuf.generated.TracingProtos.RPCTInfo)) {
        return super.equals(obj);
      }
      org.apache.hadoop.hbase.shaded.protobuf.generated.TracingProtos.RPCTInfo other = (org.apache.hadoop.hbase.shaded.protobuf.generated.TracingProtos.RPCTInfo) obj;

      boolean result = true;
      result = result && (hasTraceId() == other.hasTraceId());
      if (hasTraceId()) {
        result = result && (getTraceId()
            == other.getTraceId());
      }
      result = result && (hasParentId() == other.hasParentId());
      if (hasParentId()) {
        result = result && (getParentId()
            == other.getParentId());
      }
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
      if (hasTraceId()) {
        hash = (37 * hash) + TRACE_ID_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hbase.thirdparty.com.google.protobuf.Internal.hashLong(
            getTraceId());
      }
      if (hasParentId()) {
        hash = (37 * hash) + PARENT_ID_FIELD_NUMBER;
        hash = (53 * hash) + org.apache.hbase.thirdparty.com.google.protobuf.Internal.hashLong(
            getParentId());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.apache.hadoop.hbase.shaded.protobuf.generated.TracingProtos.RPCTInfo parseFrom(
        java.nio.ByteBuffer data)
        throws org.apache.hbase.thirdparty.com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hbase.shaded.protobuf.generated.TracingProtos.RPCTInfo parseFrom(
        java.nio.ByteBuffer data,
        org.apache.hbase.thirdparty.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hbase.thirdparty.com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hbase.shaded.protobuf.generated.TracingProtos.RPCTInfo parseFrom(
        org.apache.hbase.thirdparty.com.google.protobuf.ByteString data)
        throws org.apache.hbase.thirdparty.com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hbase.shaded.protobuf.generated.TracingProtos.RPCTInfo parseFrom(
        org.apache.hbase.thirdparty.com.google.protobuf.ByteString data,
        org.apache.hbase.thirdparty.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hbase.thirdparty.com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hbase.shaded.protobuf.generated.TracingProtos.RPCTInfo parseFrom(byte[] data)
        throws org.apache.hbase.thirdparty.com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.apache.hadoop.hbase.shaded.protobuf.generated.TracingProtos.RPCTInfo parseFrom(
        byte[] data,
        org.apache.hbase.thirdparty.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.hbase.thirdparty.com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.apache.hadoop.hbase.shaded.protobuf.generated.TracingProtos.RPCTInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hbase.thirdparty.com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hbase.shaded.protobuf.generated.TracingProtos.RPCTInfo parseFrom(
        java.io.InputStream input,
        org.apache.hbase.thirdparty.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hbase.thirdparty.com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hbase.shaded.protobuf.generated.TracingProtos.RPCTInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return org.apache.hbase.thirdparty.com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hbase.shaded.protobuf.generated.TracingProtos.RPCTInfo parseDelimitedFrom(
        java.io.InputStream input,
        org.apache.hbase.thirdparty.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hbase.thirdparty.com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.apache.hadoop.hbase.shaded.protobuf.generated.TracingProtos.RPCTInfo parseFrom(
        org.apache.hbase.thirdparty.com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return org.apache.hbase.thirdparty.com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.apache.hadoop.hbase.shaded.protobuf.generated.TracingProtos.RPCTInfo parseFrom(
        org.apache.hbase.thirdparty.com.google.protobuf.CodedInputStream input,
        org.apache.hbase.thirdparty.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return org.apache.hbase.thirdparty.com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(org.apache.hadoop.hbase.shaded.protobuf.generated.TracingProtos.RPCTInfo prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        org.apache.hbase.thirdparty.com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     *Used to pass through the information necessary to continue
     *a trace after an RPC is made. All we need is the traceid 
     *(so we know the overarching trace this message is a part of), and
     *the id of the current span when this message was sent, so we know 
     *what span caused the new span we will create when this message is received.
     * </pre>
     *
     * Protobuf type {@code hbase.pb.RPCTInfo}
     */
    @javax.annotation.Generated("proto") public static final class Builder extends
        org.apache.hbase.thirdparty.com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:hbase.pb.RPCTInfo)
        org.apache.hadoop.hbase.shaded.protobuf.generated.TracingProtos.RPCTInfoOrBuilder {
      public static final org.apache.hbase.thirdparty.com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.apache.hadoop.hbase.shaded.protobuf.generated.TracingProtos.internal_static_hbase_pb_RPCTInfo_descriptor;
      }

      protected org.apache.hbase.thirdparty.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.apache.hadoop.hbase.shaded.protobuf.generated.TracingProtos.internal_static_hbase_pb_RPCTInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.apache.hadoop.hbase.shaded.protobuf.generated.TracingProtos.RPCTInfo.class, org.apache.hadoop.hbase.shaded.protobuf.generated.TracingProtos.RPCTInfo.Builder.class);
      }

      // Construct using org.apache.hadoop.hbase.shaded.protobuf.generated.TracingProtos.RPCTInfo.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          org.apache.hbase.thirdparty.com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (org.apache.hbase.thirdparty.com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        traceId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        parentId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public org.apache.hbase.thirdparty.com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.apache.hadoop.hbase.shaded.protobuf.generated.TracingProtos.internal_static_hbase_pb_RPCTInfo_descriptor;
      }

      public org.apache.hadoop.hbase.shaded.protobuf.generated.TracingProtos.RPCTInfo getDefaultInstanceForType() {
        return org.apache.hadoop.hbase.shaded.protobuf.generated.TracingProtos.RPCTInfo.getDefaultInstance();
      }

      public org.apache.hadoop.hbase.shaded.protobuf.generated.TracingProtos.RPCTInfo build() {
        org.apache.hadoop.hbase.shaded.protobuf.generated.TracingProtos.RPCTInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.apache.hadoop.hbase.shaded.protobuf.generated.TracingProtos.RPCTInfo buildPartial() {
        org.apache.hadoop.hbase.shaded.protobuf.generated.TracingProtos.RPCTInfo result = new org.apache.hadoop.hbase.shaded.protobuf.generated.TracingProtos.RPCTInfo(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.traceId_ = traceId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.parentId_ = parentId_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          org.apache.hbase.thirdparty.com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          org.apache.hbase.thirdparty.com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          org.apache.hbase.thirdparty.com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          org.apache.hbase.thirdparty.com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          org.apache.hbase.thirdparty.com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(org.apache.hbase.thirdparty.com.google.protobuf.Message other) {
        if (other instanceof org.apache.hadoop.hbase.shaded.protobuf.generated.TracingProtos.RPCTInfo) {
          return mergeFrom((org.apache.hadoop.hbase.shaded.protobuf.generated.TracingProtos.RPCTInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.apache.hadoop.hbase.shaded.protobuf.generated.TracingProtos.RPCTInfo other) {
        if (other == org.apache.hadoop.hbase.shaded.protobuf.generated.TracingProtos.RPCTInfo.getDefaultInstance()) return this;
        if (other.hasTraceId()) {
          setTraceId(other.getTraceId());
        }
        if (other.hasParentId()) {
          setParentId(other.getParentId());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          org.apache.hbase.thirdparty.com.google.protobuf.CodedInputStream input,
          org.apache.hbase.thirdparty.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.apache.hadoop.hbase.shaded.protobuf.generated.TracingProtos.RPCTInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (org.apache.hbase.thirdparty.com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.apache.hadoop.hbase.shaded.protobuf.generated.TracingProtos.RPCTInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long traceId_ ;
      /**
       * <code>optional int64 trace_id = 1;</code>
       */
      public boolean hasTraceId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int64 trace_id = 1;</code>
       */
      public long getTraceId() {
        return traceId_;
      }
      /**
       * <code>optional int64 trace_id = 1;</code>
       */
      public Builder setTraceId(long value) {
        bitField0_ |= 0x00000001;
        traceId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 trace_id = 1;</code>
       */
      public Builder clearTraceId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        traceId_ = 0L;
        onChanged();
        return this;
      }

      private long parentId_ ;
      /**
       * <code>optional int64 parent_id = 2;</code>
       */
      public boolean hasParentId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int64 parent_id = 2;</code>
       */
      public long getParentId() {
        return parentId_;
      }
      /**
       * <code>optional int64 parent_id = 2;</code>
       */
      public Builder setParentId(long value) {
        bitField0_ |= 0x00000002;
        parentId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 parent_id = 2;</code>
       */
      public Builder clearParentId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        parentId_ = 0L;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final org.apache.hbase.thirdparty.com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final org.apache.hbase.thirdparty.com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:hbase.pb.RPCTInfo)
    }

    // @@protoc_insertion_point(class_scope:hbase.pb.RPCTInfo)
    private static final org.apache.hadoop.hbase.shaded.protobuf.generated.TracingProtos.RPCTInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.apache.hadoop.hbase.shaded.protobuf.generated.TracingProtos.RPCTInfo();
    }

    public static org.apache.hadoop.hbase.shaded.protobuf.generated.TracingProtos.RPCTInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final org.apache.hbase.thirdparty.com.google.protobuf.Parser<RPCTInfo>
        PARSER = new org.apache.hbase.thirdparty.com.google.protobuf.AbstractParser<RPCTInfo>() {
      public RPCTInfo parsePartialFrom(
          org.apache.hbase.thirdparty.com.google.protobuf.CodedInputStream input,
          org.apache.hbase.thirdparty.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws org.apache.hbase.thirdparty.com.google.protobuf.InvalidProtocolBufferException {
        return new RPCTInfo(input, extensionRegistry);
      }
    };

    public static org.apache.hbase.thirdparty.com.google.protobuf.Parser<RPCTInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public org.apache.hbase.thirdparty.com.google.protobuf.Parser<RPCTInfo> getParserForType() {
      return PARSER;
    }

    public org.apache.hadoop.hbase.shaded.protobuf.generated.TracingProtos.RPCTInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final org.apache.hbase.thirdparty.com.google.protobuf.Descriptors.Descriptor
    internal_static_hbase_pb_RPCTInfo_descriptor;
  private static final 
    org.apache.hbase.thirdparty.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hbase_pb_RPCTInfo_fieldAccessorTable;

  public static org.apache.hbase.thirdparty.com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  org.apache.hbase.thirdparty.com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rTracing.proto\022\010hbase.pb\"/\n\010RPCTInfo\022\020\n" +
      "\010trace_id\030\001 \001(\003\022\021\n\tparent_id\030\002 \001(\003BG\n1or" +
      "g.apache.hadoop.hbase.shaded.protobuf.ge" +
      "neratedB\rTracingProtosH\001\240\001\001"
    };
    org.apache.hbase.thirdparty.com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new org.apache.hbase.thirdparty.com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public org.apache.hbase.thirdparty.com.google.protobuf.ExtensionRegistry assignDescriptors(
              org.apache.hbase.thirdparty.com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    org.apache.hbase.thirdparty.com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new org.apache.hbase.thirdparty.com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_hbase_pb_RPCTInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_hbase_pb_RPCTInfo_fieldAccessorTable = new
      org.apache.hbase.thirdparty.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hbase_pb_RPCTInfo_descriptor,
        new java.lang.String[] { "TraceId", "ParentId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
