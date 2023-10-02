package interview;

public class ConvertDateFrom24To12Formate {
    public static void main(String[] args) {
        covetrTimeT12Formate(11,5,15);
    }
    public static void covetrTimeT12Formate(int hours, int minutes, int secconds){
        String outputTime = "";
        String suffix = "AM";
        String hr = String.valueOf(hours);
        String min = String.valueOf(minutes);
        String sec = String.valueOf(secconds);
        if (hours == 0){
            hr = String.valueOf(12);
        }
        if(hours == 12){
            suffix = "PM";
        }
        if (hours > 12){
            suffix = "PM";
            hours = hours -12 ;
            if (hours < 10){
                hr = "0"+hours;
            }
        }
        if (minutes<10){
            min = "0"+minutes;
        }
        if (secconds<10){
            sec = "0"+secconds;
        }
        outputTime = hr+":"+min+":"+sec+":"+suffix;
        System.out.println(outputTime);
    }
}
