package org.bits.fsad.quiz.enumconverter;

import org.bits.fsad.quiz.enums.Language;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class LanguageEnumConverter implements Converter<String, Language> {

    @Override
    public Language convert(String value) {
        return Language.valueOf(value.toUpperCase());
    }
}
