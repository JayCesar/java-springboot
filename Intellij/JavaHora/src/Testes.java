import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Testes {

    private static final String CONST_DATA_HORA_MIN = "yyyy-MM-dd HH:mm"; // Para usar no SimpleDate
    private static final String CONST_DATA = "yyy-MM-dd";;
    private static final String CONST_DATA_HORA2359 = "yyyy-MM-dd 23:59";


    public static void main(String[] args) {

        SimpleDateFormat teste = new SimpleDateFormat(CONST_DATA_HORA_MIN);

        String dataInicial = validaMesDIaHoraMinuto("");
        System.out.println("DataInicial = " + dataInicial);

        String dataFinal = formatarDataHoraMinuto2359("");
        System.out.println("DataFinal = " + dataFinal);

        // Teste
        System.out.println(teste.format(new Date()));

    }


    public static String formatarDataHoraMinuto2359(String data){

        SimpleDateFormat sdfData = new SimpleDateFormat(CONST_DATA);
        SimpleDateFormat sdfRetorno = new SimpleDateFormat(CONST_DATA_HORA2359);
        if(data == null || data.isBlank()){
            return sdfRetorno.format(new Date());
        }
        GregorianCalendar gc = new GregorianCalendar();
        try{
            gc.setTime(sdfData.parse(data)); // Defino a data
        } catch (ParseException e){
            System.out.println(e.getMessage());
        }
        return sdfRetorno.format(gc.getTime());
    }

    public static String validaMesDIaHoraMinuto(String dataParaValidar){

        SimpleDateFormat sdf1 = new SimpleDateFormat(CONST_DATA_HORA_MIN);
        GregorianCalendar dataHoraColetada = new GregorianCalendar();
        String dataHoraValidada = sdf1.format(dataHoraColetada.getTime()); // Pega o horário atual

        if (dataParaValidar != null && !(dataParaValidar.isEmpty())){
            try{
                dataHoraColetada.setTime(sdf1.parse(dataParaValidar));
            }catch(ParseException e){
                System.out.println(e.getMessage());
            }
            dataHoraValidada = sdf1.format(dataHoraColetada.getTime());
        }else{
            return valorPadraoMeiaNoite();
        }
        return dataHoraValidada;
    }

    public static String valorPadraoMeiaNoite(){
        // Pesquisas
        GregorianCalendar cal = new GregorianCalendar(); // Troca para Gregorian
        cal.set(GregorianCalendar.HOUR_OF_DAY, 0);
        cal.set(GregorianCalendar.MINUTE, 0);
        cal.set(GregorianCalendar.SECOND, 0);

        SimpleDateFormat sdf = new SimpleDateFormat(CONST_DATA_HORA_MIN);
        String dataFormatada = sdf.format(cal.getTime());

        System.out.println("Data atual com horário 00:00 formatada: " + dataFormatada);

        return dataFormatada;

    }
}
