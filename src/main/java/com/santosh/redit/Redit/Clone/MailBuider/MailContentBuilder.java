package com.santosh.redit.Redit.Clone.MailBuider;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@Service
@AllArgsConstructor
public class MailContentBuilder {

    private final TemplateEngine templateEngine;
   public String builder(String message){
        Context context= new Context();
        context.setVariable("message",message);
        return templateEngine.process("mailTempate",context);
    }

}
