// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AnimalRetrieval.proto

package via.sdj3.animalregistrationapi.protobuf;

public final class AnimalRetrieval {
  private AnimalRetrieval() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AnimalMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AnimalMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_IdMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_IdMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AnimalListMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AnimalListMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_StringParameterMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_StringParameterMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_NullMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_NullMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RegistrationNumbersMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RegistrationNumbersMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025AnimalRetrieval.proto\"Y\n\rAnimalMessage" +
      "\022\032\n\022registrationNumber\030\001 \001(\005\022\016\n\006weight\030\002" +
      " \001(\001\022\014\n\004date\030\003 \001(\t\022\016\n\006origin\030\004 \001(\t\"\027\n\tId" +
      "Message\022\n\n\002id\030\001 \001(\005\"4\n\021AnimalListMessage" +
      "\022\037\n\007animals\030\001 \003(\0132\016.AnimalMessage\"\'\n\026Str" +
      "ingParameterMessage\022\r\n\005value\030\001 \001(\t\"\r\n\013Nu" +
      "llMessage\"9\n\032RegistrationNumbersMessage\022" +
      "\033\n\023registrationNumbers\030\001 \003(\0052\304\003\n\016Animals" +
      "Service\022.\n\014createAnimal\022\016.AnimalMessage\032" +
      "\016.AnimalMessage\022+\n\rgetAnimalById\022\n.IdMes" +
      "sage\032\016.AnimalMessage\022(\n\014deleteAnimal\022\n.I" +
      "dMessage\032\014.NullMessage\022,\n\014updateAnimal\022\016" +
      ".AnimalMessage\032\014.NullMessage\022*\n\006getAll\022\014" +
      ".NullMessage\032\022.AnimalListMessage\022:\n\013getB" +
      "yOrigin\022\027.StringParameterMessage\032\022.Anima" +
      "lListMessage\0228\n\tgetByDate\022\027.StringParame" +
      "terMessage\032\022.AnimalListMessage\022[\n0getReg" +
      "istrationNumbersOfAnimalsInvolvedInProdu" +
      "ct\022\n.IdMessage\032\033.RegistrationNumbersMess" +
      "ageB+\n\'via.sdj3.animalregistrationapi.pr" +
      "otobufP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AnimalMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AnimalMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AnimalMessage_descriptor,
        new java.lang.String[] { "RegistrationNumber", "Weight", "Date", "Origin", });
    internal_static_IdMessage_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_IdMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_IdMessage_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_AnimalListMessage_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_AnimalListMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AnimalListMessage_descriptor,
        new java.lang.String[] { "Animals", });
    internal_static_StringParameterMessage_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_StringParameterMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_StringParameterMessage_descriptor,
        new java.lang.String[] { "Value", });
    internal_static_NullMessage_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_NullMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_NullMessage_descriptor,
        new java.lang.String[] { });
    internal_static_RegistrationNumbersMessage_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_RegistrationNumbersMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RegistrationNumbersMessage_descriptor,
        new java.lang.String[] { "RegistrationNumbers", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}