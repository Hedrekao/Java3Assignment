// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ProductRetrieval.proto

package via.sdj3.animalregistrationapi.protobuf;

/**
 * Protobuf type {@code ProductMessage}
 */
public final class ProductMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ProductMessage)
    ProductMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProductMessage.newBuilder() to construct.
  private ProductMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProductMessage() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ProductMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ProductMessage(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 8: {

            id_ = input.readInt32();
            break;
          }
          case 17: {

            price_ = input.readDouble();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 34: {
            via.sdj3.animalregistrationapi.protobuf.AnimalListMessage.Builder subBuilder = null;
            if (animals_ != null) {
              subBuilder = animals_.toBuilder();
            }
            animals_ = input.readMessage(via.sdj3.animalregistrationapi.protobuf.AnimalListMessage.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(animals_);
              animals_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
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
    return via.sdj3.animalregistrationapi.protobuf.ProductRetrieval.internal_static_ProductMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return via.sdj3.animalregistrationapi.protobuf.ProductRetrieval.internal_static_ProductMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            via.sdj3.animalregistrationapi.protobuf.ProductMessage.class, via.sdj3.animalregistrationapi.protobuf.ProductMessage.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private int id_;
  /**
   * <code>int32 id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public int getId() {
    return id_;
  }

  public static final int PRICE_FIELD_NUMBER = 2;
  private double price_;
  /**
   * <code>double price = 2;</code>
   * @return The price.
   */
  @java.lang.Override
  public double getPrice() {
    return price_;
  }

  public static final int NAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 3;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 3;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ANIMALS_FIELD_NUMBER = 4;
  private via.sdj3.animalregistrationapi.protobuf.AnimalListMessage animals_;
  /**
   * <code>.AnimalListMessage animals = 4;</code>
   * @return Whether the animals field is set.
   */
  @java.lang.Override
  public boolean hasAnimals() {
    return animals_ != null;
  }
  /**
   * <code>.AnimalListMessage animals = 4;</code>
   * @return The animals.
   */
  @java.lang.Override
  public via.sdj3.animalregistrationapi.protobuf.AnimalListMessage getAnimals() {
    return animals_ == null ? via.sdj3.animalregistrationapi.protobuf.AnimalListMessage.getDefaultInstance() : animals_;
  }
  /**
   * <code>.AnimalListMessage animals = 4;</code>
   */
  @java.lang.Override
  public via.sdj3.animalregistrationapi.protobuf.AnimalListMessageOrBuilder getAnimalsOrBuilder() {
    return getAnimals();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (id_ != 0) {
      output.writeInt32(1, id_);
    }
    if (java.lang.Double.doubleToRawLongBits(price_) != 0) {
      output.writeDouble(2, price_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, name_);
    }
    if (animals_ != null) {
      output.writeMessage(4, getAnimals());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, id_);
    }
    if (java.lang.Double.doubleToRawLongBits(price_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, price_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, name_);
    }
    if (animals_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getAnimals());
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
    if (!(obj instanceof via.sdj3.animalregistrationapi.protobuf.ProductMessage)) {
      return super.equals(obj);
    }
    via.sdj3.animalregistrationapi.protobuf.ProductMessage other = (via.sdj3.animalregistrationapi.protobuf.ProductMessage) obj;

    if (getId()
        != other.getId()) return false;
    if (java.lang.Double.doubleToLongBits(getPrice())
        != java.lang.Double.doubleToLongBits(
            other.getPrice())) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (hasAnimals() != other.hasAnimals()) return false;
    if (hasAnimals()) {
      if (!getAnimals()
          .equals(other.getAnimals())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId();
    hash = (37 * hash) + PRICE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getPrice()));
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasAnimals()) {
      hash = (37 * hash) + ANIMALS_FIELD_NUMBER;
      hash = (53 * hash) + getAnimals().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static via.sdj3.animalregistrationapi.protobuf.ProductMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sdj3.animalregistrationapi.protobuf.ProductMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sdj3.animalregistrationapi.protobuf.ProductMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sdj3.animalregistrationapi.protobuf.ProductMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sdj3.animalregistrationapi.protobuf.ProductMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sdj3.animalregistrationapi.protobuf.ProductMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sdj3.animalregistrationapi.protobuf.ProductMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static via.sdj3.animalregistrationapi.protobuf.ProductMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static via.sdj3.animalregistrationapi.protobuf.ProductMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static via.sdj3.animalregistrationapi.protobuf.ProductMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static via.sdj3.animalregistrationapi.protobuf.ProductMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static via.sdj3.animalregistrationapi.protobuf.ProductMessage parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(via.sdj3.animalregistrationapi.protobuf.ProductMessage prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code ProductMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ProductMessage)
      via.sdj3.animalregistrationapi.protobuf.ProductMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return via.sdj3.animalregistrationapi.protobuf.ProductRetrieval.internal_static_ProductMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return via.sdj3.animalregistrationapi.protobuf.ProductRetrieval.internal_static_ProductMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              via.sdj3.animalregistrationapi.protobuf.ProductMessage.class, via.sdj3.animalregistrationapi.protobuf.ProductMessage.Builder.class);
    }

    // Construct using via.sdj3.animalregistrationapi.protobuf.ProductMessage.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = 0;

      price_ = 0D;

      name_ = "";

      if (animalsBuilder_ == null) {
        animals_ = null;
      } else {
        animals_ = null;
        animalsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return via.sdj3.animalregistrationapi.protobuf.ProductRetrieval.internal_static_ProductMessage_descriptor;
    }

    @java.lang.Override
    public via.sdj3.animalregistrationapi.protobuf.ProductMessage getDefaultInstanceForType() {
      return via.sdj3.animalregistrationapi.protobuf.ProductMessage.getDefaultInstance();
    }

    @java.lang.Override
    public via.sdj3.animalregistrationapi.protobuf.ProductMessage build() {
      via.sdj3.animalregistrationapi.protobuf.ProductMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public via.sdj3.animalregistrationapi.protobuf.ProductMessage buildPartial() {
      via.sdj3.animalregistrationapi.protobuf.ProductMessage result = new via.sdj3.animalregistrationapi.protobuf.ProductMessage(this);
      result.id_ = id_;
      result.price_ = price_;
      result.name_ = name_;
      if (animalsBuilder_ == null) {
        result.animals_ = animals_;
      } else {
        result.animals_ = animalsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof via.sdj3.animalregistrationapi.protobuf.ProductMessage) {
        return mergeFrom((via.sdj3.animalregistrationapi.protobuf.ProductMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(via.sdj3.animalregistrationapi.protobuf.ProductMessage other) {
      if (other == via.sdj3.animalregistrationapi.protobuf.ProductMessage.getDefaultInstance()) return this;
      if (other.getId() != 0) {
        setId(other.getId());
      }
      if (other.getPrice() != 0D) {
        setPrice(other.getPrice());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.hasAnimals()) {
        mergeAnimals(other.getAnimals());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      via.sdj3.animalregistrationapi.protobuf.ProductMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (via.sdj3.animalregistrationapi.protobuf.ProductMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int id_ ;
    /**
     * <code>int32 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }
    /**
     * <code>int32 id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(int value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = 0;
      onChanged();
      return this;
    }

    private double price_ ;
    /**
     * <code>double price = 2;</code>
     * @return The price.
     */
    @java.lang.Override
    public double getPrice() {
      return price_;
    }
    /**
     * <code>double price = 2;</code>
     * @param value The price to set.
     * @return This builder for chaining.
     */
    public Builder setPrice(double value) {
      
      price_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double price = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPrice() {
      
      price_ = 0D;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 3;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 3;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 3;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 3;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private via.sdj3.animalregistrationapi.protobuf.AnimalListMessage animals_;
    private com.google.protobuf.SingleFieldBuilderV3<
        via.sdj3.animalregistrationapi.protobuf.AnimalListMessage, via.sdj3.animalregistrationapi.protobuf.AnimalListMessage.Builder, via.sdj3.animalregistrationapi.protobuf.AnimalListMessageOrBuilder> animalsBuilder_;
    /**
     * <code>.AnimalListMessage animals = 4;</code>
     * @return Whether the animals field is set.
     */
    public boolean hasAnimals() {
      return animalsBuilder_ != null || animals_ != null;
    }
    /**
     * <code>.AnimalListMessage animals = 4;</code>
     * @return The animals.
     */
    public via.sdj3.animalregistrationapi.protobuf.AnimalListMessage getAnimals() {
      if (animalsBuilder_ == null) {
        return animals_ == null ? via.sdj3.animalregistrationapi.protobuf.AnimalListMessage.getDefaultInstance() : animals_;
      } else {
        return animalsBuilder_.getMessage();
      }
    }
    /**
     * <code>.AnimalListMessage animals = 4;</code>
     */
    public Builder setAnimals(via.sdj3.animalregistrationapi.protobuf.AnimalListMessage value) {
      if (animalsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        animals_ = value;
        onChanged();
      } else {
        animalsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.AnimalListMessage animals = 4;</code>
     */
    public Builder setAnimals(
        via.sdj3.animalregistrationapi.protobuf.AnimalListMessage.Builder builderForValue) {
      if (animalsBuilder_ == null) {
        animals_ = builderForValue.build();
        onChanged();
      } else {
        animalsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.AnimalListMessage animals = 4;</code>
     */
    public Builder mergeAnimals(via.sdj3.animalregistrationapi.protobuf.AnimalListMessage value) {
      if (animalsBuilder_ == null) {
        if (animals_ != null) {
          animals_ =
            via.sdj3.animalregistrationapi.protobuf.AnimalListMessage.newBuilder(animals_).mergeFrom(value).buildPartial();
        } else {
          animals_ = value;
        }
        onChanged();
      } else {
        animalsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.AnimalListMessage animals = 4;</code>
     */
    public Builder clearAnimals() {
      if (animalsBuilder_ == null) {
        animals_ = null;
        onChanged();
      } else {
        animals_ = null;
        animalsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.AnimalListMessage animals = 4;</code>
     */
    public via.sdj3.animalregistrationapi.protobuf.AnimalListMessage.Builder getAnimalsBuilder() {
      
      onChanged();
      return getAnimalsFieldBuilder().getBuilder();
    }
    /**
     * <code>.AnimalListMessage animals = 4;</code>
     */
    public via.sdj3.animalregistrationapi.protobuf.AnimalListMessageOrBuilder getAnimalsOrBuilder() {
      if (animalsBuilder_ != null) {
        return animalsBuilder_.getMessageOrBuilder();
      } else {
        return animals_ == null ?
            via.sdj3.animalregistrationapi.protobuf.AnimalListMessage.getDefaultInstance() : animals_;
      }
    }
    /**
     * <code>.AnimalListMessage animals = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        via.sdj3.animalregistrationapi.protobuf.AnimalListMessage, via.sdj3.animalregistrationapi.protobuf.AnimalListMessage.Builder, via.sdj3.animalregistrationapi.protobuf.AnimalListMessageOrBuilder> 
        getAnimalsFieldBuilder() {
      if (animalsBuilder_ == null) {
        animalsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            via.sdj3.animalregistrationapi.protobuf.AnimalListMessage, via.sdj3.animalregistrationapi.protobuf.AnimalListMessage.Builder, via.sdj3.animalregistrationapi.protobuf.AnimalListMessageOrBuilder>(
                getAnimals(),
                getParentForChildren(),
                isClean());
        animals_ = null;
      }
      return animalsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:ProductMessage)
  }

  // @@protoc_insertion_point(class_scope:ProductMessage)
  private static final via.sdj3.animalregistrationapi.protobuf.ProductMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new via.sdj3.animalregistrationapi.protobuf.ProductMessage();
  }

  public static via.sdj3.animalregistrationapi.protobuf.ProductMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProductMessage>
      PARSER = new com.google.protobuf.AbstractParser<ProductMessage>() {
    @java.lang.Override
    public ProductMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ProductMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ProductMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProductMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public via.sdj3.animalregistrationapi.protobuf.ProductMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
