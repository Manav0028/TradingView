package com.manavs.tradingview;

import com.ib.client.Bar;
import com.ib.client.Contract;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class TradingViewApplication implements InitializingBean {

    private final static String NSE_SYMBOLS = "AARTIIND,ABBOTINDI,ABCAPITAL,ABFRL,ACC,ADANIENT,ADANIPORT," +
            "ALKEM,AMARAJABA,AMBUJACEM,APLLTD,APOLLOHOS,APOLLOTYR,ASHOKLEY,ASIANPAIN,ASTRAL,ATUL,AUBANK,AUROPHARM," +
            "AXISBANK,BAJAJ-AUT,BAJAJFINS,BAJFINANC,BALKRISIN,BALRAMCHI,BANDHANBN,BANKBAROD,BATAINDIA,BEL,BERGEPAIN," +
            "BHARATFOR,BHARTIART,BHEL,BIOCON,BOSCHLTD,BPCL,BRITANNIA,BSOFT,CANBK,CANFINHOM,CHAMBLFER,CHOLAFIN,CIPLA," +
            "COALINDIA,COFORGE,COLPAL,CONCOR,COROMANDE,CROMPTON,CUB,CUMMINSIN,DABUR,DALBHARAT,DEEPAKNTR,DELTACORP,DIVISLAB," +
            "DIXON,DLF,DRREDDY,EICHERMOT,ESCORTS,EXIDEIND,FEDERALBN,FSL,GAIL,GLENMARK,GMRINFRA,GNFC,GODREJCP,GODREJPRO,GRANULES," +
            "GRASIM,GSPL,GUJGASLTD,HAL,HAVELLS,HCLTECH,HDFC,HDFCAMC,HDFCBANK,HDFCLIFE,HEROMOTOC,HINDALCO,HINDCOPPE,HINDPETRO," +
            "HINDUNILV,HONAUT,IBULHSGFI,ICICIBANK,ICICIGI,ICICIPRUL,IDEA,IDFC,IDFCFIRST,IEX,IGL,INDHOTEL,INDIACEM,INDIAMART,INDIGO," +
            "INDUSINDB,INDUSTOWE,INFY,IOC,IPCALAB,IRCTC,ITC,JINDALSTE,JKCEMENT,JSWSTEEL,JUBLFOOD,KOTAKBANK,LALPATHLA,LAURUSLAB," +
            "LICHSGFIN,LT,LTFH,LTI,LTTS,LUPIN,MANAPPURA,MARICO,MARUTI,MCX,METROPOLI,MFSL,MGL,MINDTREE,MM,MMFIN,MPHASIS,MRF,MUTHOOTFI," +
            "NATIONALU,NAUKRI,NAVINFLUO,NBCC,NESTLEIND,NMDC,NTPC,OBEROIRLT,OFSS,ONGC,PAGEIND,PEL,PERSISTEN,PETRONET,PFC,PFIZER,PIDILITIN," +
            "PIIND,PNB,POLYCAB,POWERGRID,PVR,RAIN,RAMCOCEM,RBLBANK,RECLTD,RELIANCE,SAIL,SBICARD,SBILIFE,SBIN,SHREECEM,SIEMENS,SRF,SRTRANSFI," +
            "STAR,SUNPHARMA,SUNTV,SYNGENE,TATACHEM,TATACOMM,TATACONSU,TATAMOTOR,TATAPOWER,TATASTEEL,TCS,TECHM,TITAN,TORNTPHAR,TORNTPOWE,TRENT," +
            "TVSMOTOR,UBL,ULTRACEMC,UPL,VEDL,VOLTAS,WHIRLPOOL,WIPRO,ZEEL";
//            "ADANIPORT,AMARAJABA,APOLLOHOS,APOLLOTYR,ASIANPAIN,AUROPHARM,BAJAJ-AUT,BAJFINANC,BAJAJFINS,BALKRISIN,BALRAMCHI,BANDHANBN,BANKBAROD,BERGEPAIN,BHARATFOR,BHARTIART,CADILAHC,CANFINHOM,CHAMBLFER,COROMANDE,CUMMINSIN,LALPATHLA,GODREJPRO,HEROMOTOC,HINDCOPPE,HINDUNILV,ICICIPRUL,IDFCFIRST,IBULHSGFI,INDUSTOWE,INDUSINDB,JINDALSTE,LTFH,LAURUSLAB,MMFIN,MM,MANAPPURA,METROPOLI,MOTHERSUM,MUTHOOTFI,NATIONALU,NAVINFLUO,NA-INDIA,OBEROIRLT,PERSISTEN,PIDILITIN,SRTRANSFI,TATACONSU,TATAMOTOR,FEDERALBN,TORNTPHAR,TORNTPOWE,ULTRACEMC,M CDOWELLN,ZEEL";
    private final static String NYSE_SYMBOLS = ""; //todo get list
    private final static int CLIENT_ID = new Random().nextInt(1000);

    @Autowired
    private OptionsRepo optionsRepo;

    @Autowired
    private MyContractRepo contractRepo;

    @Autowired
    private CustomBarRepo barRepo;

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(TradingViewApplication.class, args);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        ContractServices services = new ContractServices(optionsRepo, contractRepo, barRepo);
        System.out.println(CLIENT_ID);
        services.connect(CLIENT_ID);


        String[] symbols = NSE_SYMBOLS.split(",");

        System.out.println("Setting up data...");
        for(String contractName : symbols) {
            Contract contract = services.checkContractInDb(contractName);
            CustomBar yday1 = services.checkHistoricalData(contract); // a day before yday bar if data is present in database

            if (yday1 == null) {
                services.getHistoricalDataFromAPI(contract);
                Thread.sleep(2000);
                services.pushHistoricalData(contract); // push all to database
            } else {
                services.getYdayHistoricalDataFromAPI(contract);
                Thread.sleep(2000);
                services.pushHistoricalData(contract, yday1); // push a day before yday to database
            }

        }

        System.out.println("Checking contracts for recommendations...");

        HashMap<Contract, List<CustomBar>> contractMap = services.getBarMap();
        for (Map.Entry<Contract, List<CustomBar>> entry : contractMap.entrySet()) {
            System.out.println(entry.getKey().symbol() +"...");
            if (entry.getValue().size() > 0) {
                CustomBar yday = entry.getValue().get(entry.getValue().size() - 2);
                CustomBar today = entry.getValue().get(entry.getValue().size() - 1);
                if (yday != null) {
//                    services.liveData(entry.getKey(), 98765);
//                    Thread.sleep(1000);
//                    int count = 0;
//                    while(services.getToday() == null && count != 50) {
//                        if (count == 0)
//                            System.out.println("waiting for today ...");
//                        count++;
//                    }
                    if(today != null) {
                        today.setSymbol(entry.getKey().symbol());
                        services.updateTodayEmaSma(today, yday);
                        services.longCheck(today, yday);
                        services.shortCheck(today, yday);
                    }
//                    services.cancelLiveData(98765);
                }
            }
        }

        Set<Thread> threads = Thread.getAllStackTraces().keySet();
        System.out.printf("%-15s \t %-15s \t %-15s \t %s\n", "Name", "State", "Priority", "isDaemon");
        for (Thread t : threads) {
            System.out.printf("%-15s \t %-15s \t %-15d \t %s\n", t.getName(), t.getState(), t.getPriority(), t.isDaemon());
        }

//        System.exit(1);
    }
}
