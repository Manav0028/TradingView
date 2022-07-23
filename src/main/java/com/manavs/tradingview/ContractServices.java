package com.manavs.tradingview;

import com.ib.client.*;
import org.springframework.stereotype.Service;

import java.math.RoundingMode;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.util.*;

@Service
public class ContractServices implements EWrapper {

    @Override
    public void tickPrice(int tickerId, int field, double price, TickAttrib attrib) {

    }

    @Override
    public void tickSize(int tickerId, int field, int size) {

    }

    @Override
    public void tickOptionComputation(int tickerId, int field, int tickAttrib, double impliedVol, double delta, double optPrice, double pvDividend, double gamma, double vega, double theta, double undPrice) {

    }

    @Override
    public void tickGeneric(int tickerId, int tickType, double value) {

    }

    @Override
    public void tickString(int tickerId, int tickType, String value) {

    }

    @Override
    public void tickEFP(int tickerId, int tickType, double basisPoints, String formattedBasisPoints, double impliedFuture, int holdDays, String futureLastTradeDate, double dividendImpact, double dividendsToLastTradeDate) {

    }

    @Override
    public void orderStatus(int orderId, String status, double filled, double remaining, double avgFillPrice, int permId, int parentId, double lastFillPrice, int clientId, String whyHeld, double mktCapPrice) {

    }

    @Override
    public void openOrder(int orderId, Contract contract, Order order, OrderState orderState) {

    }

    @Override
    public void openOrderEnd() {

    }

    @Override
    public void updateAccountValue(String key, String value, String currency, String accountName) {

    }

    @Override
    public void updatePortfolio(Contract contract, double position, double marketPrice, double marketValue, double averageCost, double unrealizedPNL, double realizedPNL, String accountName) {

    }

    @Override
    public void updateAccountTime(String timeStamp) {

    }

    @Override
    public void accountDownloadEnd(String accountName) {

    }

    @Override
    public void nextValidId(int orderId) {

    }

    @Override
    public void contractDetails(int reqId, ContractDetails contractDetails) {

    }

    @Override
    public void bondContractDetails(int reqId, ContractDetails contractDetails) {

    }

    @Override
    public void contractDetailsEnd(int reqId) {

    }

    @Override
    public void execDetails(int reqId, Contract contract, Execution execution) {

    }

    @Override
    public void execDetailsEnd(int reqId) {

    }

    @Override
    public void updateMktDepth(int tickerId, int position, int operation, int side, double price, int size) {

    }

    @Override
    public void updateMktDepthL2(int tickerId, int position, String marketMaker, int operation, int side, double price, int size, boolean isSmartDepth) {

    }

    @Override
    public void updateNewsBulletin(int msgId, int msgType, String message, String origExchange) {

    }

    @Override
    public void managedAccounts(String accountsList) {

    }

    @Override
    public void receiveFA(int faDataType, String xml) {

    }

    @Override
    public void scannerParameters(String xml) {

    }

    @Override
    public void scannerData(int reqId, int rank, ContractDetails contractDetails, String distance, String benchmark, String projection, String legsStr) {

    }

    @Override
    public void scannerDataEnd(int reqId) {

    }

    @Override
    public void currentTime(long time) {

    }

    @Override
    public void fundamentalData(int reqId, String data) {

    }

    @Override
    public void deltaNeutralValidation(int reqId, DeltaNeutralContract deltaNeutralContract) {

    }

    @Override
    public void tickSnapshotEnd(int reqId) {

    }

    @Override
    public void marketDataType(int reqId, int marketDataType) {

    }

    @Override
    public void commissionReport(CommissionReport commissionReport) {

    }

    @Override
    public void position(String account, Contract contract, double pos, double avgCost) {

    }

    @Override
    public void positionEnd() {

    }

    @Override
    public void accountSummary(int reqId, String account, String tag, String value, String currency) {

    }

    @Override
    public void accountSummaryEnd(int reqId) {

    }

    @Override
    public void verifyMessageAPI(String apiData) {

    }

    @Override
    public void verifyCompleted(boolean isSuccessful, String errorText) {

    }

    @Override
    public void verifyAndAuthMessageAPI(String apiData, String xyzChallenge) {

    }

    @Override
    public void verifyAndAuthCompleted(boolean isSuccessful, String errorText) {

    }

    @Override
    public void displayGroupList(int reqId, String groups) {

    }

    @Override
    public void displayGroupUpdated(int reqId, String contractInfo) {

    }

    @Override
    public void error(Exception e) {

    }

    @Override
    public void error(String str) {

    }

    @Override
    public void error(int id, int errorCode, String errorMsg) {

    }

    @Override
    public void connectionClosed() {

    }

    @Override
    public void connectAck() {

    }

    @Override
    public void positionMulti(int reqId, String account, String modelCode, Contract contract, double pos, double avgCost) {

    }

    @Override
    public void positionMultiEnd(int reqId) {

    }

    @Override
    public void accountUpdateMulti(int reqId, String account, String modelCode, String key, String value, String currency) {

    }

    @Override
    public void accountUpdateMultiEnd(int reqId) {

    }

    @Override
    public void securityDefinitionOptionalParameter(int reqId, String exchange, int underlyingConId, String tradingClass, String multiplier, Set<String> expirations, Set<Double> strikes) {

    }

    @Override
    public void securityDefinitionOptionalParameterEnd(int reqId) {

    }

    @Override
    public void softDollarTiers(int reqId, SoftDollarTier[] tiers) {

    }

    @Override
    public void familyCodes(FamilyCode[] familyCodes) {

    }

    @Override
    public void symbolSamples(int reqId, ContractDescription[] contractDescriptions) {

    }

    @Override
    public void historicalDataEnd(int reqId, String startDateStr, String endDateStr) {
        System.out.println("HistoricalDataEnd. " + EWrapperMsgGenerator.historicalDataEnd(reqId, startDateStr, endDateStr));
    }

    @Override
    public void mktDepthExchanges(DepthMktDataDescription[] depthMktDataDescriptions) {

    }

    @Override
    public void tickNews(int tickerId, long timeStamp, String providerCode, String articleId, String headline, String extraData) {

    }

    @Override
    public void smartComponents(int reqId, Map<Integer, Map.Entry<String, Character>> theMap) {

    }

    @Override
    public void tickReqParams(int tickerId, double minTick, String bboExchange, int snapshotPermissions) {

    }

    @Override
    public void newsProviders(NewsProvider[] newsProviders) {

    }

    @Override
    public void newsArticle(int requestId, int articleType, String articleText) {

    }

    @Override
    public void historicalNews(int requestId, String time, String providerCode, String articleId, String headline) {

    }

    @Override
    public void historicalNewsEnd(int requestId, boolean hasMore) {

    }

    @Override
    public void headTimestamp(int reqId, String headTimestamp) {

    }

    @Override
    public void histogramData(int reqId, List<HistogramEntry> items) {

    }

    @Override
    public void historicalDataUpdate(int reqId, Bar bar) {
        System.out.println("HistoricalDataUpdate. " + EWrapperMsgGenerator.historicalData(reqId, bar.time(), bar.open(), bar.high(), bar.low(), bar.close(), bar.volume(), bar.count(), bar.wap()));

    }

    @Override
    public void rerouteMktDataReq(int reqId, int conId, String exchange) {

    }

    @Override
    public void rerouteMktDepthReq(int reqId, int conId, String exchange) {

    }

    @Override
    public void marketRule(int marketRuleId, PriceIncrement[] priceIncrements) {

    }

    @Override
    public void pnl(int reqId, double dailyPnL, double unrealizedPnL, double realizedPnL) {

    }

    @Override
    public void pnlSingle(int reqId, int pos, double dailyPnL, double unrealizedPnL, double realizedPnL, double value) {

    }

    @Override
    public void historicalTicks(int reqId, List<HistoricalTick> ticks, boolean done) {

    }

    @Override
    public void historicalTicksBidAsk(int reqId, List<HistoricalTickBidAsk> ticks, boolean done) {

    }

    @Override
    public void historicalTicksLast(int reqId, List<HistoricalTickLast> ticks, boolean done) {

    }

    @Override
    public void tickByTickAllLast(int reqId, int tickType, long time, double price, int size, TickAttribLast tickAttribLast, String exchange, String specialConditions) {

    }

    @Override
    public void tickByTickBidAsk(int reqId, long time, double bidPrice, double askPrice, int bidSize, int askSize, TickAttribBidAsk tickAttribBidAsk) {

    }

    @Override
    public void tickByTickMidPoint(int reqId, long time, double midPoint) {

    }

    @Override
    public void orderBound(long orderId, int apiClientId, int apiOrderId) {

    }

    @Override
    public void completedOrder(Contract contract, Order order, OrderState orderState) {

    }

    @Override
    public void completedOrdersEnd() {

    }

    @Override
    public void replaceFAEnd(int reqId, String text) {

    }


    private EJavaSignal signal;
    private EClientSocket clientSocket;
    private EReader eReader;
    private Thread connectionThread;
    private HashMap<Contract, List<CustomBar>> barMap;
    private List<Bar> historicalDataList;
    private List<CustomBar> customBars;
    private CustomBar today;
    private LocalDateTime localDateTime;

    private DecimalFormat df = new DecimalFormat("0.00");
    private final static String NSE_SYMBOLS = "AARTIIND,ABBOTINDIA,ACC,ADANIENT,ADANIPORTS,ABCAPITAL,ABFRL,APLLTD,ALKEM,AMARAJABAT,AMBUJACEM,APOLLOHOSP,APOLLOTYRE,ASHOKLEY,ASIANPAINT,ASTRAL,ATUL,AUBANK,AUROPHARMA,AXISBANK,BAJAJAUTO,BAJFINANCE,BAJAJFINSV,BALKRISIND,BALRAMCHIN,BANDHANBNK,BANKBARODA,BATAINDIA,BERGEPAINT,BEL,BHARATFORG,BHEL,BPCL,BHARTIARTL,BIOCON,BSOFT,BOSCHLTD,BRITANNIA,CADILAHC,CANFINHOME,CANBK,CHAMBLFERT,CHOLAFIN,CIPLA,CUB,COALINDIA,COFORGE,COLPAL,CONCOR,COROMANDEL,CROMPTON,CUMMINSIND,DABUR,DALBHARAT,DEEPAKNTR,DELTACORP,DIVISLAB,DIXON,DLF,LALPATHLAB,DRREDDY,EICHERMOT,ESCORTS,EXIDEIND,FSL,GAIL,GLENMARK,GMRINFRA,GODREJCP,GODREJPROP,GRANULES,GRASIM,GUJGASLTD,GNFC,GSPL,HAVELLS,HCLTECH,HDFCAMC,HDFCBANK,HDFCLIFE,HEROMOTOCO,HINDALCO,HAL,HINDCOPPER,HINDPETRO,HINDUNILVR,HONAUT,HDFC,ICICIBANK,ICICIGI,ICICIPRULI,IDFCFIRSTB,IDFC,IBULHSGFIN,INDIAMART,IEX,IOC,IRCTC,IGL,INDUSTOWER,INDUSINDBK,NAUKRI,INFY,INDIGO,IPCALAB,ITC,JINDALSTEL,JKCEMENT,JSWSTEEL,JUBLFOOD,KOTAKBANK,L&TFH,LTTS,LTI,LT,LAURUSLABS,LICHSGFIN,LUPIN,MGL,M&MFIN,M&M,MANAPPURAM,MARICO,MARUTI,MFSL,METROPOLIS,MINDTREE,MOTHERSUMI,MPHASIS,MRF,MCX,MUTHOOTFIN,NATIONALUM,NAVINFLUOR,NBCC,NESTLEIND,NAMINDIA,NMDC,NTPC,OBEROIRLTY,ONGC,OFSS,PAGEIND,PERSISTENT,PETRONET,PFIZER,PIIND,PIDILITIND,PEL,POLYCAB,PFC,POWERGRID,PNB,PVR,RAIN,RBLBANK,RECLTD,RELIANCE,SBICARD,SBILIFE,SHREECEM,SRTRANSFIN,SIEMENS,SRF,SBIN,SAIL,STAR,SUNPHARMA,SUNTV,SYNGENE,TATACHEM,TATACOMM,TCS,TATACONSUM,TATAMOTORS,TATAPOWER,TATASTEEL,TECHM,FEDERALBNK,INDIACEM,INDHOTEL,RAMCOCEM,TITAN,TORNTPHARM,TORNTPOWER,TRENT,TVSMOTOR,ULTRACEMCO,UBL,MCDOWELLN,UPL,VEDL,IDEA,VOLTAS,WHIRLPOOL,WIPRO,ZEE";


    public ContractServices(OptionsRepo optionsRepo, MyContractRepo contractRepo, CustomBarRepo barRepo) {
        historicalDataList = new ArrayList<>();
        barMap = new HashMap<>();
        signal = new EJavaSignal();
        clientSocket = new EClientSocket( this, signal);
        df.setRoundingMode(RoundingMode.HALF_UP);
        this.optionsRepo = optionsRepo;
        this.contractRepo = contractRepo;
        this.barRepo = barRepo;
        localDateTime = LocalDateTime.now();
    }

    private final OptionsRepo optionsRepo;

    private final MyContractRepo contractRepo;

    private final CustomBarRepo barRepo;


    public CustomBar getToday() {
        return today;
    }

    public void setToday(CustomBar today) {
        this.today = today;
    }

    @Override
    public void historicalData(int reqId, Bar bar) {
        historicalDataList.add(bar);
//        System.out.println("HistoricalData:  " + EWrapperMsgGenerator.historicalData(reqId, bar.time(), bar.open(), bar.high(), bar.low(), bar.close(), bar.volume(), bar.count(), bar.wap()));
//        EWrapperMsgGenerator.historicalData(reqId, bar.time(), bar.open(), bar.high(), bar.low(), bar.close(), bar.volume(), bar.count(), bar.wap());
    }


    @Override
    public void realtimeBar(int reqId, long time, double open, double high, double low, double close, long volume, double wap, int count) {
        System.out.println("RealTimeBar: " + EWrapperMsgGenerator.realtimeBar(reqId, time, open, high, low, close, volume, wap, count));
        today = new CustomBar(String.valueOf(time), open, high, low, close, volume, wap, count);
    }

    public boolean connect(int clientId) {
        if(clientSocket.isConnected())
            return true;
        clientSocket.eConnect("127.0.0.1", 7496, clientId);
        if (clientSocket.isConnected()) {
            System.out.println("Connected to Tws server version " +
                    clientSocket.serverVersion() + " at " +
                    clientSocket.getTwsConnectionTime());
        } else
            return false;


        eReader = new EReader(clientSocket, signal);

        eReader.start();

        connectionThread = new Thread(() -> {
            processMessages();

            int i = 0;
            System.out.println(i);
        });
        connectionThread.setName("IB_THREAD" + 112233);
        connectionThread.start();
        return true;
    }

    private void processMessages() {

        while (clientSocket.isConnected()) {
            signal.waitForSignal();
            try {
                eReader.processMsgs();
            } catch (Exception e) {
                error(e);
            }
        }
    }

    public void getHistoricalDataFromAPI(Contract contract) {
        historicalDataList = new ArrayList<>();
        Calendar cal = Calendar.getInstance();
//        localDateTime.minusDays(1);
//        SimpleDateFormat form = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
        String date = localDateTime.toString()
                .substring(0,localDateTime.minusDays(1).toString().length()-4)
                .replace("T", " ")
                .replace("-", "");

        // req historical data
        clientSocket.reqHistoricalData(1, contract, date, "1 Y", "1 day", "TRADES", 1, 1, false, null);

    }

    public void getHistoricalDataFromAPI(Contract contract, String customDate) {
        historicalDataList = new ArrayList<>();
        clientSocket.reqHistoricalData(1, contract, customDate, "1 Y", "1 day", "TRADES", 1, 1, false, null);

    }

    public void getYdayHistoricalDataFromAPI(Contract contract) {
        historicalDataList = new ArrayList<>();
        String date = localDateTime.toString()
                .substring(0,localDateTime.minusDays(1).toString().length()-4)
                .replace("T", " ")
                .replace("-", "");

        clientSocket.reqHistoricalData(1, contract, date, "2 D", "1 day", "TRADES", 1, 1, false, null);

    }

    public void liveData(Contract contract, int tickerID) {
        clientSocket.reqRealTimeBars(tickerID, contract, 5, "TRADES", true, null);
    }

    public void cancelLiveData(int tickerId) {
        clientSocket.cancelRealTimeBars(tickerId);
    }

    /**
     * @param bars   historical bars of contract
     * @param period number of days of EMA
     * @return custom bars with calculated data
     */
    public List<CustomBar> calculateEmaForAll(List<CustomBar> bars, int period) {
        if(bars == null || bars.isEmpty())
            return null;

//        System.out.println("EMA  ::::: ");

        //        EMA: {Close - EMA(previous day)} x multiplier + EMA(previous day)
        //        (600.5 + 623.15 + 615.3 + 617.8 + 614.5)/5 = 614.25

        double total = 0.00;
        double multiplier = 2.00 / (period + 1);
        int barCount = 0;
        double sma = 0.00;
        double ema = 0.00;
        double emaPrev;
        boolean firstEma = true;
        for (int i = 0; i < bars.size(); i++) {
            CustomBar bar = bars.get(i);
            total += bar.getClose();
            barCount++;
            if (period == barCount) {
                sma = total / period;
//                System.out.print("SMA of " + period + " days: " + df.format(sma) + " ::::: ");
                emaPrev = Double.parseDouble(df.format(ema));
                if (firstEma) {
                    ema = sma;
//                    System.out.println("EMA of " + period + " days: " + df.format(ema));
                    firstEma = false;
                } else {
                    ema = (bars.get(i).getClose() - emaPrev) * multiplier + emaPrev;
//                    System.out.println("EMA of " + period + " days: " + df.format(ema));
                }
                barCount--;
                total -= bars.get(i - (period - 1)).getClose();
            }

            if (period == 3) {
                bar.setEmaThreeDays(Double.parseDouble(df.format(ema)));
            }
            else
                bar.setEmaFiveDays(Double.parseDouble(df.format(ema)));

        }
        return bars;

    }

    public List<CustomBar> calculateTwentyDaysSmma(List<CustomBar> bars) {
        if(bars == null || bars.isEmpty())
            return null;

        int period = 20;
        double total = 0.00;
        int barCount = 0;
        double sma = 0.00;
        double smma = 0.00;
        double smmaPrev;
        boolean firstEma = true;
        for (int i = 0; i < bars.size(); i++) {
            CustomBar bar = bars.get(i);
            total += bar.getClose();
            barCount++;
            if (period == barCount) {
                sma = total / period;
//                System.out.print("SMA of " + period + " days: " + df.format(sma) + " ::::: ");
                smmaPrev = Double.parseDouble(df.format(smma));
                if (firstEma) {
                    smma = sma;
//                    System.out.println("SMMA of " + period + " days: " + df.format(smma));
                    firstEma = false;
                } else {
                    smma = ((smmaPrev * period) - smmaPrev + bar.getClose()) / period;
//                    System.out.println("SMMA of " + period + " days: " + df.format(smma));
                }
                barCount--;
                total -= bars.get(i - (period - 1)).getClose();
            }
            bar.setSmmaTwentyDays(Double.parseDouble(df.format(smma)));
            bar.setSmaTwentyDays(Double.parseDouble(df.format(sma)));
        }

        return bars;
    }

    public synchronized boolean shortCheck(CustomBar today, CustomBar yday) {
        boolean shortFlag = false;
        if(today == null || yday == null) {
            System.out.println("Null Object today or yday" );
            return shortFlag;
        }
        if (today.getClose() < today.getOpen()) {
            if((today.getSmaTwentyDays() * 102 / 100) < today.getLow()) {
                if (yday.getEmaThreeDays() < yday.getLow()) // short  || yday.getEmaThreeDays() < yday.low()
                    shortFlag = true;
            }

        }
        if (shortFlag) {
            saveContractOption(today.getSymbol(), today, yday, "SHORT");
        } else
            System.out.println("Do not Short " + today.getSymbol()); // nothing

        return shortFlag;
    }

    public synchronized boolean longCheck(CustomBar today, CustomBar yday) {
        boolean longFlag = false;
        if(today == null || yday == null) {
            System.out.println("Null Object today or yday" );
            return longFlag;
        }
        if (today.getClose() > today.getOpen()) {
            if((today.getSmaTwentyDays() * 95 / 100) > today.getHigh()) {
                if (yday.getEmaThreeDays() > yday.getHigh()) // short  || yday.getEmaThreeDays() < yday.low()
                    longFlag = true;
            }

        }
        if (longFlag) {
            saveContractOption(today.getSymbol(), today, yday, "LONG");
        } else
            System.out.println("Do not Long " + today.getSymbol()); // nothing

        return longFlag;
    }

    private void saveContractOption(String name, CustomBar today, CustomBar yday, String action) {
        ContractOptions option = new ContractOptions();
        option.setClosePrice(today.getClose());
        option.setName(name);
        option.setLowestLow(Math.min(today.getLow(), yday.getLow()));
        option.setTime(today.getTime());
        option.setDate(new Timestamp(System.currentTimeMillis()));
        option.setSma20(today.getSmaTwentyDays());
        option.setClosePrice(today.getClose());
        option.setSmaCloseDiff(today.getSmaTwentyDays() - today.getClose());
        option.setSmaCloseDiffPer(Double.parseDouble(df.format(((today.getSmaTwentyDays() - today.getClose())/today.getSmaTwentyDays())*100)));
        option.setRecommendation(action);
        optionsRepo.save(option);

        System.out.println(action + " :: " + today.getSymbol() + " -> " + option.getClosePrice());
        System.out.println("SMA 20 days today :: " + option.getSma20());
        System.out.println("SMA - CP % :: " + option.getSmaCloseDiffPer() + "%");
        System.out.println("EMA 3 days today :: " + today.getEmaThreeDays());

//        stock name + close price + (20days sma)moving avg + ((cp-sma)/sma * 100)
        System.out.println(option.getSma20());
    }

    public void stopLossCheck(ContractOptions contractOptions) {

    }

    public List<Bar> getHistoricalDataList() {
        return historicalDataList;
    }

    public HashMap<Contract, List<CustomBar>> getBarMap() {
        return barMap;
    }

    public Thread getConnectionThread() {
        return connectionThread;
    }

    public Contract checkContractInDb(String symbol) {
        MyContract c = contractRepo.findBySymbol(symbol);
        if(c == null) {
            c = new MyContract();
            c.setCurrency("INR");
            c.setExchange("NSE");
            c.setSecType("STK");
            c.setSymbol(symbol);
            c.setCountry("INDIA");
            contractRepo.save(c);
        }

        Contract contract = new Contract();
        contract.secType("STK");
        contract.exchange("NSE"); // changed to NSE for real time and historical data together
        contract.currency("INR");
        contract.symbol(symbol);
        return contract;
    }

    public CustomBar checkHistoricalData(Contract contract) {
        Iterable<CustomBar> bars = barRepo.findAllBySymbolOrderByBarIdDesc(contract.symbol());
        Iterator<CustomBar> iterator = bars.iterator();
        if(iterator.hasNext()) {
            CustomBar yday = iterator.next();
            return yday;
        } else
            return null;
    }

    public void pushHistoricalData(Contract contract) {
        List<Bar> bars = getHistoricalDataList();
        customBars = new ArrayList<>();

        bars.forEach(bar1 -> {
            customBars.add(new CustomBar(bar1.time(), bar1.open(), bar1.high(), bar1.low(),
                    bar1.close(), bar1.volume(), bar1.wap(), bar1.count(), contract.symbol()));
        });

        calculateEmaForAll(customBars, 3);
        calculateEmaForAll(customBars, 5);
        calculateTwentyDaysSmma(customBars);

        if (!barMap.containsKey(contract))
            barMap.put(contract, customBars);
        else
            barMap.get(contract).addAll(customBars);
        barRepo.saveAll(customBars);

    }

    public void pushHistoricalData(Contract contract, CustomBar yday) {
         // should have only 1 row
        customBars = new ArrayList<>();
//        customBars.add(yday); // or uncomment this and change get 0 to 1 at line updateTodayEmaSma
        getHistoricalDataList().forEach(bar1 -> {
            customBars.add(new CustomBar(bar1.time(), bar1.open(), bar1.high(), bar1.low(),
                    bar1.close(), bar1.volume(), bar1.wap(), bar1.count(), contract.symbol()));
        });

        if(customBars.size() > 0) {
            if (!yday.getTime().equals(customBars.get(0).getTime())) {
                updateTodayEmaSma(customBars.get(0), yday);

                if (!barMap.containsKey(contract))
                    barMap.put(contract, customBars);
                else
                    barMap.get(contract).addAll(customBars);

                barRepo.save(customBars.get(0));
                System.out.println("Yesterday Bar saved for " + contract.symbol());
            } else {
                customBars.remove(0);
                customBars.add(yday); // add yday to bar and to barRepo for calculations
                barMap.put(contract, customBars);
                System.out.println("Yesterday Bar exists in database for " + contract.symbol());
            }
        } else {
            System.out.println("No Yesterday Bar for " + contract.symbol());
        }

    }

    public void updateTodayEmaSma(CustomBar today, CustomBar yday) {
        double multiplier = 2.00 / (3 + 1); //3 days
        today.setEmaThreeDays(Double.parseDouble(df.format((today.getClose() - yday.getEmaThreeDays()) * multiplier + yday.getEmaThreeDays())));

        multiplier = 2.00 / (5 + 1); // 5 days
        today.setEmaFiveDays(Double.parseDouble(df.format((today.getClose() - yday.getEmaFiveDays()) * multiplier + yday.getEmaFiveDays())));

        today.setSmmaTwentyDays(Double.parseDouble(df.format(((yday.getSmmaTwentyDays() * 20) - yday.getSmmaTwentyDays() + today.getClose()) / 20)));


        Iterable<CustomBar> bars = barRepo.findAllBySymbolOrderByBarIdDesc(today.getSymbol());

        Iterator<CustomBar> list = bars.iterator();

        double total = 0;
        int barCount = 0;
        int period = 20;
        while (list.hasNext()) {
            CustomBar bar = list.next();
            total += bar.getClose();
            barCount++;
            if (period == barCount) {
                today.setSmaTwentyDays(Double.parseDouble(df.format(total/period)));
                break;
            }
        }
    }
}
