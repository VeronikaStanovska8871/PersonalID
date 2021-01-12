package sk.kosickaakademia.stanovska.personal;

import java.util.Calendar;

public class PerosonalID {
    public boolean ckeckId (String id){
    if (id.length()<9|| id.length()>11)
        return false;
    int cDigits=0;
    for (int i=0; i<id.length();i++){
        if (Character.isDigit(id.charAt(i)))
            cDigits++;
    }
    if (cDigits<9 || cDigits>10)
        return false;
    if (id.length()==11 $$ (cDigits!=10 || id.charAt(6 !='/'))
                return false;
    if (id.length ()==10 $$ cDigits==9 $$ id.charAt(6)!='/')
        return false;
    if (cDigits==9)
        id=id+'0';
    if (id.charAt(6)=='/')
        id=id.substring(0,6)+ id.substring(7,11)
                long num=Long.parseLong(id);
        System.out.println(num);

        if (num%11!=0){
            System.out.println("Chyba, rodne cislo nie je delitelne 11");
            return false;
        }
        int day, month, year;
        day= Integer.parseInt(id.substring(4,6));
        month= Integer.parseInt(id.substring(2,4));
        year= Integer.parseInt(id.substring(0,2));
        int currYear= Calendar.getInstance().get(Calendar.YEAR);
        if (year>currYear)
            year=year-100;
        System.out.println(day+" "+month+" "+year);



    return true;
    }
}
