package com.whatsappIntegration.whatsappIntegration.config;

import com.twilio.Twilio;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TwilioConfig {

    @Value("${twilio.accountSid}")
    private String twilioAccountSid;

    @Value("${twilio.authToken}")
    private String twilioAuthToken;

    @Bean
    public void twilioInitializer() {
        Twilio.init(twilioAccountSid, twilioAuthToken);
    }
}
