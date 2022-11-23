package via.sdj3.animalregistrationapi.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * service definitions
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: AnimalRetrieval.proto")
public final class AnimalsServiceGrpc {

  private AnimalsServiceGrpc() {}

  public static final String SERVICE_NAME = "AnimalsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<via.sdj3.animalregistrationapi.protobuf.AnimalMessage,
      via.sdj3.animalregistrationapi.protobuf.AnimalMessage> getCreateAnimalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createAnimal",
      requestType = via.sdj3.animalregistrationapi.protobuf.AnimalMessage.class,
      responseType = via.sdj3.animalregistrationapi.protobuf.AnimalMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.animalregistrationapi.protobuf.AnimalMessage,
      via.sdj3.animalregistrationapi.protobuf.AnimalMessage> getCreateAnimalMethod() {
    io.grpc.MethodDescriptor<via.sdj3.animalregistrationapi.protobuf.AnimalMessage, via.sdj3.animalregistrationapi.protobuf.AnimalMessage> getCreateAnimalMethod;
    if ((getCreateAnimalMethod = AnimalsServiceGrpc.getCreateAnimalMethod) == null) {
      synchronized (AnimalsServiceGrpc.class) {
        if ((getCreateAnimalMethod = AnimalsServiceGrpc.getCreateAnimalMethod) == null) {
          AnimalsServiceGrpc.getCreateAnimalMethod = getCreateAnimalMethod =
              io.grpc.MethodDescriptor.<via.sdj3.animalregistrationapi.protobuf.AnimalMessage, via.sdj3.animalregistrationapi.protobuf.AnimalMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createAnimal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationapi.protobuf.AnimalMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationapi.protobuf.AnimalMessage.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalsServiceMethodDescriptorSupplier("createAnimal"))
              .build();
        }
      }
    }
    return getCreateAnimalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sdj3.animalregistrationapi.protobuf.IdMessage,
      via.sdj3.animalregistrationapi.protobuf.AnimalMessage> getGetAnimalByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAnimalById",
      requestType = via.sdj3.animalregistrationapi.protobuf.IdMessage.class,
      responseType = via.sdj3.animalregistrationapi.protobuf.AnimalMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.animalregistrationapi.protobuf.IdMessage,
      via.sdj3.animalregistrationapi.protobuf.AnimalMessage> getGetAnimalByIdMethod() {
    io.grpc.MethodDescriptor<via.sdj3.animalregistrationapi.protobuf.IdMessage, via.sdj3.animalregistrationapi.protobuf.AnimalMessage> getGetAnimalByIdMethod;
    if ((getGetAnimalByIdMethod = AnimalsServiceGrpc.getGetAnimalByIdMethod) == null) {
      synchronized (AnimalsServiceGrpc.class) {
        if ((getGetAnimalByIdMethod = AnimalsServiceGrpc.getGetAnimalByIdMethod) == null) {
          AnimalsServiceGrpc.getGetAnimalByIdMethod = getGetAnimalByIdMethod =
              io.grpc.MethodDescriptor.<via.sdj3.animalregistrationapi.protobuf.IdMessage, via.sdj3.animalregistrationapi.protobuf.AnimalMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAnimalById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationapi.protobuf.IdMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationapi.protobuf.AnimalMessage.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalsServiceMethodDescriptorSupplier("getAnimalById"))
              .build();
        }
      }
    }
    return getGetAnimalByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sdj3.animalregistrationapi.protobuf.IdMessage,
      via.sdj3.animalregistrationapi.protobuf.NullMessage> getDeleteAnimalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteAnimal",
      requestType = via.sdj3.animalregistrationapi.protobuf.IdMessage.class,
      responseType = via.sdj3.animalregistrationapi.protobuf.NullMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.animalregistrationapi.protobuf.IdMessage,
      via.sdj3.animalregistrationapi.protobuf.NullMessage> getDeleteAnimalMethod() {
    io.grpc.MethodDescriptor<via.sdj3.animalregistrationapi.protobuf.IdMessage, via.sdj3.animalregistrationapi.protobuf.NullMessage> getDeleteAnimalMethod;
    if ((getDeleteAnimalMethod = AnimalsServiceGrpc.getDeleteAnimalMethod) == null) {
      synchronized (AnimalsServiceGrpc.class) {
        if ((getDeleteAnimalMethod = AnimalsServiceGrpc.getDeleteAnimalMethod) == null) {
          AnimalsServiceGrpc.getDeleteAnimalMethod = getDeleteAnimalMethod =
              io.grpc.MethodDescriptor.<via.sdj3.animalregistrationapi.protobuf.IdMessage, via.sdj3.animalregistrationapi.protobuf.NullMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteAnimal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationapi.protobuf.IdMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationapi.protobuf.NullMessage.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalsServiceMethodDescriptorSupplier("deleteAnimal"))
              .build();
        }
      }
    }
    return getDeleteAnimalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sdj3.animalregistrationapi.protobuf.AnimalMessage,
      via.sdj3.animalregistrationapi.protobuf.NullMessage> getUpdateAnimalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateAnimal",
      requestType = via.sdj3.animalregistrationapi.protobuf.AnimalMessage.class,
      responseType = via.sdj3.animalregistrationapi.protobuf.NullMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.animalregistrationapi.protobuf.AnimalMessage,
      via.sdj3.animalregistrationapi.protobuf.NullMessage> getUpdateAnimalMethod() {
    io.grpc.MethodDescriptor<via.sdj3.animalregistrationapi.protobuf.AnimalMessage, via.sdj3.animalregistrationapi.protobuf.NullMessage> getUpdateAnimalMethod;
    if ((getUpdateAnimalMethod = AnimalsServiceGrpc.getUpdateAnimalMethod) == null) {
      synchronized (AnimalsServiceGrpc.class) {
        if ((getUpdateAnimalMethod = AnimalsServiceGrpc.getUpdateAnimalMethod) == null) {
          AnimalsServiceGrpc.getUpdateAnimalMethod = getUpdateAnimalMethod =
              io.grpc.MethodDescriptor.<via.sdj3.animalregistrationapi.protobuf.AnimalMessage, via.sdj3.animalregistrationapi.protobuf.NullMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateAnimal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationapi.protobuf.AnimalMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationapi.protobuf.NullMessage.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalsServiceMethodDescriptorSupplier("updateAnimal"))
              .build();
        }
      }
    }
    return getUpdateAnimalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sdj3.animalregistrationapi.protobuf.NullMessage,
      via.sdj3.animalregistrationapi.protobuf.AnimalListMessage> getGetAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAll",
      requestType = via.sdj3.animalregistrationapi.protobuf.NullMessage.class,
      responseType = via.sdj3.animalregistrationapi.protobuf.AnimalListMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.animalregistrationapi.protobuf.NullMessage,
      via.sdj3.animalregistrationapi.protobuf.AnimalListMessage> getGetAllMethod() {
    io.grpc.MethodDescriptor<via.sdj3.animalregistrationapi.protobuf.NullMessage, via.sdj3.animalregistrationapi.protobuf.AnimalListMessage> getGetAllMethod;
    if ((getGetAllMethod = AnimalsServiceGrpc.getGetAllMethod) == null) {
      synchronized (AnimalsServiceGrpc.class) {
        if ((getGetAllMethod = AnimalsServiceGrpc.getGetAllMethod) == null) {
          AnimalsServiceGrpc.getGetAllMethod = getGetAllMethod =
              io.grpc.MethodDescriptor.<via.sdj3.animalregistrationapi.protobuf.NullMessage, via.sdj3.animalregistrationapi.protobuf.AnimalListMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationapi.protobuf.NullMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationapi.protobuf.AnimalListMessage.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalsServiceMethodDescriptorSupplier("getAll"))
              .build();
        }
      }
    }
    return getGetAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sdj3.animalregistrationapi.protobuf.StringParameterMessage,
      via.sdj3.animalregistrationapi.protobuf.AnimalListMessage> getGetByOriginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getByOrigin",
      requestType = via.sdj3.animalregistrationapi.protobuf.StringParameterMessage.class,
      responseType = via.sdj3.animalregistrationapi.protobuf.AnimalListMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.animalregistrationapi.protobuf.StringParameterMessage,
      via.sdj3.animalregistrationapi.protobuf.AnimalListMessage> getGetByOriginMethod() {
    io.grpc.MethodDescriptor<via.sdj3.animalregistrationapi.protobuf.StringParameterMessage, via.sdj3.animalregistrationapi.protobuf.AnimalListMessage> getGetByOriginMethod;
    if ((getGetByOriginMethod = AnimalsServiceGrpc.getGetByOriginMethod) == null) {
      synchronized (AnimalsServiceGrpc.class) {
        if ((getGetByOriginMethod = AnimalsServiceGrpc.getGetByOriginMethod) == null) {
          AnimalsServiceGrpc.getGetByOriginMethod = getGetByOriginMethod =
              io.grpc.MethodDescriptor.<via.sdj3.animalregistrationapi.protobuf.StringParameterMessage, via.sdj3.animalregistrationapi.protobuf.AnimalListMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getByOrigin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationapi.protobuf.StringParameterMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationapi.protobuf.AnimalListMessage.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalsServiceMethodDescriptorSupplier("getByOrigin"))
              .build();
        }
      }
    }
    return getGetByOriginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sdj3.animalregistrationapi.protobuf.StringParameterMessage,
      via.sdj3.animalregistrationapi.protobuf.AnimalListMessage> getGetByDateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getByDate",
      requestType = via.sdj3.animalregistrationapi.protobuf.StringParameterMessage.class,
      responseType = via.sdj3.animalregistrationapi.protobuf.AnimalListMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.animalregistrationapi.protobuf.StringParameterMessage,
      via.sdj3.animalregistrationapi.protobuf.AnimalListMessage> getGetByDateMethod() {
    io.grpc.MethodDescriptor<via.sdj3.animalregistrationapi.protobuf.StringParameterMessage, via.sdj3.animalregistrationapi.protobuf.AnimalListMessage> getGetByDateMethod;
    if ((getGetByDateMethod = AnimalsServiceGrpc.getGetByDateMethod) == null) {
      synchronized (AnimalsServiceGrpc.class) {
        if ((getGetByDateMethod = AnimalsServiceGrpc.getGetByDateMethod) == null) {
          AnimalsServiceGrpc.getGetByDateMethod = getGetByDateMethod =
              io.grpc.MethodDescriptor.<via.sdj3.animalregistrationapi.protobuf.StringParameterMessage, via.sdj3.animalregistrationapi.protobuf.AnimalListMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getByDate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationapi.protobuf.StringParameterMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationapi.protobuf.AnimalListMessage.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalsServiceMethodDescriptorSupplier("getByDate"))
              .build();
        }
      }
    }
    return getGetByDateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sdj3.animalregistrationapi.protobuf.IdMessage,
      via.sdj3.animalregistrationapi.protobuf.RegistrationNumbersMessage> getGetRegistrationNumbersOfAnimalsInvolvedInProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getRegistrationNumbersOfAnimalsInvolvedInProduct",
      requestType = via.sdj3.animalregistrationapi.protobuf.IdMessage.class,
      responseType = via.sdj3.animalregistrationapi.protobuf.RegistrationNumbersMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.animalregistrationapi.protobuf.IdMessage,
      via.sdj3.animalregistrationapi.protobuf.RegistrationNumbersMessage> getGetRegistrationNumbersOfAnimalsInvolvedInProductMethod() {
    io.grpc.MethodDescriptor<via.sdj3.animalregistrationapi.protobuf.IdMessage, via.sdj3.animalregistrationapi.protobuf.RegistrationNumbersMessage> getGetRegistrationNumbersOfAnimalsInvolvedInProductMethod;
    if ((getGetRegistrationNumbersOfAnimalsInvolvedInProductMethod = AnimalsServiceGrpc.getGetRegistrationNumbersOfAnimalsInvolvedInProductMethod) == null) {
      synchronized (AnimalsServiceGrpc.class) {
        if ((getGetRegistrationNumbersOfAnimalsInvolvedInProductMethod = AnimalsServiceGrpc.getGetRegistrationNumbersOfAnimalsInvolvedInProductMethod) == null) {
          AnimalsServiceGrpc.getGetRegistrationNumbersOfAnimalsInvolvedInProductMethod = getGetRegistrationNumbersOfAnimalsInvolvedInProductMethod =
              io.grpc.MethodDescriptor.<via.sdj3.animalregistrationapi.protobuf.IdMessage, via.sdj3.animalregistrationapi.protobuf.RegistrationNumbersMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getRegistrationNumbersOfAnimalsInvolvedInProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationapi.protobuf.IdMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationapi.protobuf.RegistrationNumbersMessage.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalsServiceMethodDescriptorSupplier("getRegistrationNumbersOfAnimalsInvolvedInProduct"))
              .build();
        }
      }
    }
    return getGetRegistrationNumbersOfAnimalsInvolvedInProductMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AnimalsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AnimalsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AnimalsServiceStub>() {
        @java.lang.Override
        public AnimalsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AnimalsServiceStub(channel, callOptions);
        }
      };
    return AnimalsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AnimalsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AnimalsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AnimalsServiceBlockingStub>() {
        @java.lang.Override
        public AnimalsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AnimalsServiceBlockingStub(channel, callOptions);
        }
      };
    return AnimalsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AnimalsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AnimalsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AnimalsServiceFutureStub>() {
        @java.lang.Override
        public AnimalsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AnimalsServiceFutureStub(channel, callOptions);
        }
      };
    return AnimalsServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * service definitions
   * </pre>
   */
  public static abstract class AnimalsServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createAnimal(via.sdj3.animalregistrationapi.protobuf.AnimalMessage request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationapi.protobuf.AnimalMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAnimalMethod(), responseObserver);
    }

    /**
     */
    public void getAnimalById(via.sdj3.animalregistrationapi.protobuf.IdMessage request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationapi.protobuf.AnimalMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAnimalByIdMethod(), responseObserver);
    }

    /**
     */
    public void deleteAnimal(via.sdj3.animalregistrationapi.protobuf.IdMessage request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationapi.protobuf.NullMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAnimalMethod(), responseObserver);
    }

    /**
     */
    public void updateAnimal(via.sdj3.animalregistrationapi.protobuf.AnimalMessage request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationapi.protobuf.NullMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAnimalMethod(), responseObserver);
    }

    /**
     */
    public void getAll(via.sdj3.animalregistrationapi.protobuf.NullMessage request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationapi.protobuf.AnimalListMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllMethod(), responseObserver);
    }

    /**
     */
    public void getByOrigin(via.sdj3.animalregistrationapi.protobuf.StringParameterMessage request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationapi.protobuf.AnimalListMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetByOriginMethod(), responseObserver);
    }

    /**
     */
    public void getByDate(via.sdj3.animalregistrationapi.protobuf.StringParameterMessage request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationapi.protobuf.AnimalListMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetByDateMethod(), responseObserver);
    }

    /**
     */
    public void getRegistrationNumbersOfAnimalsInvolvedInProduct(via.sdj3.animalregistrationapi.protobuf.IdMessage request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationapi.protobuf.RegistrationNumbersMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRegistrationNumbersOfAnimalsInvolvedInProductMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateAnimalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.animalregistrationapi.protobuf.AnimalMessage,
                via.sdj3.animalregistrationapi.protobuf.AnimalMessage>(
                  this, METHODID_CREATE_ANIMAL)))
          .addMethod(
            getGetAnimalByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.animalregistrationapi.protobuf.IdMessage,
                via.sdj3.animalregistrationapi.protobuf.AnimalMessage>(
                  this, METHODID_GET_ANIMAL_BY_ID)))
          .addMethod(
            getDeleteAnimalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.animalregistrationapi.protobuf.IdMessage,
                via.sdj3.animalregistrationapi.protobuf.NullMessage>(
                  this, METHODID_DELETE_ANIMAL)))
          .addMethod(
            getUpdateAnimalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.animalregistrationapi.protobuf.AnimalMessage,
                via.sdj3.animalregistrationapi.protobuf.NullMessage>(
                  this, METHODID_UPDATE_ANIMAL)))
          .addMethod(
            getGetAllMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.animalregistrationapi.protobuf.NullMessage,
                via.sdj3.animalregistrationapi.protobuf.AnimalListMessage>(
                  this, METHODID_GET_ALL)))
          .addMethod(
            getGetByOriginMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.animalregistrationapi.protobuf.StringParameterMessage,
                via.sdj3.animalregistrationapi.protobuf.AnimalListMessage>(
                  this, METHODID_GET_BY_ORIGIN)))
          .addMethod(
            getGetByDateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.animalregistrationapi.protobuf.StringParameterMessage,
                via.sdj3.animalregistrationapi.protobuf.AnimalListMessage>(
                  this, METHODID_GET_BY_DATE)))
          .addMethod(
            getGetRegistrationNumbersOfAnimalsInvolvedInProductMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.animalregistrationapi.protobuf.IdMessage,
                via.sdj3.animalregistrationapi.protobuf.RegistrationNumbersMessage>(
                  this, METHODID_GET_REGISTRATION_NUMBERS_OF_ANIMALS_INVOLVED_IN_PRODUCT)))
          .build();
    }
  }

  /**
   * <pre>
   * service definitions
   * </pre>
   */
  public static final class AnimalsServiceStub extends io.grpc.stub.AbstractAsyncStub<AnimalsServiceStub> {
    private AnimalsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnimalsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AnimalsServiceStub(channel, callOptions);
    }

    /**
     */
    public void createAnimal(via.sdj3.animalregistrationapi.protobuf.AnimalMessage request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationapi.protobuf.AnimalMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAnimalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAnimalById(via.sdj3.animalregistrationapi.protobuf.IdMessage request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationapi.protobuf.AnimalMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAnimalByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteAnimal(via.sdj3.animalregistrationapi.protobuf.IdMessage request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationapi.protobuf.NullMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAnimalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateAnimal(via.sdj3.animalregistrationapi.protobuf.AnimalMessage request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationapi.protobuf.NullMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAnimalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAll(via.sdj3.animalregistrationapi.protobuf.NullMessage request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationapi.protobuf.AnimalListMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getByOrigin(via.sdj3.animalregistrationapi.protobuf.StringParameterMessage request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationapi.protobuf.AnimalListMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetByOriginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getByDate(via.sdj3.animalregistrationapi.protobuf.StringParameterMessage request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationapi.protobuf.AnimalListMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetByDateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRegistrationNumbersOfAnimalsInvolvedInProduct(via.sdj3.animalregistrationapi.protobuf.IdMessage request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationapi.protobuf.RegistrationNumbersMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRegistrationNumbersOfAnimalsInvolvedInProductMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * service definitions
   * </pre>
   */
  public static final class AnimalsServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AnimalsServiceBlockingStub> {
    private AnimalsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnimalsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AnimalsServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public via.sdj3.animalregistrationapi.protobuf.AnimalMessage createAnimal(via.sdj3.animalregistrationapi.protobuf.AnimalMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAnimalMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sdj3.animalregistrationapi.protobuf.AnimalMessage getAnimalById(via.sdj3.animalregistrationapi.protobuf.IdMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAnimalByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sdj3.animalregistrationapi.protobuf.NullMessage deleteAnimal(via.sdj3.animalregistrationapi.protobuf.IdMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAnimalMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sdj3.animalregistrationapi.protobuf.NullMessage updateAnimal(via.sdj3.animalregistrationapi.protobuf.AnimalMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAnimalMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sdj3.animalregistrationapi.protobuf.AnimalListMessage getAll(via.sdj3.animalregistrationapi.protobuf.NullMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sdj3.animalregistrationapi.protobuf.AnimalListMessage getByOrigin(via.sdj3.animalregistrationapi.protobuf.StringParameterMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetByOriginMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sdj3.animalregistrationapi.protobuf.AnimalListMessage getByDate(via.sdj3.animalregistrationapi.protobuf.StringParameterMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetByDateMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sdj3.animalregistrationapi.protobuf.RegistrationNumbersMessage getRegistrationNumbersOfAnimalsInvolvedInProduct(via.sdj3.animalregistrationapi.protobuf.IdMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRegistrationNumbersOfAnimalsInvolvedInProductMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * service definitions
   * </pre>
   */
  public static final class AnimalsServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AnimalsServiceFutureStub> {
    private AnimalsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnimalsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AnimalsServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.animalregistrationapi.protobuf.AnimalMessage> createAnimal(
        via.sdj3.animalregistrationapi.protobuf.AnimalMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAnimalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.animalregistrationapi.protobuf.AnimalMessage> getAnimalById(
        via.sdj3.animalregistrationapi.protobuf.IdMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAnimalByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.animalregistrationapi.protobuf.NullMessage> deleteAnimal(
        via.sdj3.animalregistrationapi.protobuf.IdMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAnimalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.animalregistrationapi.protobuf.NullMessage> updateAnimal(
        via.sdj3.animalregistrationapi.protobuf.AnimalMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAnimalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.animalregistrationapi.protobuf.AnimalListMessage> getAll(
        via.sdj3.animalregistrationapi.protobuf.NullMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.animalregistrationapi.protobuf.AnimalListMessage> getByOrigin(
        via.sdj3.animalregistrationapi.protobuf.StringParameterMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetByOriginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.animalregistrationapi.protobuf.AnimalListMessage> getByDate(
        via.sdj3.animalregistrationapi.protobuf.StringParameterMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetByDateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.animalregistrationapi.protobuf.RegistrationNumbersMessage> getRegistrationNumbersOfAnimalsInvolvedInProduct(
        via.sdj3.animalregistrationapi.protobuf.IdMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRegistrationNumbersOfAnimalsInvolvedInProductMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ANIMAL = 0;
  private static final int METHODID_GET_ANIMAL_BY_ID = 1;
  private static final int METHODID_DELETE_ANIMAL = 2;
  private static final int METHODID_UPDATE_ANIMAL = 3;
  private static final int METHODID_GET_ALL = 4;
  private static final int METHODID_GET_BY_ORIGIN = 5;
  private static final int METHODID_GET_BY_DATE = 6;
  private static final int METHODID_GET_REGISTRATION_NUMBERS_OF_ANIMALS_INVOLVED_IN_PRODUCT = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AnimalsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AnimalsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_ANIMAL:
          serviceImpl.createAnimal((via.sdj3.animalregistrationapi.protobuf.AnimalMessage) request,
              (io.grpc.stub.StreamObserver<via.sdj3.animalregistrationapi.protobuf.AnimalMessage>) responseObserver);
          break;
        case METHODID_GET_ANIMAL_BY_ID:
          serviceImpl.getAnimalById((via.sdj3.animalregistrationapi.protobuf.IdMessage) request,
              (io.grpc.stub.StreamObserver<via.sdj3.animalregistrationapi.protobuf.AnimalMessage>) responseObserver);
          break;
        case METHODID_DELETE_ANIMAL:
          serviceImpl.deleteAnimal((via.sdj3.animalregistrationapi.protobuf.IdMessage) request,
              (io.grpc.stub.StreamObserver<via.sdj3.animalregistrationapi.protobuf.NullMessage>) responseObserver);
          break;
        case METHODID_UPDATE_ANIMAL:
          serviceImpl.updateAnimal((via.sdj3.animalregistrationapi.protobuf.AnimalMessage) request,
              (io.grpc.stub.StreamObserver<via.sdj3.animalregistrationapi.protobuf.NullMessage>) responseObserver);
          break;
        case METHODID_GET_ALL:
          serviceImpl.getAll((via.sdj3.animalregistrationapi.protobuf.NullMessage) request,
              (io.grpc.stub.StreamObserver<via.sdj3.animalregistrationapi.protobuf.AnimalListMessage>) responseObserver);
          break;
        case METHODID_GET_BY_ORIGIN:
          serviceImpl.getByOrigin((via.sdj3.animalregistrationapi.protobuf.StringParameterMessage) request,
              (io.grpc.stub.StreamObserver<via.sdj3.animalregistrationapi.protobuf.AnimalListMessage>) responseObserver);
          break;
        case METHODID_GET_BY_DATE:
          serviceImpl.getByDate((via.sdj3.animalregistrationapi.protobuf.StringParameterMessage) request,
              (io.grpc.stub.StreamObserver<via.sdj3.animalregistrationapi.protobuf.AnimalListMessage>) responseObserver);
          break;
        case METHODID_GET_REGISTRATION_NUMBERS_OF_ANIMALS_INVOLVED_IN_PRODUCT:
          serviceImpl.getRegistrationNumbersOfAnimalsInvolvedInProduct((via.sdj3.animalregistrationapi.protobuf.IdMessage) request,
              (io.grpc.stub.StreamObserver<via.sdj3.animalregistrationapi.protobuf.RegistrationNumbersMessage>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class AnimalsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AnimalsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return via.sdj3.animalregistrationapi.protobuf.AnimalRetrieval.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AnimalsService");
    }
  }

  private static final class AnimalsServiceFileDescriptorSupplier
      extends AnimalsServiceBaseDescriptorSupplier {
    AnimalsServiceFileDescriptorSupplier() {}
  }

  private static final class AnimalsServiceMethodDescriptorSupplier
      extends AnimalsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AnimalsServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AnimalsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AnimalsServiceFileDescriptorSupplier())
              .addMethod(getCreateAnimalMethod())
              .addMethod(getGetAnimalByIdMethod())
              .addMethod(getDeleteAnimalMethod())
              .addMethod(getUpdateAnimalMethod())
              .addMethod(getGetAllMethod())
              .addMethod(getGetByOriginMethod())
              .addMethod(getGetByDateMethod())
              .addMethod(getGetRegistrationNumbersOfAnimalsInvolvedInProductMethod())
              .build();
        }
      }
    }
    return result;
  }
}
