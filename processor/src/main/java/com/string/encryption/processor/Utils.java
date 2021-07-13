package com.string.encryption.processor;

import com.string.encryption.annotation.EncryptString;

import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.util.Elements;

/**
 * Created by wangkunlin
 * On 2021-07-13
 */
class Utils {

    static boolean isTextEmpty(String txt) {
        return txt == null || txt.trim().isEmpty();
    }

    static boolean isValidClass(Element element) {
        return element.getKind() == ElementKind.CLASS;
    }

    static boolean isValidField(Element element) {
        if (element.getKind() != ElementKind.FIELD || !(element instanceof VariableElement)) {
            return false;
        }

        EncryptString fieldAnno = element.getAnnotation(EncryptString.class);
        return fieldAnno != null;
    }

    static String getPackageName(Elements elements, TypeElement typeElement) {
        return elements.getPackageOf(typeElement).getQualifiedName().toString();
    }

    static String getSimpleName(TypeElement typeElement) {
        return typeElement.getSimpleName().toString();
    }

}
