import io.github.mainstringargs.alphavantagescraper.AlphaVantageConnector;
import io.github.mainstringargs.alphavantagescraper.StockQuotes;
import io.github.mainstringargs.alphavantagescraper.output.AlphaVantageException;

public class AlphaVantageAdapter implements ServicoCotacao {
    @Override
    public Cotacao getCotacao(String codEmpresa) {
        final String s = System.getenv("ALPHAVANTAGE_APIKEY");
        final String apiKey = s == null ? "50M3AP1K3Y" : s;
        final int timeout = 3000;

        var apiConnector = new AlphaVantageConnector(apiKey, timeout);
        var stockQuotes = new StockQuotes(apiConnector);

        try {
            var response = stockQuotes.quote(codEmpresa);
            var stock = response.getStockQuote();

            var cotacao = new Cotacao(
                    codEmpresa,
                    stock.getPrice());
            cotacao.setData(stock.getLatestTradingDay());
            return cotacao;
        } catch (AlphaVantageException e) {
            return new Cotacao();
        }
    }
}
