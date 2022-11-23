package via.sdj3.animalregistrationapi.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * service definitions
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: ProductRetrieval.proto")
public final class ProductsServiceGrpc {

  private ProductsServiceGrpc() {}

  public static final String SERVICE_NAME = "ProductsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<via.sdj3.animalregistrationapi.protobuf.ProductMessageCreate,
      via.sdj3.animalregistrationapi.protobuf.ProductMessage> getCreateProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createProduct",
      requestType = via.sdj3.animalregistrationapi.protobuf.ProductMessageCreate.class,
      responseType = via.sdj3.animalregistrationapi.protobuf.ProductMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.animalregistrationapi.protobuf.ProductMessageCreate,
      via.sdj3.animalregistrationapi.protobuf.ProductMessage> getCreateProductMethod() {
    io.grpc.MethodDescriptor<via.sdj3.animalregistrationapi.protobuf.ProductMessageCreate, via.sdj3.animalregistrationapi.protobuf.ProductMessage> getCreateProductMethod;
    if ((getCreateProductMethod = ProductsServiceGrpc.getCreateProductMethod) == null) {
      synchronized (ProductsServiceGrpc.class) {
        if ((getCreateProductMethod = ProductsServiceGrpc.getCreateProductMethod) == null) {
          ProductsServiceGrpc.getCreateProductMethod = getCreateProductMethod =
              io.grpc.MethodDescriptor.<via.sdj3.animalregistrationapi.protobuf.ProductMessageCreate, via.sdj3.animalregistrationapi.protobuf.ProductMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationapi.protobuf.ProductMessageCreate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationapi.protobuf.ProductMessage.getDefaultInstance()))
              .setSchemaDescriptor(new ProductsServiceMethodDescriptorSupplier("createProduct"))
              .build();
        }
      }
    }
    return getCreateProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sdj3.animalregistrationapi.protobuf.IdMessage,
      via.sdj3.animalregistrationapi.protobuf.ProductMessage> getGetProductByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getProductById",
      requestType = via.sdj3.animalregistrationapi.protobuf.IdMessage.class,
      responseType = via.sdj3.animalregistrationapi.protobuf.ProductMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.animalregistrationapi.protobuf.IdMessage,
      via.sdj3.animalregistrationapi.protobuf.ProductMessage> getGetProductByIdMethod() {
    io.grpc.MethodDescriptor<via.sdj3.animalregistrationapi.protobuf.IdMessage, via.sdj3.animalregistrationapi.protobuf.ProductMessage> getGetProductByIdMethod;
    if ((getGetProductByIdMethod = ProductsServiceGrpc.getGetProductByIdMethod) == null) {
      synchronized (ProductsServiceGrpc.class) {
        if ((getGetProductByIdMethod = ProductsServiceGrpc.getGetProductByIdMethod) == null) {
          ProductsServiceGrpc.getGetProductByIdMethod = getGetProductByIdMethod =
              io.grpc.MethodDescriptor.<via.sdj3.animalregistrationapi.protobuf.IdMessage, via.sdj3.animalregistrationapi.protobuf.ProductMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getProductById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationapi.protobuf.IdMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationapi.protobuf.ProductMessage.getDefaultInstance()))
              .setSchemaDescriptor(new ProductsServiceMethodDescriptorSupplier("getProductById"))
              .build();
        }
      }
    }
    return getGetProductByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sdj3.animalregistrationapi.protobuf.IdMessage,
      via.sdj3.animalregistrationapi.protobuf.NullMessage> getDeleteProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteProduct",
      requestType = via.sdj3.animalregistrationapi.protobuf.IdMessage.class,
      responseType = via.sdj3.animalregistrationapi.protobuf.NullMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.animalregistrationapi.protobuf.IdMessage,
      via.sdj3.animalregistrationapi.protobuf.NullMessage> getDeleteProductMethod() {
    io.grpc.MethodDescriptor<via.sdj3.animalregistrationapi.protobuf.IdMessage, via.sdj3.animalregistrationapi.protobuf.NullMessage> getDeleteProductMethod;
    if ((getDeleteProductMethod = ProductsServiceGrpc.getDeleteProductMethod) == null) {
      synchronized (ProductsServiceGrpc.class) {
        if ((getDeleteProductMethod = ProductsServiceGrpc.getDeleteProductMethod) == null) {
          ProductsServiceGrpc.getDeleteProductMethod = getDeleteProductMethod =
              io.grpc.MethodDescriptor.<via.sdj3.animalregistrationapi.protobuf.IdMessage, via.sdj3.animalregistrationapi.protobuf.NullMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationapi.protobuf.IdMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationapi.protobuf.NullMessage.getDefaultInstance()))
              .setSchemaDescriptor(new ProductsServiceMethodDescriptorSupplier("deleteProduct"))
              .build();
        }
      }
    }
    return getDeleteProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sdj3.animalregistrationapi.protobuf.NullMessage,
      via.sdj3.animalregistrationapi.protobuf.ProductListMessage> getGetAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAll",
      requestType = via.sdj3.animalregistrationapi.protobuf.NullMessage.class,
      responseType = via.sdj3.animalregistrationapi.protobuf.ProductListMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.animalregistrationapi.protobuf.NullMessage,
      via.sdj3.animalregistrationapi.protobuf.ProductListMessage> getGetAllMethod() {
    io.grpc.MethodDescriptor<via.sdj3.animalregistrationapi.protobuf.NullMessage, via.sdj3.animalregistrationapi.protobuf.ProductListMessage> getGetAllMethod;
    if ((getGetAllMethod = ProductsServiceGrpc.getGetAllMethod) == null) {
      synchronized (ProductsServiceGrpc.class) {
        if ((getGetAllMethod = ProductsServiceGrpc.getGetAllMethod) == null) {
          ProductsServiceGrpc.getGetAllMethod = getGetAllMethod =
              io.grpc.MethodDescriptor.<via.sdj3.animalregistrationapi.protobuf.NullMessage, via.sdj3.animalregistrationapi.protobuf.ProductListMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationapi.protobuf.NullMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationapi.protobuf.ProductListMessage.getDefaultInstance()))
              .setSchemaDescriptor(new ProductsServiceMethodDescriptorSupplier("getAll"))
              .build();
        }
      }
    }
    return getGetAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sdj3.animalregistrationapi.protobuf.IdMessage,
      via.sdj3.animalregistrationapi.protobuf.ProductListMessage> getGetByAnimalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getByAnimal",
      requestType = via.sdj3.animalregistrationapi.protobuf.IdMessage.class,
      responseType = via.sdj3.animalregistrationapi.protobuf.ProductListMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sdj3.animalregistrationapi.protobuf.IdMessage,
      via.sdj3.animalregistrationapi.protobuf.ProductListMessage> getGetByAnimalMethod() {
    io.grpc.MethodDescriptor<via.sdj3.animalregistrationapi.protobuf.IdMessage, via.sdj3.animalregistrationapi.protobuf.ProductListMessage> getGetByAnimalMethod;
    if ((getGetByAnimalMethod = ProductsServiceGrpc.getGetByAnimalMethod) == null) {
      synchronized (ProductsServiceGrpc.class) {
        if ((getGetByAnimalMethod = ProductsServiceGrpc.getGetByAnimalMethod) == null) {
          ProductsServiceGrpc.getGetByAnimalMethod = getGetByAnimalMethod =
              io.grpc.MethodDescriptor.<via.sdj3.animalregistrationapi.protobuf.IdMessage, via.sdj3.animalregistrationapi.protobuf.ProductListMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getByAnimal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationapi.protobuf.IdMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sdj3.animalregistrationapi.protobuf.ProductListMessage.getDefaultInstance()))
              .setSchemaDescriptor(new ProductsServiceMethodDescriptorSupplier("getByAnimal"))
              .build();
        }
      }
    }
    return getGetByAnimalMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProductsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductsServiceStub>() {
        @java.lang.Override
        public ProductsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductsServiceStub(channel, callOptions);
        }
      };
    return ProductsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProductsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductsServiceBlockingStub>() {
        @java.lang.Override
        public ProductsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductsServiceBlockingStub(channel, callOptions);
        }
      };
    return ProductsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProductsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductsServiceFutureStub>() {
        @java.lang.Override
        public ProductsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductsServiceFutureStub(channel, callOptions);
        }
      };
    return ProductsServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * service definitions
   * </pre>
   */
  public static abstract class ProductsServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createProduct(via.sdj3.animalregistrationapi.protobuf.ProductMessageCreate request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationapi.protobuf.ProductMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateProductMethod(), responseObserver);
    }

    /**
     */
    public void getProductById(via.sdj3.animalregistrationapi.protobuf.IdMessage request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationapi.protobuf.ProductMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProductByIdMethod(), responseObserver);
    }

    /**
     */
    public void deleteProduct(via.sdj3.animalregistrationapi.protobuf.IdMessage request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationapi.protobuf.NullMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteProductMethod(), responseObserver);
    }

    /**
     */
    public void getAll(via.sdj3.animalregistrationapi.protobuf.NullMessage request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationapi.protobuf.ProductListMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllMethod(), responseObserver);
    }

    /**
     */
    public void getByAnimal(via.sdj3.animalregistrationapi.protobuf.IdMessage request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationapi.protobuf.ProductListMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetByAnimalMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateProductMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.animalregistrationapi.protobuf.ProductMessageCreate,
                via.sdj3.animalregistrationapi.protobuf.ProductMessage>(
                  this, METHODID_CREATE_PRODUCT)))
          .addMethod(
            getGetProductByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.animalregistrationapi.protobuf.IdMessage,
                via.sdj3.animalregistrationapi.protobuf.ProductMessage>(
                  this, METHODID_GET_PRODUCT_BY_ID)))
          .addMethod(
            getDeleteProductMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.animalregistrationapi.protobuf.IdMessage,
                via.sdj3.animalregistrationapi.protobuf.NullMessage>(
                  this, METHODID_DELETE_PRODUCT)))
          .addMethod(
            getGetAllMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.animalregistrationapi.protobuf.NullMessage,
                via.sdj3.animalregistrationapi.protobuf.ProductListMessage>(
                  this, METHODID_GET_ALL)))
          .addMethod(
            getGetByAnimalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sdj3.animalregistrationapi.protobuf.IdMessage,
                via.sdj3.animalregistrationapi.protobuf.ProductListMessage>(
                  this, METHODID_GET_BY_ANIMAL)))
          .build();
    }
  }

  /**
   * <pre>
   * service definitions
   * </pre>
   */
  public static final class ProductsServiceStub extends io.grpc.stub.AbstractAsyncStub<ProductsServiceStub> {
    private ProductsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductsServiceStub(channel, callOptions);
    }

    /**
     */
    public void createProduct(via.sdj3.animalregistrationapi.protobuf.ProductMessageCreate request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationapi.protobuf.ProductMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProductById(via.sdj3.animalregistrationapi.protobuf.IdMessage request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationapi.protobuf.ProductMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProductByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteProduct(via.sdj3.animalregistrationapi.protobuf.IdMessage request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationapi.protobuf.NullMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAll(via.sdj3.animalregistrationapi.protobuf.NullMessage request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationapi.protobuf.ProductListMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getByAnimal(via.sdj3.animalregistrationapi.protobuf.IdMessage request,
        io.grpc.stub.StreamObserver<via.sdj3.animalregistrationapi.protobuf.ProductListMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetByAnimalMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * service definitions
   * </pre>
   */
  public static final class ProductsServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ProductsServiceBlockingStub> {
    private ProductsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductsServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public via.sdj3.animalregistrationapi.protobuf.ProductMessage createProduct(via.sdj3.animalregistrationapi.protobuf.ProductMessageCreate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sdj3.animalregistrationapi.protobuf.ProductMessage getProductById(via.sdj3.animalregistrationapi.protobuf.IdMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProductByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sdj3.animalregistrationapi.protobuf.NullMessage deleteProduct(via.sdj3.animalregistrationapi.protobuf.IdMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteProductMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sdj3.animalregistrationapi.protobuf.ProductListMessage getAll(via.sdj3.animalregistrationapi.protobuf.NullMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sdj3.animalregistrationapi.protobuf.ProductListMessage getByAnimal(via.sdj3.animalregistrationapi.protobuf.IdMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetByAnimalMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * service definitions
   * </pre>
   */
  public static final class ProductsServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ProductsServiceFutureStub> {
    private ProductsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductsServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.animalregistrationapi.protobuf.ProductMessage> createProduct(
        via.sdj3.animalregistrationapi.protobuf.ProductMessageCreate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateProductMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.animalregistrationapi.protobuf.ProductMessage> getProductById(
        via.sdj3.animalregistrationapi.protobuf.IdMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProductByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.animalregistrationapi.protobuf.NullMessage> deleteProduct(
        via.sdj3.animalregistrationapi.protobuf.IdMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteProductMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.animalregistrationapi.protobuf.ProductListMessage> getAll(
        via.sdj3.animalregistrationapi.protobuf.NullMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sdj3.animalregistrationapi.protobuf.ProductListMessage> getByAnimal(
        via.sdj3.animalregistrationapi.protobuf.IdMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetByAnimalMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_PRODUCT = 0;
  private static final int METHODID_GET_PRODUCT_BY_ID = 1;
  private static final int METHODID_DELETE_PRODUCT = 2;
  private static final int METHODID_GET_ALL = 3;
  private static final int METHODID_GET_BY_ANIMAL = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProductsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProductsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_PRODUCT:
          serviceImpl.createProduct((via.sdj3.animalregistrationapi.protobuf.ProductMessageCreate) request,
              (io.grpc.stub.StreamObserver<via.sdj3.animalregistrationapi.protobuf.ProductMessage>) responseObserver);
          break;
        case METHODID_GET_PRODUCT_BY_ID:
          serviceImpl.getProductById((via.sdj3.animalregistrationapi.protobuf.IdMessage) request,
              (io.grpc.stub.StreamObserver<via.sdj3.animalregistrationapi.protobuf.ProductMessage>) responseObserver);
          break;
        case METHODID_DELETE_PRODUCT:
          serviceImpl.deleteProduct((via.sdj3.animalregistrationapi.protobuf.IdMessage) request,
              (io.grpc.stub.StreamObserver<via.sdj3.animalregistrationapi.protobuf.NullMessage>) responseObserver);
          break;
        case METHODID_GET_ALL:
          serviceImpl.getAll((via.sdj3.animalregistrationapi.protobuf.NullMessage) request,
              (io.grpc.stub.StreamObserver<via.sdj3.animalregistrationapi.protobuf.ProductListMessage>) responseObserver);
          break;
        case METHODID_GET_BY_ANIMAL:
          serviceImpl.getByAnimal((via.sdj3.animalregistrationapi.protobuf.IdMessage) request,
              (io.grpc.stub.StreamObserver<via.sdj3.animalregistrationapi.protobuf.ProductListMessage>) responseObserver);
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

  private static abstract class ProductsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProductsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return via.sdj3.animalregistrationapi.protobuf.ProductRetrieval.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProductsService");
    }
  }

  private static final class ProductsServiceFileDescriptorSupplier
      extends ProductsServiceBaseDescriptorSupplier {
    ProductsServiceFileDescriptorSupplier() {}
  }

  private static final class ProductsServiceMethodDescriptorSupplier
      extends ProductsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProductsServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ProductsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProductsServiceFileDescriptorSupplier())
              .addMethod(getCreateProductMethod())
              .addMethod(getGetProductByIdMethod())
              .addMethod(getDeleteProductMethod())
              .addMethod(getGetAllMethod())
              .addMethod(getGetByAnimalMethod())
              .build();
        }
      }
    }
    return result;
  }
}
