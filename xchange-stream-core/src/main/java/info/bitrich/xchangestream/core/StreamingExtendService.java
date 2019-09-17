package info.bitrich.xchangestream.core;

import org.knowm.xchange.currency.CurrencyPair;
import org.knowm.xchange.dto.marketdata.OrderBookUpdate;
import org.knowm.xchange.exceptions.NotYetImplementedForExchangeException;

import io.reactivex.Observable;

public interface StreamingExtendService {
	
	default Observable<OrderBookUpdate> getOrderBookUpdate(CurrencyPair currencyPair, Object... args) {
		throw new NotYetImplementedForExchangeException();
	}
	
//	default Observable<CandleLine> getCandleLine(CurrencyPair currencyPair, Object... args) {
//		throw new NotYetImplementedForExchangeException();
//	}

}
