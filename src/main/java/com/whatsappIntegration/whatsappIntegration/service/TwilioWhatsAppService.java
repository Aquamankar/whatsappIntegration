package com.whatsappIntegration.whatsappIntegration.service;

import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class TwilioWhatsAppService {

    @Value("${twilio.whatsappNumber}")
    private String twilioWhatsAppNumber;

    public void sendWhatsAppMessage(String to, String message) {
        String from = "whatsapp:" + twilioWhatsAppNumber;
        String toWA = "whatsapp:" + to;


        try {
            Message.creator(new PhoneNumber(toWA), new PhoneNumber(from), message).create();
        } catch (Exception e) {
            // Log the exception or handle it as needed
            e.printStackTrace();
            // You can also extract more information from the ApiException
            String errorMessage = e.getMessage();
            // Handle the error, e.g., return an error response to the client
        }
    }
}
