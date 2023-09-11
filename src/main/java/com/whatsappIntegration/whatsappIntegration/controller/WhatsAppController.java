package com.whatsappIntegration.whatsappIntegration.controller;
import com.whatsappIntegration.whatsappIntegration.service.TwilioWhatsAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/whatsapp")
public class WhatsAppController {


    @Autowired
    private  TwilioWhatsAppService twilioWhatsAppService;



    @PostMapping("/send")
    public String sendWhatsAppMessage(
            @RequestParam(name = "to") String to,
            @RequestParam(name = "message") String message) {
        twilioWhatsAppService.sendWhatsAppMessage(to, message);
        return "WhatsApp message sent successfully!";
    }
}
