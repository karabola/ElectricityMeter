package electricity;


//liczył kWh
//liczył taryfy
//ustawianie taryf i stawek
//o ile droższy jest prąd poza taryfą

//narzędzie ustawiające staryfy i stawki

import java.util.Calendar;

public class ElectricityMeter {
    private float kWh = 0;
    private int centsForKWh=0;

    private boolean tariffOn=false;
    private float kWhTariff=0;
    private int centsForKWhTariff=0;

    private int electricityTariffStartHour=0;
    private int electricityTariffEndHour=0;

    public void addKWh (float kWhToAdd){
        if (isTariffNow()){
            kWhTariff+=kWhToAdd;
        }else{
            kWh+=kWhToAdd;
        }
    }

    private boolean isTariffNow() {
        Calendar rightNow=Calendar.getInstance();
        int hour=rightNow.get(Calendar.HOUR_OF_DAY);
        return hour>electricityTariffStartHour &&hour<electricityTariffEndHour;
    }

    /**
     *
     * @return how much more expensive is normal price comparing to tariff in percentages
     */
    int getHowMoreExpensiveNormalIs(){
        return (centsForKWh*100/centsForKWhTariff)-100;
    }

    public float getkWh() {
        return kWh;
    }

    void setCentsForKWh(int centsForKWh) {
        this.centsForKWh = centsForKWh;
    }

    void setTariffOn(boolean tariffOn) {
        this.tariffOn = tariffOn;
    }

    void setCentsForKWhTariff(int centsForKWhTariff) {
        this.centsForKWhTariff = centsForKWhTariff;
    }

    void setElectricityTariffStartHour(int electricityTariffStartHour) {
        this.electricityTariffStartHour = electricityTariffStartHour;
    }

    void setElectricityTariffEndHour(int electricityTariffEndHour) {
        this.electricityTariffEndHour = electricityTariffEndHour;
    }
}
