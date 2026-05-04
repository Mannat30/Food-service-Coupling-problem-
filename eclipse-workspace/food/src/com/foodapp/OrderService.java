package com.foodapp;

public class OrderService {
	public void placeorder() {
		System.out.print("order placed");
	
	PaymentService  payment=new Upipayment();
	payment.pay();
	NotificationService noti=new EmailService();
	noti.sendNotification();
	}
	

}
