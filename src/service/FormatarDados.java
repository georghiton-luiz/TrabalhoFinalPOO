package service;


import javax.swing.text.MaskFormatter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class FormatarDados {

    public static LocalDate formatarData(String dataNasc){

        try {
            DateFormat formatBR = new SimpleDateFormat("dd/MM/yyyy");
            Date date = formatBR.parse(dataNasc);
            DateFormat formatUS = new SimpleDateFormat("yyyy-MM-dd");
            String dataConvertida = formatUS.format(date);
            return LocalDate.parse(dataConvertida);
        }catch (ParseException e){
            e.printStackTrace();
        }
        return null;
    }

    public static String gerFoneFormatado(String fone) {
        fone = fone.replaceAll("[^0-9]", "");
        MaskFormatter mask;
        try {
            mask = new MaskFormatter("(##) ####.####");
            mask.setValueContainsLiteralCharacters(false);
            if(!fone.equals("")) {
                return mask.valueToString(fone);
            }
            return null;

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return fone;
    }

    public static String getCelFormatado(String celular) {
        celular = celular.replaceAll("[^0-9]", "");
        MaskFormatter mask;
        try {
            mask = new MaskFormatter("(##) #####.####");
            mask.setValueContainsLiteralCharacters(false);
            if(!celular.equals("")) {
                return mask.valueToString(celular);
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return celular;
    }

    public static String getCpfFormatado(String cpf) {
        cpf = cpf.replaceAll("[^0-9]", "");
        MaskFormatter mask;
        try {
            mask = new MaskFormatter("###.###.###-##");
            mask.setValueContainsLiteralCharacters(false);
            if(ValidarDados.isCPF(cpf)) {
                return mask.valueToString(cpf);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return cpf;
    }

    public static String getCepFormatado(String CEP) {
        CEP = CEP.replaceAll("[^0-9]", "");
        MaskFormatter mask;
        try {
            mask = new MaskFormatter("##.###-##");
            mask.setValueContainsLiteralCharacters(false);
            if(!CEP.equals("")) {
                return mask.valueToString(CEP);
            }
            return null;

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return CEP;
    }
}
