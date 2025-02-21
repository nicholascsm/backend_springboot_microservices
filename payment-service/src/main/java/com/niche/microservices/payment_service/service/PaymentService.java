package com.niche.microservices.payment_service.service;

import com.niche.microservices.payment_service.grpc.PaymentRequest;
import com.niche.microservices.payment_service.grpc.PaymentResponse;
import com.niche.microservices.payment_service.grpc.PaymentServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class PaymentService extends PaymentServiceGrpc.PaymentServiceImplBase {

    @Override
    public void processPayment(PaymentRequest request, StreamObserver<PaymentResponse> responseObserver){

    }

}
