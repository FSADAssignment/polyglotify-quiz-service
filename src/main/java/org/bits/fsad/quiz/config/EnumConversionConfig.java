package org.bits.fsad.quiz.config;

import org.bits.fsad.quiz.enums.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import java.beans.PropertyEditorSupport;

public class EnumConversionConfig {

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Language.class, new PropertyEditorSupport() {
            @Override
            public void setAsText(String text) {
                setValue(Language.valueOf(text.toUpperCase()));
            }
        });
    }
}
