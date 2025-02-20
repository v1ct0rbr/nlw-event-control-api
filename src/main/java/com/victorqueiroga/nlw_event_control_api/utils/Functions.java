package com.victorqueiroga.nlw_event_control_api.utils;

public class Functions {

    /*
     * Array com todos os caracteres inválidos
     */
    public static String[] invalidChars = { " ", "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "+", "=", "{", "}", "[",
            "]", "|", "\\", ":", ";", "\"", "'", "<", ">", ",", ".", "?", "/", "º", "ª", "§", "¬", "¢", "£", "³", "²",
            "¹", "µ", "·", "°", "¨", "´", "`", "~", "ç", "Ç", "ã", "Ã", "á", "Á", "à", "À", "â", "Â", "é", "É", "è",
            "È", "ê", "Ê", "í", "Í", "ì", "Ì", "î", "Î", "õ", "Õ", "ó", "Ó", "ò", "Ò", "ô", "Ô", "ú", "Ú", "ù", "Ù",
            "û", "Û", "ñ", "Ñ" }; 
  
    
    
    public static String prettyName(String title) {
        title = title.toLowerCase();
        title = title.replace(" ", "-");
        title = replaceInvalidChars(title);
        return title;
    }

    /*
     * Troca á por a, ã por a, ç por c, etc
     */
    public static String replaceInvalidChars(String title) {
        for (String invalidChar : invalidChars) {
            title = title.replace(invalidChar, "");
        }
        return title;
      
    }

    
}
